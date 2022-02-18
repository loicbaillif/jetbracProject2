package tictactoe;

import java.util.Scanner;

public class Final {

	final static byte size = 3;
	final static char player1 = 'X';
	final static char player2 = 'O';

	public static void main(String[] args) {
		/* ****** PROJECT : Tic-Tac-Toe ******
		 * 
		 * Description 
		 * Our game is almost ready! Now let's combine what we’ve learned 
		 * in the previous stages to make a game of tic-tac-toe that two 
		 * players can play from the beginning (with an empty grid) through 
		 * to the end (until there is a draw, or one of the players wins).
		 * 
		 * The first player has to play as X and their opponent plays as O.
		 * 
		 * Objectives
		 * In this stage, you should write a program that:
		 * 		- Prints an empty grid at the beginning of the game.
		 * 		- Creates a game loop where the program asks the user to enter
		 * 		the cell coordinates, analyzes the move for correctness and 
		 * 		shows a grid with the changes if everything is okay. 
		 * 		- Ends the game when someone wins or there is a draw.
		 * 
		 * You need to output the final result at the end of the game.
		 * 
		 * Empty cells are display with an underscore (_)
		 */

		String stage = "_________";
		boolean finished = false;
		byte round = 1;
		byte playerInput = 0;
		displayGrid(stage);
		while (!finished) {
			playerInput = getInput(stage);
			stage = updateStage(stage, playerInput, round);
			displayGrid(stage);
			if (round >= 5 && wonGame(stage, round)) {
				// No possible winner before round 5
				finished = true;				
			} else if (round >= size * size) {
				finished = true;
				System.out.println("Draw");
			}
			round ++;
		}

		System.out.println("Thanks for playing.");

	}


	public static byte[] checkInput(String playerInput, String stage) {
		// Returns array made of :
		// 1) input status (from 1 to 4)
		// 2) Position of user choice
		// Tested and validated
		String[] playerInputA = playerInput.split(" ");
		byte[] result = {0, 0}; // {result, coord as byte}
		byte xCoord = 0;
		byte yCoord = 0;
		boolean numbers = false;
		if (playerInputA.length != 2) {
			result[0] = 1;
		} else {
			try {
				xCoord = Byte.valueOf(playerInputA[0]);
				yCoord = Byte.valueOf(playerInputA[1]);
				numbers = true;
			} catch (NumberFormatException e) {
				result[0] = 1;
			}			
		}
		if (numbers) {
			if ( (xCoord > 0 && xCoord <= size) 
					&& (yCoord > 0 && yCoord <= size) ) {
				// Coordinates can fit on the grid
				result[1] = (byte) ((xCoord - 1) * size + yCoord - 1);
				if (stage.charAt(result[1]) == '_') {
					result[0] = 4; // Empty cell, acceptable
				} else {
					result[0] = 3; // Cell not empty
				}
			} else {
				result[0] = 2; // input out of board.
			}
		}

		return result;
	}


	public static void displayGrid(String stage) {
		// Tested and validated
		// Gets the String which length equals 9 and print it as 
		// a tic-tac-toe board status.
		System.out.println("---------");
		for (byte i = 0; i < size; i++) {
			System.out.print("| ");
			for (byte j = 0; j < size; j++) {
				System.out.print(stage.charAt((int)(i * size + j)) + " ");
			}
			System.out.println("|");
		}
		System.out.println("---------");		
	}


	public static byte getInput(String stage) {
		// Tested and validated
		// Gets the input from player, and ask again until it is acceptable
		// Acceptable = 2 numbers between 1 and 3 (included), and 
		// 				corresponding to an empty cell.
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		boolean validInput = false;
		byte userInput = 0;
		do {
			System.out.println("Enter the coordinates: ");
			String playerInput = scanner.nextLine();
			byte[] input = checkInput(playerInput, stage);

			switch (input[0]) {
			case 1:
				System.out.println("You should enter numbers!");
				break;
			case 2:
				System.out.println("Coordinates should be from 1 to 3!");
				break;
			case 3: 
				System.out.println("This cell is occupied! Choose another one!");
				break;
			case 4:
				validInput = true;
				userInput = input[1];
			}			
		} while (!validInput);

		return userInput;
	}


	public static String updateStage(String stage, byte userIn, byte round) {
		// Tested and validated;
		// Gets the stage under its string form, the player new input, and 
		// returns the updated stage.
		StringBuilder temp = new StringBuilder();
		for (byte i = 0; i < size*size; i++) {
			if (i == userIn) {
				if (round % 2 == 0) {
					temp.append(player2);
				} else {
					temp.append(player1);
				}
			} else {
				temp.append(stage.charAt(i));
			}
		}

		return temp.toString();
	}


	public static boolean wonGame(String stage, byte round) {
		boolean result = false;
		// Tested and validated.
		// Returns true if player just won the game.
		// Player is determined by current round : X always start
		// round is odd = X just played
		// Need to check lines, columns, and the 2 diagonals
		char player = ((int) round % 2 == 0) ? player2 : player1;

		for (int i = 0; i < size; i++) {
			// Check lines
			if ( stage.charAt(i * size) == player 
					&& stage.charAt(i * size + 1) == player 
					&& stage.charAt(i * size + 2) == player) {
				result = true; 
				break;
			}
		}

		if (!result) { // No need to check if already won on lines
			for (int i = 0; i < size; i++) {
				// Check columns
				if ( stage.charAt(i) == player 
						&& stage.charAt(i + size) == player 
						&& stage.charAt(i + size + size) == player) {
					result = true;
					break;
				}
			}
		}

		if (!result) {
			if (stage.charAt(0) == player 
					&& stage.charAt(4) == player 
					&& stage.charAt(8) == player ) {
				// Descending diagonal
				result = true;
			} else if (stage.charAt(2) == player 
					&& stage.charAt(4) == player 
					&& stage.charAt(6) == player ) {
				// Ascending diagonal
				result = true;
			}
		}
		
		if (result) {
			System.out.format("%c wins%n", player);
		}

		return result;
	}

}

