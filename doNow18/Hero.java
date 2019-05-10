
public class Hero {
	private String name;
	private int health;
	public Hero(){
		name = "name";
		health = 100;
	}
	public Hero(String namee, int healthh){
		this.name = namee;
		this.health = healthh;
	}
	public String getName(){
		return name;
	}
	public int getHealth(){
		return health;
	}
	public void setHealth(int damage){
		 health -= damage;
	}
	public String toString(){
		return name + " " + health;
	}

}