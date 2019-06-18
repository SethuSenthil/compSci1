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
Add everything to arraylist
*/

public class HeroGame extends Application implements EventHandler<InputEvent>
{
	GraphicsContext gc;
	Canvas canvas;
	Hero hero;
		Hero enemy;
	Image h;
	AnimateObjects animate;
	int size = 100, canvasX = 1000, canvasY = 1000;
	double speed = 5.0;
	boolean endGame = false;

	public void start(Stage stage)
	{

		stage.setTitle("Agar.io but it's bad");
		Group root = new Group();
		canvas = new Canvas(canvasX,canvasY);
		root.getChildren().add(canvas);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		scene.addEventHandler(KeyEvent.KEY_PRESSED,this);
		gc = canvas.getGraphicsContext2D();
		hero = new Hero(true);
		h = new Image("hero.jpg");
		animate = new AnimateObjects();
		animate.start();
		stage.show();
		double enemyPath = 0;

	}
Color[] colors = {Color.web("0x3cba54"), Color.web("0xf4c20d"), Color.web("0xdb3236"), Color.web("0x4885ed")};
	ArrayList<Food> foodList = new ArrayList<Food>();
	ArrayList<Hero> peopleList = new ArrayList<Hero>();
public boolean foodMade = false;
	public class AnimateObjects extends AnimationTimer
	{


		public void handle(long now)
		{
			if(!endGame){

			gc.clearRect(0,0,canvas.getWidth(),canvas.getHeight());

           int foodNum = 100;
           int enemyNum = 3;
           	if(!foodMade){
				for(int i = 0; i < enemyNum; i ++){
				  Hero enemyTing = new Hero(false);
                  peopleList.add(enemyTing);
				}
			for(int i = 0; i < foodNum; i ++){
				if(i == foodNum-1){
					foodMade = true;
				}
			   int randX = (int) (Math.random() * canvasX);
			   int randY = (int) (Math.random() * canvasY);
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
for(Hero emeiz : peopleList){
	int ranInt = (int) (Math.random() * 5);

if(emeiz.getX() > canvasX){
   emeiz.moveX(-ranInt);
}
if(emeiz.getY() > canvasY){
		   emeiz.moveY(-ranInt);
}


	Rectangle2D enemyRender = new Rectangle2D(emeiz.getX(), emeiz.getY(),150,150);
				gc.fillOval(emeiz.getX(), emeiz.getY(), 150, 150);
				          if(rec1.intersects(enemyRender)) {
					if(size > 150){
						System.out.println("ate enemy");
						peopleList.remove(emeiz);
					}else if(size < 150){
									System.out.println("You lost");
					}
}
}


            Text massStat = new Text("Mass: " + size, 280, 370, 48,gc);
            massStat.print();




 //food collision stuff
for (int fod = 0; fod < foodList.size(); fod++)
{
	Rectangle2D foodThing = foodList.get(fod).getRect();
            if(rec1.intersects(foodThing)) {
				foodList.remove(fod);
				size += 3;
				speed -= 0.03;
				if(foodList.size() == 0){  //winning things
					System.out.println("You Won");
				    gc.clearRect(0,0,canvas.getWidth(),canvas.getHeight());
					endGame = true;
                     Text winGameTxt = new Text("You Won!", 320, 200 , 48,gc);
            winGameTxt.print();
				}
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
					hero.moveY(-speed);
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