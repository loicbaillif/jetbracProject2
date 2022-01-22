package tictactoe;

import java.util.Scanner;

public class CheckField {

	static int size = 3;
	static int maxRounds = 9;
	static char player0 = 'O';
	static char player1 = 'X';

	public static void main(String[] args) {
		/* ****** PROJECT : Tic Tac Toe ******
		 * Stage 3 / 5 - What's up on the field
		 * 
		 * --> Description 
		 * In this stage, we’re going to analyze the game state to determine 
		 * if either of the players has already won the game or it is still 
		 * ongoing, if the game is a draw, or if the user has entered an 
		 * impossible game state (two winners, or with one player 
		 * having made too many moves). 
		 * 
		 * --> Objectives 
		 * In this stage, your program should: 
		 * 1) Take a string entered by the user and print the game grid 
		 *    as in the previous stage. 
		 * 2) Analyze the game state and print the result. Possible states:
		 * 		. "Game not finished" when neither side has three in a row 
		 * 		  but the grid still has empty cells. 
		 * 		. "Draw" when no side has a three in a row and the grid 
		 * 		  has no empty cells.
		 * 		. "X wins" when the grid has three X’s in a row.
		 * 		. "O wins" when the grid has three O’s in a row.
		 * 		. "Impossible" when the grid has three X’s in a row as well 
		 * 		  as three O’s in a row, or there are a lot more X's than O's 
		 * 		  or vice versa (the difference should be 1 or 0; if the 
		 * 		  difference is 2 or more, then the game state is impossible).
		 * 
		 * In this stage, we will assume that either X or O can start the game.
		 * 
		 * Empty cells will be displayed with an underscore.
		 */

		Scanner scanner = new Scanner(System.in);
		String input = "";
		do {
			if (!input.equals("")) {
				System.out.println("Invalid game grid.");
			}
			System.out.print("Enter cells: ");
			// Conversion to upper case to treat only X and O 
			input = scanner.nextLine().toUpperCase();
		} while (!validInput(input));

		int[] countElts = new int[2];
		countElts = countMoves(input);
		int nbO = countElts[0];
		int nbX = countElts[1];
		
		char[][] stage = new char[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				stage[i][j] = input.charAt(size * i + j);
			}
		}
		displayGrid(stage);
		statusGame(stage, nbO, nbX);

		scanner.close();
	}


	public static int[] countMoves(String stage) {
		// This method  returns  an array made of 2 elements:
		// 1st is nb of moves from player 0 (using O)
		// 2nd is nb of moves from player 1 (using X)
		// Checked and validated.
		int nbO = 0;
		int nbX = 0;
		for (int i = 0; i < maxRounds; i++) {
			if (stage.charAt(i) == player0) {
				nbO++;
			} else if (stage.charAt(i) == player1) {
				nbX++;
			}
		}
		int[] result = {nbO, nbX}; // Alphabetical Order
		return result;
	}


	public static void displayGrid(char[][] stage) {
		// Displays the grid in the console, within a frame.
		// Checked and validated.
		System.out.println("---------");
		for (int i = 0; i < size; i++) {
			System.out.print("| ");
			for (int j = 0; j < size; j++) {
				System.out.format("%c ", stage[i][j]);
			}
			System.out.format("|%n");
		}
		System.out.println("---------");
	}


	public static void statusGame(char[][] stage, int nbO, int nbX) {
		// 0 = player0 (O) wins - 1 = player1 (X) wins - 2 = game not finished
		// 3 = impossible - 4 = draw
		// Checked and validated
		byte result;
		int nbMoves = nbO + nbX;
		if (Math.abs(nbO - nbX) > 1) {
			// CAUTION : Always remember to check consistency first.
			// Too big difference between number of O and X : impossible
			result = 3;
		} else if (nbO < size && nbX < size) {
			// Less than 3 O and 3 X ? can't be a winner, game not finished
			result = 2;
		} else if (wonGame(stage, player0) && wonGame(stage, player1)) {
			// Two winners? Sorry, not possible
			result = 3;
		} else if (wonGame(stage, player0)) {
			result = 0;
		} else if (wonGame(stage, player1)) {
			result = 1;
		} else if (nbMoves < maxRounds) {
			// No winner, but there are still empty cells
			result = 2;
		} else {
			// no winner, no empty cells, no impossible status
			result = 4;
		}
		switch (result) {
		case 0:
			System.out.println("O wins");
			break;
		case 1:
			System.out.println("X wins");
			break;
		case 2:
			System.out.println("Game not finished");
			break;
		case 3:
			System.out.println("Impossible");
			break;
		case 4:
			System.out.println("Draw");
		}
	}


	public static boolean validInput(String input) {
		// Ensure that the input string is valid, id est :
		// --> Made of 9 characters.
		// --> Consists of O or X or _ and nothing else.
		// Checked and validated
		char[] inputC = input.toCharArray();
		int nbMoves = inputC.length;
		boolean result = true;
		if (nbMoves != maxRounds) {
			result = false;
		} else {
			for (char elt : inputC) {
				if (elt == 'O' || elt == 'X' || elt == '_') {
					continue;
				} else {
					result = false;
					break;
				}
			}		
		}
		return result;
	}


	public static boolean wonGame(char[][] stage, char player) {
		// Returns true if player won the game, id est 1 of the 8:
		// 3 in a row in a line OR
		// 3 in a row in a column OR
		// 3 in a row in a diagonal 
		// Checked and validated
		boolean result = false;
		for (int i = 0; i < size; i++) {
			// Check lines
			if ((stage[i][0] == player) 
					&& (stage[i][1] == player) 
					&& (stage[i][2] == player)) {
				result = true;
				break; // No need to check other lines
				// System.out.format("%c won on line %d%n", player, i); debug
			}
		}
		for (int j = 0; j < size; j++) {
			// Check columns
			if ((stage[0][j] == player)  
					&& (stage[1][j] == player)  
					&& (stage[2][j] == player)) {
				result = true;
				break; // No need to check other lines
				// System.out.format("%c won on column %d%n", player, j); debug
			}
		}
		if ((stage[0][0] == player)  
				&& (stage[1][1] == player)  
				&& (stage[2][2] == player)) {
			// Check one diagonal
			result = true;
			// System.out.println("Won on descending diagonal"); debug
		} else if ((stage[0][2] == player) 
				&& (stage[1][1] == player) 
				&& (stage[2][0] == player)) {
			// check the other diagonal
			result = true;
			// System.out.println("Won on ascending diagonal"); debug
		}

		return result;
	}


}

