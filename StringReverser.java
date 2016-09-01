/*Andrew Kulpa
   Asks for some test
   and reverses it */


public class StringReverser
{
   public static void main(String[]args)
   {
      System.out.print("Enter some text: ");
      String text = StdIn.readLine();
      int character = text.length();
      while (character > 0)
      {
         System.out.print(text.charAt(character-1));
         character--;
      }
   }
}