/* Andrew Kulpa
   Shows picture of
   result of two
   dice roll*/

public class DiceRoller3
{
   public static void main(String[]args)
   {
      int roll1 = (int)(Math.random()*6)+1;
      int roll2 = (int)(Math.random()*6)+1;
      
      if (roll1==1)
      {
         StdDraw.picture(.25,.75,"die_01_42158_mth.gif");
      }
      else if(roll1 == 2)
      {
         StdDraw.picture(.25,.75,"die_02_42159_mth.gif");
      }
      else if(roll1 == 3)
      {
         StdDraw.picture(.25,.75,"die_03_42160_mth.gif");
      }
      else if(roll1 == 4)
      {
         StdDraw.picture(.25,.75,"die_04_42161_mth.gif");
      }
      else if(roll1 == 5)
      {
         StdDraw.picture(.25,.75,"die_05_42162_mth.gif");
      }
      else
      {
         StdDraw.picture(.25,.75,"die_06_42164_mth.gif");
      }
      if (roll2 == 1)
      {
         StdDraw.picture(.75,.25,"die_01_42158_mth.gif");
      }
      else if(roll2 == 2)
      {
         StdDraw.picture(.75,.25,"die_02_42159_mth.gif");
      }
      else if(roll2 == 3)
      {
         StdDraw.picture(.75,.25,"die_03_42160_mth.gif");
      }
      else if(roll2 == 4)
      {
         StdDraw.picture(.75,.25,"die_04_42161_mth.gif");
      }
      else if(roll2 == 5)
      {
         StdDraw.picture(.75,.25,"die_05_42162_mth.gif");
      }
      else
      {
         StdDraw.picture(.75,.25,"die_06_42164_mth.gif");
      }
   }
}