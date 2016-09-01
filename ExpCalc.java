/* Andrew Kulpa
   Simple exponent
   calculator */

public class ExpCalc
{
   public static void main(String[]args)
   {
      double base;
      double exponent;
      System.out.print("what is the base? ");
      base = StdIn.readDouble();
      System.out.print("What is the exponent? ");
      exponent = StdIn.readDouble();
      System.out.println(Math.pow(base,exponent));
   }
}