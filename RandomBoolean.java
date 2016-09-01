/*Andrew Kulpa
  created 100 random
  true and false variables
  inside of an array and
  prints out the amount of
  each as well as compares
  the two amounts */

public class RandomBoolean
{
	public static void main(String[] args)
	{
		System.out.println("Generating values...");
		int t = 0;
		int f = 0;
		boolean[] array = new boolean[100];
		for (int i = 0;i<array.length;i++)
		{
			double x = Math.random();
			if (x>0.5)
			{
				array[i] = true;
            t++;
			}
			else
			{
				array[i] = false;
            f++;
			}
		}
		System.out.println("true: " + t);
		System.out.println("false: " + f);
		if (t>f)
		{
			System.out.println("There are more true than false");
		}
		else if (f>t)
		{
			System.out.println("There are more false than true");
		}
		else
		{
			System.out.println("There are equal true and false");
		}
	}
}