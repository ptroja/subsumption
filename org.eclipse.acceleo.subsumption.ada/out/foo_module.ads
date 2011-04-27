with foo_buffers; use foo_buffers;

package foo_module is
   -- This is remote interface to the agent
   pragma Remote_Call_Interface;

   -- remote access to the input buffers
   procedure Transmit_X1(item : in X1_Buffer.Buffer_Data_Type);
   procedure Transmit_X2(item : in X2_Buffer.Buffer_Data_Type);

   -- remote access to the input inhibitors
   procedure Inhibit_Y1_1;
   procedure Inhibit_Y2_1;
private
   procedure Send_Y1(item : Y1_Buffer.Buffer_Data_Type);
   procedure Send_Y2(item : Y2_Buffer.Buffer_Data_Type);
end foo_module;
