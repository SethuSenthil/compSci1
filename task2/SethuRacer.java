public class SethuRacer{
public static void main(String[] args) {
   RacerCanvas race = new RacerCanvas(800,800);
   race.setFiles("fus.png", "google.png", "node.png");
   for (int i = 1; i < 500; i++) {
       race.moveRacer1(i, 100);
   }
}

}