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

public class HeroGame extends Application implements EventHandler<InputEvent>
{
	GraphicsContext gc;
	Canvas canvas;
	Hero hero;
	Image h;
	AnimateObjects animate;

	public void start(Stage stage)
	{

		stage.setTitle("Hero Game");
		Group root = new Group();
		canvas = new Canvas(800,400);
		root.getChildren().add(canvas);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		scene.addEventHandler(KeyEvent.KEY_PRESSED,this);
		scene.addEventHandler(MouseEvent.MOUSE_CLICKED,this);
		gc = canvas.getGraphicsContext2D();
		hero = new Hero("Cape Man", 10);
		h = new Image("hero.jpg");
		animate = new AnimateObjects();
		animate.start();
		stage.show();
	}

	public class AnimateObjects extends AnimationTimer
	{
		public void handle(long now)
		{
			gc.clearRect(0,0,canvas.getWidth(),canvas.getHeight());
			//gc.drawImage(h,hero.getX(), hero.getY() );
			// if (hero.getX() < canvas.getWidth() - h.getWidth() )
			// hero.moveRight();

			Rectangle2D rec1 = new Rectangle2D(hero.getX(), hero.getY(),100,100);
			gc.fillRect(hero.getX(), hero.getY(), 100, 100);

		}
	}

	public void handle(final InputEvent event)
	{
		if (event instanceof KeyEvent)
		{
			if ( ( (KeyEvent)event).getCode() == KeyCode.LEFT)
			hero.moveX(-5);
			if ( ( (KeyEvent)event).getCode() == KeyCode.RIGHT)
			hero.moveX(5);

			if(hero.getX() > 5)
			hero.moveX(-5);
		}
			if (event instanceof MouseEvent)
			{
				hero.moveToXY( (int) ( (MouseEvent)event).getX(), (int) ( (MouseEvent)event).getY()  );
			}




	}






	public static void main(String[] args)
	{
		launch();
	}
}