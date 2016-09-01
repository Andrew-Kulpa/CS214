public class GeneAnalysis
{
	public static void main(String[] args)
	{
		System.out.print("Enter a gene: ");
		String gene = StdIn.readLine();
		int aCount = 0;
		int tCount = 0;
		int cCount = 0;
		int gCount = 0;
		int gtCount = 0;
		
		int i = 0;
		while(i < gene.length())
		{
			if (gene.charAt(i) == 'A')
			{
				aCount++;
			}
			else if (gene.charAt(i) == 'T')
			{
				tCount++;
			}
			else if (gene.charAt(i) == 'C')
			{
				cCount++;
			}
			else if (gene.charAt(i) == 'G')
			{
				gCount++;
				if (i+1 < gene.length())
				{
					if (gene.charAt(i+1) == 'T')
					{
						gtCount++;
					}
				}
			}
			i++;
		}
		System.out.println("A: " + aCount);
		System.out.println("T: " + tCount);
		System.out.println("C: " + cCount);
		System.out.println("G: " + gCount);
		System.out.println("GT: " + gtCount);
	}
}