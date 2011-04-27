with Ada.Real_Time; use Ada.Real_Time;

-- Module buffers
with bar_buffers; use bar_buffers;
-- Module main operation function
with bar_operation;

-- Modules with inputs connected with the output wires
-- Modules with suppressors connected with the output wires
-- Modules with inhibitors connected with the output wires


package body bar_module is

   type input_with_suppressor is (X2);
   type suppression_state_t is array (input_with_suppressor) of Boolean;
   type suppression_time_t is array (input_with_suppressor) of Time;   


   ----------------------
   -- Shared_IO_Status --
   ----------------------
   
   -- Protected type for holding status of asynchronous calls to the agent
   protected Shared_IO_Status is
      -- Get the current state of the module wires
      entry Get_Current_IO
      (
         current_inputs     : out inputs_t
         
      );
      -- Procedures for transmitting data to particulars buffers
      procedure Transmit_X1 (item : in X1_Buffer.Buffer_Data_Type);
      procedure Transmit_X2 (item : in X2_Buffer.Buffer_Data_Type);
      procedure Suppress_X2_1 (item : in X2_Buffer.Buffer_Data_Type);
   private
      -- Internal, protected copy of the data
      inputs_state     : inputs_t;
      suppressed       : suppression_state_t := (others => False);
      suppression_time : suppression_time_t;

      -- Track changes of the input wires
      Changed : Boolean := False;

      -- Helper routines
      procedure record_suppression (input : in input_with_suppressor; time : in Time_Span);

   end Shared_IO_Status;

   ---------------------------
   -- Shared_IO_Status body --
   ---------------------------

   protected body Shared_IO_Status is
      entry Get_Current_IO
      (
         current_inputs     : out inputs_t
         
      )
      when Changed
      is
      begin
         -- Copy the current status of the input lines
         current_inputs := inputs_state;
         -- Mark input data buffers as used
         X1_Buffer.MarkAsUsed (inputs_state.X1);
         X2_Buffer.MarkAsUsed (inputs_state.X2);
         Changed := False;
      end Get_Current_IO;

      procedure Transmit_X1 (item : in X1_Buffer.Buffer_Data_Type) is
      begin
         inputs_state.X1.Set (item);
         Changed := True;
      end Transmit_X1;
      procedure Transmit_X2 (item : in X2_Buffer.Buffer_Data_Type) is
      begin
         -- Check if suppression has already expired
         if suppressed (X2) and suppression_time (X2) < Clock then
            suppressed (X2) := False;
         end if;
         -- and eventually store the new data
         if not suppressed (X2) then
            inputs_state.X2.Set (item);
            Changed := True;
         end if;
      end Transmit_X2;
      

      procedure Suppress_X2_1 (item : in X2_Buffer.Buffer_Data_Type) is
      begin
         record_suppression (X2, Milliseconds (3200));
         inputs_state.X2.Set (item);
      end Suppress_X2_1;

      procedure record_suppression (input : in input_with_suppressor; time : in Time_Span) is
      begin
         suppression_time (input) := Clock + time;
         suppressed (input)       := True;
         Changed                  := True;
      end record_suppression;
   end Shared_IO_Status;

   task Main is
      -- Set this if default stack size is not appropriate
      -- pragma Storage_Size(4096);
   end Main;


   task body Main is
      -- System_Time.System_Start_Time;
      current_inputs : inputs_t;
   begin
      -- TODO: call the initialization routine
      -- (if not done by the Ada.Finalization)

      loop

         -- Get the current state of the module wires
         Shared_IO_Status.Get_Current_IO (
            current_inputs => current_inputs
            
         );

         -- Evaluate the module main function
         bar_operation.operation (current_inputs);
         

      end loop;
   end Main;

   procedure Transmit_X1 (item : in X1_Buffer.Buffer_Data_Type) is
   begin
      Shared_IO_Status.Transmit_X1 (item);
   end Transmit_X1;

   procedure Transmit_X2 (item : in X2_Buffer.Buffer_Data_Type) is
   begin
      Shared_IO_Status.Transmit_X2 (item);
   end Transmit_X2;


end bar_module;