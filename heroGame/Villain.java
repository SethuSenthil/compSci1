public class Villain
{
	private String name;
	private int health;

	public Villain() //default constructor, empty parentheses
	{
		name = "Hero";
		health = 10;
	}

	public Villain(String name, int health) //custom constructor
	{
		this.name = name;
		this.health = health;
	}

	public void setHealth(int damage)
	{
		health = health - damage;
		if (health < 0)
			health = 0;
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