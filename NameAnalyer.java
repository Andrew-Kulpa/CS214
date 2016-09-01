/*Andrew Kulpa
   Asks for a name
   and analyzes it
   and outputs abbreviations
   and information of the like */

public class NameAnalyer
{
   public static void main(String[]args)
   {
      System.out.print("Enter your first name: ");
      String FirstName = StdIn.readLine();
      System.out.print("Enter your last name: ");
      String LastName = StdIn.readLine();
      System.out.println(FirstName);
      System.out.println(LastName);
      
      char FirstInitial = FirstName.charAt(0);
      char LastInitial = LastName.charAt(0);
      System.out.println(FirstInitial + LastInitial);
      
      if(FirstName.equals("Thomas"))
      {
         System.out.println("Tom");
      }
      else if(FirstName.equals("Richard"))
      {
         System.out.println("Rich");
      }
      else if(FirstName.equals("Joseph"))
      {
         System.out.println("Joe");
      }
   }
}