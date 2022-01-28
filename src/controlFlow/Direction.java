package controlFlow;

import java.util.Scanner;

public class Direction {

	public static void main(String[] args) {
		/* ****** EXERCISE : Direction ******
		 * 
		 * Write a program, which reads the number of direction 
		 * (1 – up, 2 – down, 3 – left, 4 – right, 0 – do not move) 
		 * and outputs the text "move up" (or "move down", or "move left", or 
		 * "move right", or "do not move" depending on the entered number). 
		 * If it is a number that does not belong to any of the listed 
		 * directions, the program should output "error!"
		 */

		Scanner scanner = new Scanner(System.in);
		byte userInput = scanner.nextByte();
		final byte stay = 0;
		final byte up = 1;
		final byte down = 2;
		final byte left = 3;
		final byte right = 4;
		String output;
		switch (userInput) {
		case stay:
			output = "do not move";
			break;
		case up:
			output = "move up";
			break;
		case down:
			output = "move down";
			break;
		case left:
			output = "move left";
			break;
		case right:
			output = "move right";
			break;
		default:
			output = "error!";
			break;
		}
		
		System.out.println(output);


		scanner.close();
	}

}
