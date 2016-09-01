public class fragment2
{
	public static void main(String[]args)
	{
		System.out.print("Year: ");
		int year = StdIn.readInt();
		
		if (year % 4 == 0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a Leap Year");
		}
	}
}