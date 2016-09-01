/* Andrew Kulpa
   Sum of two
   dice rolls */

public class DiceRoller
{
   public static void main(String[]args)
   {
      int roll1;
      int roll2;
      roll1 = (int)(Math.random()*7);
      roll2 = (int)(Math.random()*7);
      System.out.println(roll1 + roll2);
   }
}