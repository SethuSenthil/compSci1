//Sethu Senthil 3B
import static java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;

public class task {
	public static String comp = "";
    public static int playeWins = 0;
    public static int compWins = 0;
    public static String userPlay = "";
    public static int mode = 0;

public static void main (String[] args){
Scanner txtScan = new Scanner(in);
Scanner numScan = new Scanner(in);
	out.println("Running Rock Paper Scissors \n");
    out.print("Select Mode 1,2,3");
    int modeSel = numScan.nextInt();
    mode = modeSel;


for(int i = 1; i < 4; i++) {
	out.println("Round " + i);
   newRound();
   out.println("");
}
	whoWins();

}

//creates a round
public static void newRound(){
	Scanner txtScan = new Scanner(in);
Scanner numScan = new Scanner(in);
		out.print("Enter a RPS throw: ");
		userPlay = txtScan.nextLine().toUpperCase();
		out.print("Computer selects: ");
		select();
	    validate(userPlay);
}


//selects a random move
public static void select(){
		String select = "";
	String things[];
	 things = new String[4]; //idk why I have to put in a 4 index for 2,
	 //if I dont i get a out of array bounds error
	 things[0] = "ROCK";
	 things[1] ="PAPER";
     things[2] = "SCISSORS";
	 if(mode == 1){
    int ranNum = (int) Math.round(Math.random() * things.length);
	 select = things[ranNum];
	 }else if(mode == 2){
		 String lose = "";
		 switch(userPlay){
			 case "ROCK":
			 lose = "PAPER";
		     break;
		     case "PAPER":
			 lose = "SCISSORS";
		     break;
		     case "SCISSORS":
		     lose = "ROCK";
		     break;
		 }
		 /*int hi = (int) Math.round(Math.random * 4));
		 if(hi < 2) {
			 comp = lose;
		 }*/

	 }
	comp = select;
     out.println(select);
     comp = "";
}

//checks who won at the end of the game
public static void  whoWins(){
  if(playeWins > compWins) {
	  out.println("Result: Player Wins");
	  }else if (playeWins < compWins){
		  	  out.println("Result: Computer Wins!");
  }else{
	  newRound();
  }
}


public static void  compWin(){
	out.println("Computer Wins");
}


public static void validate(String
userPlay){
   switch(userPlay){
	   case "ROCK":
	   switch(comp){
           case "ROCK":
           out.println("replay");
           newRound();
           break;
           case "PAPER":
           playeWins += 1;
           out.println("You Win!");
           break;
           default:
           compWins += 1;
           break;
	   }

	   	   case "PAPER":
	   	   switch(comp){
	              case "PAPER":
	              out.println("replay");
	               newRound();
	              break;
	              case "SCISSORS":
	              playeWins += 1;
	              break;
	              default:
	              compWins += 1;
	              compWin();
	              break;
	   }
	    break;

			   	   case "SCISSORS":
			   	   switch(comp){
			              case "SCISSORS":
			              out.println("replay");
			                         newRound();
			              break;
			              case "ROCK":
			              playeWins += 1;
			              break;
			              default:
			              compWins += 1;
			              break;
			   }
	    break;
   }
}
}
