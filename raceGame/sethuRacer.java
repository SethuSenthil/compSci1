import java.util.concurrent.*;
public class sethuRacer {

	//public init vars
	public static int r1y = 50,
	r2y = 250,
	r3y = 450,
	windowx = 700,
	windowy = windowx,
	r1Wins = 0,
	r2Wins = 0,
	r3Wins = 0;

	public static RacerCanvas race = new RacerCanvas(800, windowy);

//main method
	public static void main(String[] args) {
		//init & reset canvas
		//TimeUnit.SECONDS.sleep(1);
		race.setFiles("img1.png", "img2.png", "img3.png");
		race.moveRacer1(0, r1y);
		race.moveRacer2(0, r2y);
		race.moveRacer3(0, r3y);
		String firstPlace = "", secondPlace = "", thirdPlace = "";
		boolean noTie = false;

//loop to make 3 rounds
		for (int i = 0; i < 3; i++) {
			race.delay(2000);
		    race.showText(false);
			round();
			System.out.println("finished round" + i);
		}

		//conditional statement to calc who won (the whole game)
		if (r1Wins > r2Wins && r1Wins > r3Wins) {
			firstPlace = "Racer 1";
			if (r2Wins > r3Wins) {
				secondPlace = "Racer 2";
				thirdPlace = "Racer 3";
			} else {
				thirdPlace = "Racer 3";
				secondPlace = "Racer 2";
			}
		} else if (r2Wins > r1Wins && r2Wins > r3Wins) {
			firstPlace = "Racer 2";
			if (r1Wins > r3Wins) {
				secondPlace = "Racer 1";
				thirdPlace = "Racer 2";
			} else {
				secondPlace = "Racer 2";
				thirdPlace = "Racer 3";
			}
		}  else if (r3Wins > r1Wins && r3Wins > r2Wins) {
			firstPlace = "Racer 3";
			if (r1Wins > r2Wins) {
				secondPlace = "Racer 1";
				thirdPlace = "Racer 2";
			} else {
				thirdPlace = "Racer 2";
				secondPlace = "Racer 1";
			}
		} else if (r3Wins == r1Wins || r3Wins == r2Wins || r3Wins == r2Wins || r1Wins == r2Wins) {
			firstPlace = "Racer 3";
			noTie = true;

		}


		//show end game results (out of all the rounds)
				    race.showText(false);

		if(noTie){
			System.out.println("notIte");
			race.setPlaces(firstPlace + " is in first place." + secondPlace +" is in second place" + thirdPlace +"is in third place", 0, 50, 20);
			race.showText(true);
		}else{
						System.out.println("smITe");

			if(r3Wins == r1Wins && r3Wins == r2Wins){
				             race.setPlaces("Everyone tied!" , 0, 50, 20);
				             race.showText(true);
			}else if(r3Wins == r1Wins && r3Wins > r2Wins){
				             race.setPlaces("Racer 1 and 3 tied for fitst place and racer 2 came in second!" , 0, 50, 20);
				             race.showText(true);
			}else if(r3Wins == r2Wins && r3Wins > r2Wins){
				             race.setPlaces("Racer 2 and 3 tied for fitst place and racer 1 came in second!" , 0, 50, 20);
				             race.showText(true);
			}else{
				             race.setPlaces("Racer 1 and 2 tied for fitst place and racer 3 came in second!" , 0, 50, 20);
				             race.showText(true);
			}
		}
		race.showText(true);
	}
//method to make random ints
	public static int ranInt() {
		int ranNum = (int) Math.round(Math.random() * 20);
		return ranNum;
	}


//method to move the racers and see who won the round
	public static void round() {
		int r1Pos = 0,
		r2Pos = 0,
		r3Pos = 0,
		r1Track = 0,
		r2Track = 0,
		r3Track = 0;
		while (r1Pos <= windowx || r2Pos <= windowx || r3Pos <= windowx) {
			race.delay(30);
			if (r1Pos <= windowx) {
				r1Pos += ranInt();
				//System.out.println(r1Pos);
				race.moveRacer1(r1Pos, r1y);
				//System.out.println("plr 1 moved total" + r1Track);
				r1Track++;
			}
			if (r2Pos <= windowx) {
				r2Pos += ranInt();
				//System.out.println(r2Pos);
				race.moveRacer2(r2Pos, r2y);
				//System.out.println("plr 2 moved total" + r2Track);
				r2Track++;
			}
			if (r3Pos <= windowx) {
				r3Pos += ranInt();
				//System.out.println(r3Pos);
				race.moveRacer3(r3Pos, r3y);
				//System.out.println("plr 3 moved total" + r3Track);
				r3Track++;
			}
			race.repaint();
					//System.out.println(r1Track);
					//System.out.println(r2Track);
		//System.out.println(r3Track);
		}


//check who won the round
		if (r1Track < r2Track && r1Track < r3Track) {
			//System.out.println("Player 1 won");
			race.setPlaces("Racer 1 won (round)" , 0, 50, 20);
			race.showText(true);
			r1Wins++;
		} else if (r2Track < r1Track && r2Track < r3Track) {
			//System.out.println("Player 2 won");
		    race.setPlaces("Racer 2 won (round)" , 0, 50, 20);
		    race.showText(true);
			r2Wins++;
		} else if (r3Track < r2Track && r3Track < r1Track) {
			//System.out.println("Player 3 won");
			race.setPlaces("Racer 3 won (round)" , 0, 50, 20);
			race.showText(true);
			r3Wins++;
		} else if (r1Track == r2Track && r1Track == r3Track) {
			//System.out.println("Everyone tied!");
			race.setPlaces("Everyone tied (round)" , 0, 50, 20);
			race.showText(true);
			r1Wins++;
			r2Wins++;
			r3Wins++;
		} else if (r1Track == r2Track && r1Track < r3Track) {
			//System.out.println("Player 1 and 2 tied");
		    race.setPlaces("Player 1 and 2 tied" , 0, 50, 20);
		    race.showText(true);
			r1Wins++;
			r2Wins++;
		} else if (r3Track == r2Track && r3Track < r1Track) {
			//System.out.println("Player 3 and 2 tied");
			race.setPlaces("Player 2 and 3 tied" , 0, 50, 20);
			race.showText(true);
			r2Wins++;
			r3Wins++;
		} else if (r1Track == r3Track && r1Track < r2Track) {
			System.out.println("Player 1 and 3 tied");
			race.setPlaces("Player 1 and 3 tied" , 0, 50, 20);
		    race.showText(true);
			r1Wins++;
			r3Wins++;
		}
					race.delay(100);
	}

}
