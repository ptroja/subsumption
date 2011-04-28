with Ada.Real_Time; use Ada.Real_Time;

-- Module buffers
with foo_buffers; use foo_buffers;
-- Module main operation function
with foo_operation;

-- Modules with inputs connected with the output wires
with bar_module;
-- Modules with suppressors connected with the output wires
with bar_module;
-- Modules with inhibitors connected with the output wires


package body foo_module is


   type inhibited_output is (Y1, Y2);
   type inhibition_state_t is array (inhibited_output) of Boolean;
   type inhibition_time_t is array (inhibited_output) of Time;

   ----------------------
   -- Protected_IO --
   ----------------------
   
   -- Protected type for holding status of asynchronous calls to the agent
   protected Protected_IO is
      -- Get the current state of the module wires
      procedure Get_Current_IO
      (
         current_inputs     : out inputs_t;
         current_inhibition : out inhibition_state_t
      );
      -- Procedures for transmitting data to particulars buffers
      procedure Transmit_X1 (item : in X1_Buffer.Buffer_Data_Type);
      procedure Transmit_X2 (item : in X2_Buffer.Buffer_Data_Type);
      procedure Inhibit_Y1_1;
      procedure Inhibit_Y2_1;
   private
      -- Internal, protected copy of the data
      inputs_state     : inputs_t;
      inhibited        : inhibition_state_t  := (others => False);
      inhibition_time  : inhibition_time_t;


      -- Helper routines
      procedure record_inhibition (output : in inhibited_output; time   : in Time_Span);

   end Protected_IO;

   ---------------------------
   -- Protected_IO body --
   ---------------------------

   protected body Protected_IO is
      procedure Get_Current_IO
      (
         current_inputs     : out inputs_t;
         current_inhibition : out inhibition_state_t
      )
      
      is
         now : constant Time := Clock;
      begin
         -- Check if inhibitors have not already expired
         for output in inhibited_output'Range loop
            if inhibited (output) and inhibition_time (output) < now then
               inhibited (output) := False;
            end if;
         end loop;
         -- Copy the current status of the inhibitors
         current_inhibition := inhibited;
         -- Copy the current status of the input lines
         current_inputs := inputs_state;
         -- Mark input data buffers as used
         X1_Buffer.MarkAsUsed (inputs_state.X1);
         X2_Buffer.MarkAsUsed (inputs_state.X2);
      end Get_Current_IO;

      procedure Transmit_X1 (item : in X1_Buffer.Buffer_Data_Type) is
      begin
         inputs_state.X1.Set (item);
      end Transmit_X1;
      procedure Transmit_X2 (item : in X2_Buffer.Buffer_Data_Type) is
      begin
         inputs_state.X2.Set (item);
      end Transmit_X2;
      
      procedure Inhibit_Y1_1 is
      begin
         record_inhibition (Y1, Milliseconds (3000));
      end Inhibit_Y1_1;      
      procedure Inhibit_Y2_1 is
      begin
         record_inhibition (Y2, Milliseconds (9000));
      end Inhibit_Y2_1;      

      procedure record_inhibition (output : in inhibited_output; time : in Time_Span) is
      begin
         inhibition_time (output) := Clock + time;
         inhibited (output)       := True;
      end record_inhibition;      

   end Protected_IO;

   task Main is
      -- Set this if default stack size is not appropriate
      -- pragma Storage_Size(4096);
   end Main;

   current_inhibition_state : inhibition_state_t;

   task body Main is
      -- System_Time.System_Start_Time;
      Next_Time      : Ada.Real_Time.Time := Ada.Real_Time.Clock;
      current_inputs : inputs_t;
      next_outputs   : outputs_t;
   begin
      -- TODO: call the initialization routine
      -- (if not done by the Ada.Finalization)

      loop
         delay until Next_Time;

         -- Get the current state of the module wires
         Protected_IO.Get_Current_IO (
            current_inputs => current_inputs,
            current_inhibition => current_inhibition_state
         );

         -- Evaluate the module main function
         next_outputs := foo_operation.operation (current_inputs);
         
         -- Check if data output has been requested and send it out
         if next_outputs.Y1.isFresh then
            Send_Y1 (next_outputs.Y1.Get);
         end if;
         if next_outputs.Y2.isFresh then
            Send_Y1 (next_outputs.Y2.Get);
         end if;

         -- Set the next wakeup time
         Next_Time := Next_Time + Ada.Real_Time.Milliseconds (1000);
      end loop;
   end Main;

   -- local access to the output buffers
   procedure Send_Y1 (item : in Y1_Buffer.Buffer_Data_Type) is
   begin
      if not current_inhibition_state (Y1) then
         bar_module.Transmit_X1 (item);
         bar_module.Transmit_X2 (item);
      end if;
   end Send_Y1;

   procedure Send_Y2 (item : in Y2_Buffer.Buffer_Data_Type) is
   begin
      if not current_inhibition_state (Y2) then
         bar_module.Suppress_X2_1 (item);
      end if;
   end Send_Y2;

   -- remote access to the input buffers
   procedure Transmit_X1 (item : in X1_Buffer.Buffer_Data_Type) is
   begin
      Protected_IO.Transmit_X1 (item);
   end Transmit_X1;

   procedure Transmit_X2 (item : in X2_Buffer.Buffer_Data_Type) is
   begin
      Protected_IO.Transmit_X2 (item);
   end Transmit_X2;

   -- remote access to the output inhibitors
   procedure Inhibit_Y1_1 is
   begin
      Protected_IO.Inhibit_Y1_1;
   end Inhibit_Y1_1;

   procedure Inhibit_Y2_1 is
   begin
      Protected_IO.Inhibit_Y2_1;
   end Inhibit_Y2_1;
   
   -- remote access to the input suppressors

end foo_module;
