/* Andrew Kulpa
   animates a
   moving ball */

public class MovingBall
{
   public static void main(String[]args)
   {
      double x = 0;
      double y = 0;
      do
      {
         StdDraw.circle(x,y,.1);
         x = x + .0001;
         y = y + .00001;
      }while(x <= 1);
   }
}