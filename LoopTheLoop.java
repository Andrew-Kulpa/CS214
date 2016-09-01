public class LoopTheLoop
{
   public static void main(String[]args)
   {
      int i = 2;
      int j = 0;
      while (j <= 4)
      {
         i = i + j;
         j = j + 2;
      }
      System.out.println(i);
   }
}