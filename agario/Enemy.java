
import static java.lang.System.*;

 public class Enemy implements Thing {
	private boolean isAlive = true;
	private double size = 5;
	private double mass = 0;
	private double speed = 0;
 public Enemy(){

 };
 public void Enemy(int sizee){
   size = sizee; //sets the size (border radius) of Enemy
 };
 public void setSize(double x){

 };

 public void speed(){

 };
  public double getSpeed(){
    return 5.0;
  };

    public double getSize(){
            return 5.0;
  };
  public boolean getAlive(){
    return isAlive;
 };
   public void setAlive(boolean aliveVal){
    isAlive = aliveVal;
 };
  public void movement(){
    //quadratic set movement equeation
  };

  public String toString(){
    return "Enemy --> speed: " + speed + " mass: " + size + "isAlive?: " + isAlive;
  }


 }