public class GradeBook
{
	public static void main(String[] args)
	{
		//1. Declare the array
		int[] grades;
		
		//2. Create the array
		grades = new int[5];
		
		//3. Initialize the values in the array
		System.out.print("Enter grade 1: ");
		grades[0] = StdIn.readInt();
		System.out.print("Enter grade 2: ");
		grades[1] = StdIn.readInt();
		System.out.print("Enter grade 3: ");
		grades[2] = StdIn.readInt();
		System.out.print("Enter grade 4: ");
		grades[3] = StdIn.readInt();
		System.out.print("Enter grade 5: ");
		grades[4] = StdIn.readInt();
		double avggrade = 0;
		int i;
		
		//print out the array
		for (i=0;i<grades.length;i++)
		{
			avggrade = avggrade + grades[i];
			System.out.print(grades[i]);
			if (grades[i]>=90)
			{
				System.out.println(" A");
			}
			else if (grades[i]>=80)
			{
				System.out.println(" B");
			}
			else if (grades[i]>=70)
			{
				System.out.println(" C");
			}
			else if (grades[i]>=60)
			{
				System.out.println(" D");
			}
			else
			{
				System.out.println(" F");
			}
		}
		System.out.print(avggrade / i);
		if ((avggrade / i)>=90)
			{
				System.out.println(" A");
			}
			else if ((avggrade / i)>=80)
			{
				System.out.println(" B");
			}
			else if ((avggrade / i)>=70)
			{
				System.out.println(" C");
			}
			else if ((avggrade / i)>=60)
			{
				System.out.println(" D");
			}
			else
			{
				System.out.println(" F");
			}
	}
}
		