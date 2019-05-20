public class Hero
{
	private String name;
	private int health;
	private int x;
	private int y;

	public Hero() //default constructor, empty parentheses
	{
		name = "Hero";
		health = 10;
		x = 100;
		y = 100;
	}

	public Hero(String name, int health) //custom constructor
	{
		this.name = name;
		this.health = health;
		x = 100;
		y = 100;
	}

	public void setHealth(int damage)
	{
		health = health - damage;
		if (health < 0)
			health = 0;
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

	public String getName()
	{
		return name;
	}

	public int getHealth()
	{
		return health;
	}

	public String toString()
	{
		return name + " " + health + " Health";
	}











}