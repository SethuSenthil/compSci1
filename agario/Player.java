import static java.lang.System.*;

class Player implements Thing {
 private boolean isAlive = true;
 private double size = 5;
 private double mass = 0;
private double speed = 0;
private int x = 0;
private int y = 0;


 public void Player(){

 };
 public void setSize(double newSize){
   size = newSize;
 };

 public void speed(){

 };
 public double getSize(){
return 5.0;
 };
 public double getSpeed(){
return 5.0;
 };
 public void setSize(){

 };
  public boolean getAlive(){
    return isAlive;
 };

   public String toString(){
     return "Player --> speed: " + speed + " mass: " + size + "isAlive?: " + isAlive;
   }

public void moveX(int given){
	x = x + given;
}
public void moveY(int given){
	y = y + given;
}
public int getX(){
	return x;
}
public int getY(){
	return y;
}
 }