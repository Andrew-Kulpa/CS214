public class DoubleHelix
{
	public static void main(String[] args)
	{
		System.out.print("enter a gene: ");
		String gene = StdIn.readLine();
		
		int i = 0;
		while (i< gene.length())
		{
			if (gene.charAt(i) == 'A')
			{
				System.out.print("T");
			}
			else if (gene.charAt(i) == 'T')
			{
				System.out.print("A");
			}
			else if (gene.charAt(i) == 'C')
			{
				System.out.print("G");
			}
			else if (gene.charAt(i) == 'G')
			{
				System.out.print("C");
			}
			i++;
		}
	}
}