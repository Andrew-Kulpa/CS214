/* Andrew Kulpa
   Simple Calculator*/

public class SimpleCalc
{
   public static void main(String[]args)
   {
      System.out.print("First number: ");
      Double num1 = StdIn.readDouble();
      System.out.print("Second number: ");
      Double num2 = StdIn.readDouble();
      
      System.out.print("1: Add\n2: Subtract\n3: Multiply\n4: Divide\nChoose: ");
      int operation = StdIn.readInt();
      if (operation == 1)
      {
         System.out.println(num1 + num2);
      }
      else if (operation == 2)
      {
         System.out.println(num1 - num2);
      }
      else if (operation == 3)
      {
         System.out.println(num1 * num2);
      }
      else if (operation == 4)
      {
         System.out.println(num1 / num2);
      }
   }
}   