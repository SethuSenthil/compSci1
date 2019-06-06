public class Hero
{
	private double x;
	private double y;

	public Hero()
	{
		x = 100.0;
		y = 100.0;
	}

	public Hero(String name)
	{

	}

	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}

	public void moveRight()
	{
		x ++;
	}

	public void moveX(double a)
	{
		x+= a;
	}

	public void moveToXY(double a , double b)
	{
		x = a;
		y = b;
	}

	public void moveY(double a)
	{
		y+= a;
	}


}