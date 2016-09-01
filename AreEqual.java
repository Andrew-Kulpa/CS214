/* Andrew Kulpa
   Checks if all
   numbers are equal */

public class AreEqual
{
   public static void main(String[]args)
   {
      System.out.print("Enter a number: ");
      int num1 = StdIn.readInt();
      System.out.print("Enter a number: ");
      int num2 = StdIn.readInt();
      System.out.print("Enter a number: ");
      int num3 = StdIn.readInt();
      if ((num1==num2)&&(num2==num3))
      {
         System.out.println("equal");
      }
      else
      {
         System.out.println("not equal");
      }
   }
}