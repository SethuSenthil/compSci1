import java.util.Scanner;
public class myGame{
		//setting global vars
		public static TicTacToeBoard board = new TicTacToeBoard(620,720);
			      		 public static char [][] arr = {
				  						{'c','c','c'},
				  						{'c','c','c'},
				  						{'c','c','c'}
					};

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
board.setFiles("x.jpg","o.jpg" );
board.repaint();
Scanner txtScan = new Scanner(System.in);
//actuall code stuff
while(!gameEnd){
	if(lastPlay%2 == 0){
	//player 1 is playing
				xo = 'o';
		    System.out.println("Player 2 is playing");
		    		                 		    System.out.println("Where do u want to put it");
             String where = txtScan.nextLine();
            placeBlock(where);

updateGameBoard();

		printGameArr();


	} else {
		//player 1 is playing
				xo = 'x';
		    System.out.println("Player 1 is playing");
		    System.out.println("Where do u want to put it");
             String where = txtScan.nextLine();
            placeBlock(where);

updateGameBoard();

		printGameArr();

	}
	lastPlay++;
}

	}

	public static void updateGameBoard(){
		board.setBoard(arr);
		board.repaint();
	}
		public static void checkWinner(){
			char store = 'g';
				for(int i = 0; i < arr.length; i++){
					for(int ii = 0; ii < arr[i].length; ii++){
						if(ii == 1){
							store = arr[i][ii];
						}else{
						if(store != arr[i][ii]){
                                 break ;
						}else{
							//winner(arr[i][ii]);
						}

						}
				}
			}

							for(int i = 0; i < arr.length; i++){
								for(int j = 0; j < 3; j++){
									if(j == 1){
										store = arr[i][j];
									}else{
									if(store != arr[i][j]){
			                                 break ;
									}else{
										//winner(arr[i][ii]);
									}

									}
							}
			}
	}

		public static void printGameArr(){
			for(int i = 0; i < arr.length; i++){
				for(int ii = 0; ii < arr[i].length; ii++){
								System.out.print(arr[i][ii]);
			}
											System.out.println(" ");
			}
	}
		public static void placeBlock(String where){
			 switch(where) {
						   case "1":
						     arr[0][0] = xo;
						     break;
						   case "2":
						     arr[0][1] = xo;
						     break;
						        case "3":
							 		      arr[0][2] = xo;
						     break;
						        case "4":
							 		     arr[1][0] = xo;
						     break;
						        case "5":
							 		     arr[1][1] = xo;
						     break;
						        case "6":
							 		     arr[1][2] = xo;
						     break;
						        case "7":
							 		     arr[2][0] = xo;
						     break;
						        case "8":
							 		     arr[2][1] = xo;
						     break;
						        case "9":
							 		      arr[2][2]  = xo;
					     break;

		}
	}



}