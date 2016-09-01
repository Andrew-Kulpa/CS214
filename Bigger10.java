/* Andrew Kulpa
   allows any number of 
   integers put into
   run arguments to be
   printed if they are
   greater than 10 */

public class Bigger10
{
   public static void main(String[] args)
   {
      for(int i=0;i<args.length;i++)
      {
         if (Integer.parseInt(args[i])>10)
         {
            System.out.println(args[i]);
         }
      }
   }
}