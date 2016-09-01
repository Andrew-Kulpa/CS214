/* Andrew Kulpa
   Calculates height
   in feet */

public class HeightCalculator
{
   public static void main(String[]args)
   {
      System.out.print("Enter your height in inches: ");
      double height = StdIn.readDouble();
      double feet = (height / 12);
      System.out.printf("You are %.2f feet tall.",feet);
   }
}