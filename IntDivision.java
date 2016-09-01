public class IntDivision
{
	public static void main(String[]args)
	{
		int num1;
		int num2;

		System.out.print("First Number: ");
		num1 = StdIn.readInt();
		
		System.out.print("Second Number: ");
		num2 = StdIn.readInt();
		
		if (num2 == 0)
		{
			System.out.println("Invalid Input");
		}			
		else
		{
			int remainder = num1 % num2;
			if (remainder != 0)
			{	
				System.out.print(num1 + "/" + num2 + " = " + num1 / num2 + "r" + num1 % num2);
			}
			else
			{
				System.out.print(num1 + "/" + num2 + " = " + num1 / num2);
			}
		}
	}
}