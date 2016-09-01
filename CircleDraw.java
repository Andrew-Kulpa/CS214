/* Andrew Kulpa
	Draws a circle
	via user input */
	
public class CircleDraw
{
	public static void main(String[]args)
	{
		double radius;
		System.out.print("Enter the radius of the circle: ");
		radius = StdIn.readDouble();
		StdDraw.circle(0.5,0.5,radius);
	}
}