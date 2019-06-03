import static java.lang.System.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.*;
import javafx.scene.media.AudioClip;
import java.net.URL;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.event.*;
import javafx.scene.input.*;
import javafx.scene.text.*;

class Food {
	private boolean isAlive = true;
	private int size = 20;
	private double mass = 0;
	private double speed = 0;
	private int x = 0;
	private int y = 0;
    private GraphicsContext gmc;
    private Rectangle2D rect;
    private Color theColor;
 public void Food(){

 };
 public void size(double ssize){

 };

 public double getSpeed(){
   return speed;
 };

  public int getSize(){
	  return size;

 };

   public void speed(){
 };
   public void setSize(int ssize){
     size = ssize;
 };
 public boolean getAlive(){
      return isAlive;
 };
 public void createFood(int ranX, int ranY,GraphicsContext gcc, Color theColorr){
       x = ranX;
       y = ranY;
       gmc = gcc;
       theColor = theColorr;
 			     rect = new Rectangle2D( x, y,20,20);
 		   		 gmc.fillOval(x, y, 20, 20);
}
public void createFood(int ranX, int ranY,GraphicsContext gcc, Color theColorr, int sizee){
       x = ranX;
       y = ranY;
       gmc = gcc;
       size = sizee;
       theColor = theColorr;
 			     rect = new Rectangle2D( x, y,size,size);
 		   		 gmc.fillOval(x, y, size, size);
}
public void paint(){
	gmc.fillOval(x, y, size, size);
	gmc.setFill(theColor);
}
public Rectangle2D getRect(){
	return rect;
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