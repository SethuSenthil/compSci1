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
	private double size = 5;
	private double mass = 0;
	private double speed = 0;
	private int x = 0;
	private int y = 0;
    private GraphicsContext gmc;
    private Rectangle2D rect;
 public void Food(){

 };
 public void size(double ssize){

 };

 public double getSpeed(){
   return speed;
 };

  public double getSize(){
	  return size;

 };

   public void speed(){
 };
   public void setSize(double ssize){
     size = ssize;
 };
 public boolean getAlive(){
      return isAlive;
 };
 public void createFood(int ranX, int ranY,GraphicsContext gcc){
       x = ranX;
       y = ranY;
       gmc = gcc;
 			     rect = new Rectangle2D( x, y,20,20);
 		   		 gmc.fillRect(x, y, 20, 20);
}
public void paint(){
	gmc.fillRect(x, y, 20, 20);
}
 }