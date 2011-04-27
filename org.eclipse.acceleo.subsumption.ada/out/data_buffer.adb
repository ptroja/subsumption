package body Data_Buffer is

   procedure Set (Buffer : out Buffer_Type; An_Item : in  Data_Type) is
   begin
      Buffer.Data := An_Item;
      Buffer.Fresh := True;
   end Set;

   function Get (Buffer : in Buffer_Type) return Data_Type is
   begin
      return Buffer.Data;
   end Get;

   procedure MarkAsUsed (Buffer : out Buffer_Type) is
   begin
      Buffer.Fresh := False;
   end MarkAsUsed;

   function isFresh (Buffer : in Buffer_Type) return Boolean is
   begin
      return Buffer.Fresh;
   end isFresh;

end Data_Buffer;
