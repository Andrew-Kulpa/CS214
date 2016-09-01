/* Andrew Kulpa
   creates a shuffled
   list of 10 numbers generated
   from 20 random numbers */


public class Shuffler
{
   public static void main(String[] args)
   {
      int[] arr = new int[10];
      int y = 0;
      for (int i=0;i<arr.length;i++)
      {
         int x = (int)((Math.random()*21));
         int frequency = 1;
         while (frequency != 0)
         {
            for (int j = 0; j<arr.length;j++)
            { 
               if (x == arr[j])
               {
                   frequency = frequency + 1;
               }
            }
            if (frequency == 1)
            {
               frequency = 0;
            }
            else
            {
               x = (int)(Math.random()*21);
               frequency = 1;
            }
         }
         arr[i] = x;
         System.out.print(" " + arr[i] + " ");
      }
   }
}
