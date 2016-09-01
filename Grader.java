public class Grader
{
	public static void main(String[]args)
	{
		System.out.print("Enter the percentage: ");
		double pct = StdIn.readDouble();
		
		if (pct >=90)
		{
			System.out.print("A");
			if (pct <= 92.5)
			{
				System.out.print("-");
			}
		}
		else if (pct >= 80)
		{
			System.out.print("B");
			if (pct <= 82.5)
			{
				System.out.print("-");
			}
			else if (pct >= 87.5)
			{
				System.out.print("+");
			}
		}
		else
		{
			System.out.println("F");
		}
	}
}