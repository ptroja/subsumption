-- with Ada.Text_IO;
with Ada.Real_Time;

with foo_module;
with bar_module;

procedure sample is
   use Ada.Real_Time;
   X : Integer := 5;
   Next_Time : Time := Ada.Real_Time.Clock;
begin
   loop
      Next_Time := Next_Time + Ada.Real_Time.Seconds(1);
      delay until Next_Time;

      X := X + 1;

      -- Ada.Text_IO.Put_Line("sender...");
      foo_module.Transmit_X1(X);
   end loop;
end Sample;
