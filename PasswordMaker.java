public class PasswordMaker
{
	public static void main(String[]args)
	{
		System.out.print("First name: ");
		String firstName = StdIn.readString();
		
		System.out.print("Last name: ");
		String lastName = StdIn.readString();
		
		System.out.print("Age: ");
		int age = StdIn.readInt() * 100;
		
		String initials = "" + firstName.charAt(firstName.length()/2) + lastName.charAt(lastName.length()/2);
		String password = initials + age;
		
		System.out.println("Your password is " + password);
	}
}