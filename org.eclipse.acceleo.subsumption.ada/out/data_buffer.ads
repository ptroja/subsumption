generic
   type Data_Type is private;
package Data_Buffer is
   -- This package contains only data and computations on them
   pragma Pure;

   -- Create alias (compatible) data type
   subtype Buffer_Data_Type is Data_Type;

   -- Single buffer with a data
   type Buffer_Type is tagged private;

   -- Set the value and mark a value as fresh
   procedure Set (Buffer : out Buffer_Type; An_Item : in Data_Type);

   -- Get the value from a buffer
   function Get (Buffer : in Buffer_Type) return Data_Type;

   -- Mark the buffer as not fresh
   procedure MarkAsUsed (Buffer : out Buffer_Type);

   -- Check if the value in buffer has not been used
   function isFresh (Buffer : in Buffer_Type) return Boolean;

private
   type Buffer_Type is tagged record
      Data : Data_Type;
      Fresh : Boolean := False;
   end record;

end Data_Buffer;
