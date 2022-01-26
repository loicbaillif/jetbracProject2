package tictactoe;

import java.util.Scanner;

public class FirstMove {

	static int size = 3;
	static int maxRounds = 9;
	static char emptyCell = '_';
	static char player0 = 'O';
	static char player1 = 'X';

	public static void main(String[] args) {
		/* ****** PROJECT : Tic Tac Toe ******
		 * Stage 4 / 5 - First Move
		 * 
		 * --> DESCRIPTION 
		 *  It’s time to make our game interactive! 
		 *  Now we’re going to add the ability for a user to make a move.
		 *  To do this, we need to divide the grid into cells.
		 * 
		 *  Suppose the top left cell has the coordinates (1, 1) and the 
		 *  bottom right cell has the coordinates (3, 3) like in this table: 
		 *  	(1, 1) (1, 2) (1, 3) 
		 *  	(2, 1) (2, 2) (2, 3) 
		 *  	(3, 1) (3, 2) (3, 3) 
		 *  
		 *  The program should ask the user to enter the coordinates of the 
		 *  cell where they want to make a move. 
		 *  
		 *  In this stage, the user plays as X, not O. Keep in mind that the 
		 *  first coordinate goes from top to bottom and the second 
		 *  coordinate goes from left to right. Also note that coordinates 
		 *  start with 1 and can be 1, 2, or 3. 
		 *  
		 *  What happens if the user enters incorrect coordinates? The user 
		 *  could enter symbols instead of numbers, or enter coordinates 
		 *  representing occupied cells or cells that aren’t even on the grid.
		 *  You need to check the user's input and handle possible errors.
		 * 
		 * 
		 * --> OBJECTIVES 
		 * The program should work as follows: 
		 * 		1. Get the 3x3 grid from the input as in the previous stages. 
		 * 		2. Output this 3x3 grid as in the previous stages. 
		 * 		3. Prompt the user to make a move. 
		 * 		4. The user should input 2 numbers that represent the cell 
		 * 			where they want to place their X. (the 9 symbols 
		 * 			representing the field will be the first line of input, 
		 * 			and the 2 coordinate numbers will be the second line 
		 * 			of input) 
		 * 		5. Analyze user input and show messages in the following situations: 
		 * 			- "This cell is occupied! Choose another one!"
		 * 			if the cell is not empty. 
		 * 			- "You should enter numbers!" 
		 * 			if the user enters non-numeric symbols in the coordinates 
		 * 			input. 
		 * 			- "Coordinates should be from 1 to 3!" 
		 * 			if the user enters coordinates outside the game grid.
		 * 		6. Update the grid to include the user's move and print the 
		 * 			updated grid to the console.
		 * 
		 * The program should also check the user’s input. If the input is 
		 * unsuitable, the program should tell the user why their input was 
		 * wrong, and prompt them to enter coordinates again. 
		 * 
		 * To summarize, you need to output the game grid based on the first 
		 * line of input, and then ask the user to enter a move. Keep asking 
		 * until the user enters coordinates that represent an empty cell on 
		 * the grid, update the grid to include that move, and then output  
		 * it to the console. You should output the field only 2 times: once 
		 * before the user’s move, and once after the user has entered a 
		 * legal move.  
		 * 
		 * 
		 * Empty cells will be displayed with an underscore.
		 */

		Scanner scanner = new Scanner(System.in);
		String gridS = "";
		do {
			if (!gridS.equals("")) {
				System.out.println("Invalid game grid.");
			}
			System.out.print("Enter cells: ");
			// Conversion to upper case to treat only X and O 
			gridS = scanner.nextLine().toUpperCase();
		} while (!validInput(gridS));

		int[] countElts = new int[2];
		countElts = countMoves(gridS);
		int nbO = countElts[0];
		int nbX = countElts[1];

		char[][] stage = convertGridToArray(gridS);
		displayGrid(stage);
		statusGame(stage, nbO, nbX);

		// Check coordinates entered by user
		String userCoord = "";
		do {
			System.out.print("Enter the coordinates: ");
			userCoord = scanner.nextLine();
		} while (!validCoord(gridS, userCoord));

		// Now they are valid, display the updated grid
		String[] coordA = userCoord.split(" ");
		int coordX = Integer.parseInt(coordA[0]); // Integer for X
		int coordY = Integer.parseInt(coordA[1]); // Integer for Y
		int coordInt = (coordX-1) * size + (coordY-1);
		gridS = updateGrid(gridS, coordInt);		
		
		
		// And finally close the scanner
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
	
	
	public static char[][] convertGridToArray(String grid) {
		char[][] stage = new char[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				stage[i][j] = grid.charAt(size * i + j);
			}
		}
		return stage;
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
	
	
	public static String updateGrid(String oldGrid, int userCoord) {
		// TO WRITE		
		StringBuilder newGrid = new StringBuilder();
		char[] oldGridA = oldGrid.toCharArray();
		for (int i = 0; i < size*size; i++) {
			newGrid.append(i == userCoord ? player1 : oldGridA[i]);
		}
		String newGridS = newGrid.toString();
		displayGrid(convertGridToArray(newGridS));
		
		return newGridS;
	}


	public static boolean validCoord(String grid, String userCoord) {
		boolean result = false;
		String[] coordA = userCoord.split(" ");
		if (coordA.length != 2) {
			System.out.println("You should enter numbers!");
		} else {
			try {
				int coordX = Integer.parseInt(coordA[0]); // Integer for X
				int coordY = Integer.parseInt(coordA[1]); // Integer for Y
				if (coordX > 0 && coordY > 0 && coordX <= size && coordY <= size) {
					// Valid coordinates, need to check if cell is empty.
					int coordInt = (coordX-1) * size + (coordY-1);
					if (grid.charAt(coordInt) == emptyCell) {
						// Valid coordinates + empty cell
						result = true;						
					} else {
						System.out.print("This cell is occupied! "); 
						System.out.println("Choose another one!");
					}
					
				} else {
					System.out.println("Coordinates should be from 1 to 3!");
				}
			} catch (Exception e) {
				System.out.println("You should enter numbers!");
			}
		}

		return result;
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
				if (elt == player0 || elt == player1 || elt == emptyCell) {
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

