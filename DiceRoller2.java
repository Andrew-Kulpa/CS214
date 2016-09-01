/* Andrew Kulpa
   Shows 2 random
   in text format */

public class DiceRoller2
{
   public static void main(String[]args)
   {
      int roll1 = (int)(Math.random()*6)+1;
      int roll2 = (int)(Math.random()*6)+1;
      
      if (roll1==1)
      {
         System.out.println("\n O \n\n");
      }
      else if(roll1 == 2)
      {
         System.out.println("\n  O \n O \n");
      }
      else if(roll1 == 3)
      {
         System.out.println(" O \n O \n O \n");
      }
      else if(roll1 == 4)
      {
         System.out.println("O O\n\nO O");
      }
      else if(roll1 == 5)
      {
         System.out.println("O O\n O \nO O\n");
      }
      else
      {
         System.out.println("O O\nO O\nO O\nO O");
      }
      if (roll2 == 1)
      {
         System.out.println("\n O \n\n");
      }
      else if(roll2 == 2)
      {
         System.out.println("\n O \n O \n");
      }
      else if(roll2 == 3)
      {
         System.out.println(" O \n O \n O \n");
      }
      else if(roll2 == 4)
      {
         System.out.println("O O\n\nO O");
      }
      else if(roll2 == 5)
      {
         System.out.println("O O\n O \nO O\n");
      }
      else
      {
         System.out.println("O O\nO O\nO O\nO O");
      }
   }
}