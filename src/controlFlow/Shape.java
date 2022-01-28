package controlFlow;

import java.util.Scanner;

public class Shape {

	public static void main(String[] args) {
		/* ****** NEW EXERCISE : Shape ******
		 * 
		 * Write a program, which reads the number of the shape 
		 * (1 – square, 2 – circle, 3 – triangle, 4 – rhombus) 
		 * and prints the text "You have chosen a square" 
		 * (or circle, or triangle, or rhombus, depending on the number). 
		 * If it is a number that doesn't correspond to any of the listed 
		 * shapes, the program should output: "There is no such shape!". 
		 * 
		 * Note: the output text should exactly match the sample, 
		 * including letters' case and location of spaces.
		 */
		
		Scanner scanner = new Scanner(System.in);
		byte userInput = scanner.nextByte();
		String output = "There is no such shape!";
		switch (userInput) {
		case 1:
			output = "You have chosen a square";
			break;
		case 2:
			output = "You have chosen a circle";
			break;
		case 3:
			output = "You have chosen a triangle";
			break;
		case 4:
			output = "You have chosen a rhombus";
			break;
		default:
			break;
		}
		System.out.println(output);
		
		scanner.close();
	}

}
