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


public class Text
{
	private String txt ="np txt";
	private int x;
	private int y;
    private int size;
    private GraphicsContext gmc;



	public Text(String txtt, int xx, int yy,int sizee, GraphicsContext gcc) //default constructor, empty parentheses
	{
       txt = txtt;
       x = xx;
       y = yy;
       size = sizee;
       gcc = gmc;
	}
	public void print(){
	  		gmc.setFill( Color.BLACK);
	  		gmc.setStroke( Color.BLACK );
	  		gmc.setLineWidth(1);
	  		Font font = Font.font( "Arial", FontWeight.NORMAL, 48 );
	  		gmc.setFont( font );
	  		gmc.fillText( txt, x, y );
gmc.strokeText( txt, x, y );
	}

}