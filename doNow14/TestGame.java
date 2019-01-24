

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

public class TestGame {
	public static void main(String[] args){

int x = (int) Math.round(Math.random() * 500),
    y = (int) Math.round(Math.random() * 600);
    		BallCanvas ballCanvas = new BallCanvas(x,y);

			int speed = 5;
		for (long i=1;i<1000000000;i++)
		{
			ballCanvas.moveBall(x,y);

			ballCanvas.delay(20);
			ballCanvas.repaint();
			y += speed;
			if(y > 510 || y < 0)
				speed *= -1;
		}
	}

}
