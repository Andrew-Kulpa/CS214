/*Andrew Kulpa
   Asks for some test
   and reverses it */


public class StringReverser2
{
   public static void main(String[]args)
   {
      System.out.print("Enter some text: ");
      String text = StdIn.readLine();
      for (int i = text.length();i > 0;i--)
      {
         System.out.print(text.charAt(i-1));
      }
   }
}