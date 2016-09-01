public class IntOps
{
	public static void main(String[]args)
	{
		int q;
		int r;
		int p;
		int a;
		System.out.print("Enter a number: ");
		a = StdIn.readInt();
		int b;
		System.out.print("enter another number: ");
		b =  StdIn.readInt();
		
		p = a * b;
		q = a / b;
		r = a % b;
		
		System.out.println(a + "*" + b + "=" + p);
		System.out.println(a + "/" + b + "=" + q);
		System.out.println(a + "&" + b + "=" + r);
		System.out.println(a + "=" + q + "*" + b + "+" + r);
	}
}