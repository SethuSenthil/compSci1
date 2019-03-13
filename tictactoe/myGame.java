import java.util.Scanner;
public class myGame{
		//setting global vars
		public static TicTacToeBoard board = new TicTacToeBoard(620,720);
			      		 public static char [][] arr = {
				  						{'c','c','c'},
				  						{'c','c','c'},
				  						{'c','c','c'}
					};
			      public static char block1 = arr[0][0],block2  = arr[0][1],block3  = arr[0][2],block4 = arr[1][0],block5  = arr[1][1],block6  = arr[1][2],block7  = arr[2][0],block8  = arr[2][1],block9  =  arr[2][2];

public static char xo = 'x';


	public static void main(String[] args){
//init game
 int[][] grid = {
						{0,200,600,200},
						{200,0,200,600},
						{400,0,400,600},
						{0,400,500,400}
					};
boolean gameEnd = false;
int lastPlay = 1;
board.defineBoard(grid);
board.setBoard(arr);
board.setFiles("o.jpg","x.jpg" );
board.repaint();
Scanner txtScan = new Scanner(System.in);
//actuall code stuff
while(!gameEnd){
	if(lastPlay%2 == 0){
		//player 2 is playing
		xo = '0';
		    System.out.println("Player 2 is playing");
		    		                 		    System.out.println("Where do u want to put it");
		                 String where = txtScan.nextLine();
		                placeBlock(where);
updateGameBoard();


	} else {
		//player 1 is playing
				xo = 'x';
		    System.out.println("Player 1 is playing");
		    		                 		    System.out.println("Where do u want to put it");
             String where = txtScan.nextLine();
            placeBlock(where);

updateGameBoard();


	}
	lastPlay++;
}

	}
	public static void updateGameBoard(){
		board.setBoard(arr);
		board.repaint();
	}
		public static void placeBlock(String where){
			 switch(where) {
						   case "1":
						     block1 = xo;
						     break;
						   case "2":
						     block2 = xo;
						     break;
						        case "3":
							 		     block3 = xo;
						     break;
						        case "4":
							 		     block4 = xo;
						     break;
						        case "5":
							 		     block5 = xo;
						     break;
						        case "6":
							 		     block6 = xo;
						     break;
						        case "7":
							 		     block7 = xo;
						     break;
						        case "8":
							 		     block8 = xo;
						     break;
						        case "9":
							 		     block9 = xo;
					     break;

		}
	}



}