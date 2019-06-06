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
import java.util.ArrayList;

/*
TODO:
Score
*/

public class HeroGame extends Application implements EventHandler<InputEvent>
{
	GraphicsContext gc;
	Canvas canvas;
	Hero hero;
	Image h;
	AnimateObjects animate;
	int size = 100;
	double speed = 5.0;

	public void start(Stage stage)
	{

		stage.setTitle("Hero Game");
		Group root = new Group();
		canvas = new Canvas(800,400);
		root.getChildren().add(canvas);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		scene.addEventHandler(KeyEvent.KEY_PRESSED,this);
		gc = canvas.getGraphicsContext2D();
		hero = new Hero();
		h = new Image("hero.jpg");
		animate = new AnimateObjects();
		animate.start();
		stage.show();

	}
Color[] colors = {Color.web("0x3cba54"), Color.web("0xf4c20d"), Color.web("0xdb3236"), Color.web("0x4885ed")};
	ArrayList<Food> foodList = new ArrayList<Food>();
public boolean foodMade = false;
	public class AnimateObjects extends AnimationTimer
	{


		public void handle(long now)
		{

			gc.clearRect(0,0,canvas.getWidth(),canvas.getHeight());

           int loopNum = 30;
			for(int i = 0; i < loopNum; i ++){
				if(foodMade == false){
				if(i == loopNum-1){
					foodMade = true;
				}
			   int randX = (int) (Math.random() * 800);
			   int randY = (int) (Math.random() * 400);
				Food bett = new Food();
				bett.createFood(randX, randY, gc, ranColor());
				foodList.add(bett);
			}
			}

			for (Food thisFood : foodList) {
			     thisFood.paint();
}


Rectangle2D rec1 = new Rectangle2D(hero.getX(), hero.getY(),size,size);
				gc.fillOval(hero.getX(), hero.getY(), size, size);

for (int fod = 0; fod < foodList.size(); fod++)
{
	Rectangle2D foodThing = foodList.get(fod).getRect();
            if(rec1.intersects(foodThing)) {
				foodList.remove(fod);
				size += 3;
				speed -= 0.03;
				if(foodList.size() == 0){  //winning things
					System.out.println("You Won");
				}
			}
		}

		}
	}

	public Color ranColor(){
    int ranNum = (int) (Math.random() *colors.length );
    return colors[ranNum];
}

	public void handle(final InputEvent event)
	{
		if (event instanceof KeyEvent)
		{
			if ( ( (KeyEvent)event).getCode() == KeyCode.LEFT)
			hero.moveX(-(speed));
			if ( ( (KeyEvent)event).getCode() == KeyCode.RIGHT)
			hero.moveX(speed);

		}
				if ( ( (KeyEvent)event).getCode() == KeyCode.DOWN){
					hero.moveY(speed);
				}

							if ( ( (KeyEvent)event).getCode() == KeyCode.UP){
									hero.moveY(-(speed));
				}






	}






	public static void main(String[] args)
	{
		launch();
	}
}