public class Hero extends Food
{
	private int x;
	private int y;

	public Hero()
	{
		x = 100;
		y = 100;
	}

	public Hero(String name, int health)
	{
		x = 100;
		y = 100;
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

	public void moveRight()
	{
		x ++;
	}

	public void moveX(int a)
	{
		x+= a;
	}

	public void moveToXY(int a , int b)
	{
		x = a;
		y = b;
	}

	public void moveY(int a)
	{
		y+= a;
	}


}