   public class MathMethods
   {
      public static void main(String[] args)
      {
         int num1 = 10;
         int num2 = 20;
         System.out.println(printMax(num1, num2));
      }
   
      public static int printMax(int x, int y)
      {
			if (x > y)
            return x;
         else
            return y;
      }
   }