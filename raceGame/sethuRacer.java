public class sethuRacer{
	public static void main(String[] args){
		RacerCanvas race = new RacerCanvas(800,800);
		race.setFiles("img1.png","img2.png","img3.png");
		race.moveRacer1(1, 50);
		race.moveRacer2(50, 250);
		race.moveRacer3(50, 450);

	for (int i = 1; i < 1000; i*=100) {
		race.delay(500);
		race.moveRacer1(i, 50);
		race.repaint();
	}
	}

}