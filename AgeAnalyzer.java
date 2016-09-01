/* Andrew Kulpa
   Tell what
   you can do
   at any age */

public class AgeAnalyzer
{
   public static void main(String[]args)
   {
      System.out.print("Enter your age: ");
      int age = StdIn.readInt();
      if (age<12)
      {
         System.out.println("You can't do anything!");
      }
      else
      {
         if (age >= 12)
         {
            System.out.println("You can:\nBabysit");
         }
         if (age >= 16)
         {
            System.out.println("Driving");
         }
         if (age >= 18)
         {
            System.out.println("Buy tobacco\nBuy a lottery ticket");
         }
         if (age >= 21)
         {
            System.out.println("Gamble in a casino\nBuy alcohol");
         }
         if (age >= 25)
         {
            System.out.println("Rent a car");
         }
      }
   }
}