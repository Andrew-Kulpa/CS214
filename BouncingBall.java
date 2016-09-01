public class BouncingBall
{
	public static void main(String[] args)
	{
		double x = 0.5;
		double y = 0.5;
		double r = 0.02;
		double dx = Math.random() * (1/60.0) + .005;
		System.out.println(dx);
		double dy = Math.random() * (1/60.0) + .005;
		System.out.println(dy);
		while(true)
		{
			StdDraw.clear();
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(0.5, 0.5, 0.5);
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.filledCircle(x, y, r);
			x += dx;
			y += dy;
			StdDraw.show(1000/60);
			
			if (x + r >= 1 || x - r <= 0)
			{
				dx = -dx;
			}
			if (y + r >= 1 || y - r <= 0)
			{
				dy = -dy;
			}
		}
	}
}