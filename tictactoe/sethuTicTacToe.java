import java.util.Scanner;
import static java.lang.System.*;

public class SethuSenthilTicTacToe{
	public static void main(String[] args){
		//init
		Scanner reader = new Scanner ( in);
		int[][]boardLine = {{0,200,600,200},
							 {0,400,600,400},
							 {200,0,200,600},
							 {400,0,400,600}};
		char [][]arr = new char[3][3];
		for (int i=0;i<3;i++)
			for (int j=0;j<3;j++)
				arr[i][j]='c';

		TicTacToeBoard board = new TicTacToeBoard(620,720);
		board.defineBoard(boardLine);
		board.setFiles("x.jpg","o.jpg");
		board.setBoard(arr);
		board.repaint();

		boolean playerAtt = false, player2Att = false, botAtt = false, winner = false,notvalid = false, validres = false;

		int tie = 0;
		String txtScan = "";



		out.println(" Ayyy! Welcome to tic tac toe. The board is comprehended as column(0 1 2) and row(0 1 2)");
		out.println();

		do{
			 out.println("How many human players? Type in one or two to select");
			txtScan = reader.nextLine();

			 out.println();

			if ((txtScan.equals("one"))||(txtScan.equals("two"))){
					validres = true;
			}
			else {
				 out.println("Don't be dumb. You cant do that.");
				 out.println();
				validres = false;
		}
	}while(validres == false);

		if (txtScan.equals("one")){
				 out.println("You are X and Bot is O");
				 out.println();

		do{
			do {
				 out.println("Type in the row");
				int row = reader.nextInt();

				 out.println("Type in the column");
				int column = reader.nextInt();


				if ((row > 2 || row < 0) || (column > 2 || column < 0) ){
					playerAtt = false;
					 out.println();
					 out.println("Sorry, Can't place it there.");
					 out.println();
				}
				else if(arr[row][column] == 'c'){
					arr[row][column] = 'x';
					playerAtt = true;
					tie++;
				}
				else{
					playerAtt = false;
					 out.println("Sorry, Can't place it there.");
					 out.println();

				}
				board.repaint();

			}while (playerAtt == false);
   char store = 'k';



                /*for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						if(i ==0){
							store = 'x';
						}else{
							if(arr[i][j] == store){
												 out.println("X wins");
													board.setWinner("X wins", 130, 660, 55);
													board.showText(true);
													board.repaint();
													winner = true;
					break;
							}
						}
					}
				}
				store = 'k';

	for(int i = 0; i < arr.length; i++){
	for(int j = 0; j < 3; j++){
								if(i ==0){
							store = 'x';
								}else{
									if(arr[j][i] == store){
														 out.println("X wins");
															board.setWinner("X wins", 130, 660, 55);
															board.showText(true);
															board.repaint();
															winner = true;
							break;
									}
						}
	}
}

store = 'k';


	for(int i = 0; i < arr.length; i++){
		if(i ==0){
							store = 'x';
										}else{
											if(arr[i][i] == store){
																 out.println("X wins");
																	board.setWinner("X wins", 130, 660, 55);
																	board.showText(true);
																	board.repaint();
																	winner = true;
									break;
											}
						}
	}
store = 'k';


	   int track = 3;
		for(int i = 0; i < arr.length; i++){
			if(i ==0){
												store = arr[i][track];
											}else{
												if(arr[i][track] == store){
																	 out.println("X wins");
																		board.setWinner("X wins", 130, 660, 55);
																		board.showText(true);
																		board.repaint();
																		winner = true;
																		   track--;
										break;
												}
							}
	}*/
				if(arr[0][0] == 'x' && arr[0][1] == 'x' && arr[0][2] == 'x' ){

					System.out.println("X WINS");
					board.setWinner("X WINS", 130, 660, 55);
					board.showText(true);
					board.repaint();
					winner = true;
					break;

				}

				else if(arr[1][0] == 'x' && arr[1][1] == 'x' && arr[1][2] == 'x' ){

					System.out.println("X WINS");
					board.setWinner("X WINS", 130, 660, 55);
					board.showText(true);
					board.repaint();
					winner = true;
					break;

				}

				else if(arr[2][0] == 'x' && arr[2][1] == 'x' && arr[2][2] == 'x' ){

					System.out.println("X WINS");
					board.setWinner("X WINS", 130, 660, 55);
					board.showText(true);
					board.repaint();
					winner = true;
					break;

				}

				else if(arr[0][0] == 'x' && arr[1][0] == 'x' && arr[2][0] == 'x' ){

					System.out.println("X WINS");
					board.setWinner("X WINS", 130, 660, 55);
					board.showText(true);
					board.repaint();
					winner = true;
					break;

				}

				else if(arr[0][1] == 'x' && arr[1][1] == 'x' && arr[2][1] == 'x' ){

					System.out.println("X WINS");
					board.setWinner("X WINS", 130, 660, 55);
					board.showText(true);
					board.repaint();
					winner = true;
					break;

				}

				else if(arr[0][2] == 'x' && arr[1][2] == 'x' && arr[2][2] == 'x' ){

					System.out.println("X WINS");
					board.setWinner("X WINS", 130, 660, 55);
					board.showText(true);
					board.repaint();
					winner = true;
					break;

				}
				else if(arr[0][0] == 'x' && arr[1][1] == 'x' && arr[2][2] == 'x' ){

					System.out.println("X WINS");
					board.setWinner("X WINS", 130, 660, 55);
					board.showText(true);
					board.repaint();
					winner = true;
					break;

				}

				else if(arr[0][2] == 'x' && arr[1][1] == 'x' && arr[2][0] == 'x' ){

					System.out.println("X WINS");
					board.setWinner("X WINS", 130, 660, 55);
					board.showText(true);
					board.repaint();
					winner = true;
					break;

				}


				if (tie == 9){

					 out.println("Its a freakin tie! Not te tie you wear.");
					board.setWinner("Its a freakin tie! Not te tie you wear.", 130, 660, 55);
					board.showText(true);
					board.repaint();
					break;
						}
				 out.println("Bot's Turn");
						board.delay(1000);

				do{
				int x = (int)(Math.random()*3)+0;
				int y = (int)(Math.random()*3)+0;

					if(arr[x][y] == 'c'){
						arr[x][y] = 'o';
							botAtt = true;
							tie++;
					}
					else{
						botAtt = false;
					}

					board.repaint();

				}while(botAtt == false);


			if(arr[0][0] == 'o' && arr[0][1] == 'o' && arr[0][2] == 'o' ){

					 out.println("Bot wins");
					board.setWinner("Bot wins", 130, 660, 55);
					board.showText(true);
					board.repaint();
					winner = true;
					break;

			}

			else if(arr[1][0] == 'o' && arr[1][1] == 'o' && arr[1][2] == 'o' ){

					 out.println("Bot wins");
					board.setWinner("Bot wins", 130, 660, 55);
					board.showText(true);
					board.repaint();
					winner = true;
					break;

			}

			else if(arr[2][0] == 'o' && arr[2][1] == 'o' && arr[2][2] == 'o' ){

					 out.println("Bot wins");
					board.setWinner("Bot wins", 130, 660, 55);
					board.showText(true);
					board.repaint();
					winner = true;
					break;

			}

			else if(arr[0][0] == 'o' && arr[0][1] == 'o' && arr[0][2] == 'o' ){

					 out.println("Bot wins");
					board.setWinner("Bot wins", 130, 660, 55);
					board.showText(true);
					board.repaint();
					winner = true;
					break;

			}

			else if(arr[1][0] == 'o' && arr[1][1] == 'o' && arr[1][2] == 'o' ){

					 out.println("Bot wins");
					board.setWinner("Bot wins", 130, 660, 55);
					board.showText(true);
					board.repaint();
					winner = true;
					break;

			}

			else if(arr[2][0] == 'o' && arr[2][1] == 'o' && arr[2][2] == 'o' ){

					 out.println("Bot wins");
					board.setWinner("Bot wins", 130, 660, 55);
					board.showText(true);
					board.repaint();
					winner = true;
					break;

			}
			else if(arr[0][0] == 'o' && arr[1][1] == 'o' && arr[2][2] == 'o' ){

					 out.println("Bot wins");
					board.setWinner("Bot wins", 130, 660, 55);
					board.showText(true);
					board.repaint();
					winner = true;
					break;

			}

			else if(arr[0][2] == 'o' && arr[1][1] == 'o' && arr[2][0] == 'o' ){

					 out.println("Bot wins");
					board.setWinner("Bot wins", 130, 660, 55);
					board.showText(true);
					board.repaint();
					winner = true;
					break;

				}


			if (tie == 9){
				 out.println("Its a freakin tie");
				board.setWinner("ts a freakin tie", 130, 660, 55);
				board.showText(true);
				board.repaint();
				break;


			}
		}while (winner == false);
	}
	else{
		 out.println();
		 out.println("Player 1 (you)[X] and Player 2 is [O]");



				do{

					do {

					 out.println();

					 out.println("Player 1's Turn: \nEnter what row you want");
					int row = reader.nextInt();

					 out.println("Enter what column you want");
					int column = reader.nextInt();



					if ((row > 2 || row < 0) || (column > 2 || column < 0) ){

						playerAtt = false;
						 out.println();
						 out.println("Sorry, cant place it there.");
						 out.println();
					}
					else if(arr[row][column] == 'c'){
						arr[row][column] = 'x';
						playerAtt = true;
						tie++;
					}
					else{
						playerAtt = false;
						 out.println("That spot is invalid");
						 out.println();

					}
				board.repaint();

				}while (playerAtt == false);
						if(arr[0][0] == 'x' && arr[0][1] == 'x' && arr[0][2] == 'x' ){

								 out.println("X wins");
								board.setWinner("X wins", 130, 660, 55);
								board.showText(true);
								board.repaint();
								winner = true;
								break;

						}

						else if(arr[1][0] == 'x' && arr[1][1] == 'x' && arr[1][2] == 'x' ){

								 out.println("X wins");
								board.setWinner("X wins", 130, 660, 55);
								board.showText(true);
								board.repaint();
								winner = true;
								break;

						}

						else if(arr[2][0] == 'x' && arr[2][1] == 'x' && arr[2][2] == 'x' ){

								 out.println("X wins");
								board.setWinner("X wins", 130, 660, 55);
								board.showText(true);
								board.repaint();
								winner = true;
								break;

						}

						else if(arr[0][0] == 'x' && arr[1][0] == 'x' && arr[2][0] == 'x' ){

								 out.println("X wins");
								board.setWinner("X wins", 130, 660, 55);
								board.showText(true);
								board.repaint();
								winner = true;
								break;

						}

						else if(arr[0][1] == 'x' && arr[1][1] == 'x' && arr[2][1] == 'x' ){

								 out.println("X wins");
								board.setWinner("X wins", 130, 660, 55);
								board.showText(true);
								board.repaint();
								winner = true;
								break;

						}

						else if(arr[0][2] == 'x' && arr[1][2] == 'x' && arr[2][2] == 'x' ){

								 out.println("X wins");
								board.setWinner("X wins", 130, 660, 55);
								board.showText(true);
								board.repaint();
								winner = true;
								break;

						}
						else if(arr[0][0] == 'x' && arr[1][1] == 'x' && arr[2][2] == 'x' ){

								 out.println("X wins");
								board.setWinner("X wins", 130, 660, 55);
								board.showText(true);
								board.repaint();
								winner = true;
								break;

						}

						else if(arr[0][2] == 'x' && arr[1][1] == 'x' && arr[2][0] == 'x' ){

								 out.println("X wins");
								board.setWinner("X wins", 130, 660, 55);
								board.showText(true);
								board.repaint();
								winner = true;
								break;

						}

						if (tie == 9){

								 out.println("IT'S A TIE");
								board.setWinner("IT'S A TIE", 130, 660, 55);
								board.showText(true);
								board.repaint();
								break;


						}
						do {

						 out.println();

						 out.println("Player 2's Turn: \nEnter what row you want");
						int row = reader.nextInt();

						 out.println("Enter what column you want");
						int column = reader.nextInt();



						if ((row > 2 || row < 0) || (column > 2 || column < 0) ){
							player2Att = false;
							 out.println();
							 out.println("Not Valid enter again");
							 out.println();
						}
						else if(arr[row][column] == 'c'){
							arr[row][column] = 'o';
							player2Att = true;
							tie++;
						}
						else{
							player2Att = false;
							 out.println();
							 out.println("That spot is invalid");
							 out.println();

						}
					board.repaint();

					}while (player2Att == false);


					if(arr[0][0] == 'o' && arr[0][1] == 'o' && arr[0][2] == 'o' ){

							 out.println("PLAYER 2 wins");
							board.setWinner("PLAYER 2 wins", 130, 660, 55);
							board.showText(true);
							board.repaint();
							winner = true;
							break;

					}

					else if(arr[1][0] == 'o' && arr[1][1] == 'o' && arr[1][2] == 'o' ){

							 out.println("PLAYER 2 wins");
							board.setWinner("PLAYER 2 wins", 130, 660, 55);
							board.showText(true);
							board.repaint();
							winner = true;
							break;

					}

					else if(arr[2][0] == 'o' && arr[2][1] == 'o' && arr[2][2] == 'o' ){

							 out.println("PLAYER 2 wins");
							board.setWinner("PLAYER 2 wins", 130, 660, 55);
							board.showText(true);
							board.repaint();
							winner = true;
							break;

					}

					else if(arr[0][0] == 'o' && arr[0][1] == 'o' && arr[0][2] == 'o' ){

							 out.println("PLAYER 2 wins");
							board.setWinner("PLAYER 2 wins", 130, 660, 55);
							board.showText(true);
							board.repaint();
							winner = true;
							break;

					}

					else if(arr[1][0] == 'o' && arr[1][1] == 'o' && arr[1][2] == 'o' ){

							 out.println("PLAYER 2 wins");
							board.setWinner("PLAYER 2 wins", 130, 660, 55);
							board.showText(true);
							board.repaint();
							winner = true;
							break;

					}

					else if(arr[2][0] == 'o' && arr[2][1] == 'o' && arr[2][2] == 'o' ){

							 out.println("PLAYER 2 wins");
							board.setWinner("PLAYER 2 wins", 130, 660, 55);
							board.showText(true);
							board.repaint();
							winner = true;
							break;

					}
					else if(arr[0][0] == 'o' && arr[1][1] == 'o' && arr[2][2] == 'o' ){

							 out.println("PLAYER 2 wins");
							board.setWinner("PLAYER 2 wins", 130, 660, 55);
							board.showText(true);
							board.repaint();
							winner = true;
							break;

					}

					else if(arr[0][2] == 'o' && arr[1][1] == 'o' && arr[2][0] == 'o' ){

							 out.println("PLAYER 2 wins");
							board.setWinner("PLAYER 2 wins", 130, 660, 55);
							board.showText(true);
							board.repaint();
							winner = true;
							break;

						}



					if (tie == 9){
							 out.println("Its a freakin tie! Not te tie you wear.");
							board.setWinner("Its a freakin tie! Not te tie you wear.", 130, 660, 55);
							board.showText(true);
							board.repaint();
							break;


						}
				}while (winner == false);

	}
	}
	}

