with Data_Buffer;

package bar_buffers is
   pragma Remote_Types;

   -- Instances of the generic buffers for data and their status
   package X1_Buffer is new Data_Buffer (Integer);
   package X2_Buffer is new Data_Buffer (Integer);


   -- Data records extended with status of the particular buffers
   type inputs_t is
      record
         X1 : X1_Buffer.Buffer_Type;
         X2 : X2_Buffer.Buffer_Type;
      end record;


   -- Aliases for data types
   --- subtype X1_t is X1_Buffer.Buffer_Data_Type;   
   --- subtype X2_t is X2_Buffer.Buffer_Data_Type;   
end bar_buffers;
