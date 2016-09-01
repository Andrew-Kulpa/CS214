/* Andrew Kulpa
	Calculates tips */

public class TipCalc
{
	public static void main(String[]args)
	{
		int bill;
		System.out.print("How much is the bill?");
		bill = StdIn.readInt();
		System.out.println("You should tip " + (bill * 0.15));
	}
}