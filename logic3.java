public class logic3
{
   public static void main(String[]args)
   {
      int i = 0;
      while (i < 100)
      {
         double x = Math.random();
         double y = Math.random();
         double r = Math.random();
         StdDraw.circle(x,y,r);
         i++;
      }
   }
}