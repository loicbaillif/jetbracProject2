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
			input = scanner.nextLine();
		} while (input.length() != maxRounds);
		
		/* TEST countMoves
		int[] countElts = new int[2];
		countElts = countMoves(input, player0, player1);
		System.out.format("%d rounds: %d moves from %c - %d moves from %c.%n", 
				countElts[0] + countElts[1], 
				countElts[0], player0, countElts[1], player1);
		// END TEST countMoves */
		
		
		
		char[][] stage = new char[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				stage[i][j] = input.charAt(size * i + j);
			}
		}
		displayGrid(stage);
		
		scanner.close();
	}
	
	
	
	
	public static int[] countMoves(String stage, char player1, char player2) {
		// Checked and validated.
		int nbO = 0;
		int nbX = 0;
		for (int i = 0; i < size*size; i++) {
			if (stage.charAt(i) == player1) {
				nbO++;
			} else if (stage.charAt(i) == player2) {
				nbX++;
			}
		}
		
		int[] result = {nbO, nbX}; // Alphabetical Order
		return result;
	}
	

	public static void displayGrid(char[][] stage) {
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
	
	
	public static boolean validInput(String input) {
		// Writing in progress
		char[] inputC = input.toCharArray();
		int nbMoves = 0;
		boolean result = true;
		for (char elt : inputC) {
			System.out.format("%c - maxRounds = %d %n", elt, maxRounds);
			if (nbMoves > maxRounds) {
				result = false;
				break;
			}
			if (!(elt == 'o' || elt == 'O' || elt == 'x' || elt == 'X' || elt == '_')) {
				result = false;
				break;
			}
			nbMoves++;
		}		
		return result;
	}
	

	public static boolean winGame(char[][] stage, char player) {
		// TODO
		return true;
	}

}

