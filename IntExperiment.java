public class IntExperiment
{
	public static void main(String[]args)
	{
		double i;
		i = 2147483647; //That's 2,147,483,647
		System.out.println(i);
		i = (i + 10); //That's 2,147,483,657, right?
		System.out.println(i);
	}
}