with bar_buffers; use bar_buffers;

package bar_module is
   -- This is remote interface to the agent
   pragma Remote_Call_Interface;

   -- remote access to the input buffers
   procedure Transmit_X1(item : in X1_Buffer.Buffer_Data_Type);
   procedure Transmit_X2(item : in X2_Buffer.Buffer_Data_Type);

   -- remote access to the input inhibitors
private
end bar_module;
