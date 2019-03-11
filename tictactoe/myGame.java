public class myGame{
	public static void main(String[] args){
		int[][] grid = {
			{0,200,600,200},
			{200,0,200,600},
			{400,0,400,600},
			{0,400,500,400}
		};

		char [][] arr = {
			{'o','x','x'},
			{'o','x','x'},
			{'o','x','x'}
		};
		TicTacToeBoard board = new TicTacToeBoard(620,720);
board.defineBoard(grid);
board.setBoard(arr);
board.setFiles("o.jpg","x.jpg" );

board.repaint();

	}
}