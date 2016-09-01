/* Andrew Kulpa
   print Hello World
   n times */

public class AnyHellos
{
   public static void main(String[]args)
   {
      System.out.print("Enter a number: ");
      int n = StdIn.readInt();
      int k = 1;
      while (k <= n)
      {
         System.out.println("Hello World");
         k = k + 1;
      }
   }
}