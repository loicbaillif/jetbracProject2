package controlFlow;

import java.util.Scanner;

public class floorSpace {

	public static void main(String [] args) {
		
		/* ****** NEW EXERCISE : Floor-space of the room ******
		 * 
		 * Citizens of the country named Malevia often experiment with the 
		 * shapes of their rooms. The rooms can be triangular, 
		 * rectangular, and round. 
		 * 
		 * Write a program that calculates the floor area of the rooms. 
		 * 
		 * Input data format: The type of the room shape and the 
		 * relevant parameters. 
		 * 
		 * Output data format: The area of the resulting room. 
		 * 
		 * Note that the value of 3.14 is used instead of the number 
		 * (pi) in Malevia.
		 */
		
		Scanner scanner = new Scanner(System.in);
		String shape = scanner.nextLine();
		final double pi = 3.14; // Malevians ...
		double result = 0.0;
		switch (shape) {
		case "triangle": {
			double a = (double) scanner.nextInt();
			double b = (double) scanner.nextInt();
			double c = (double) scanner.nextInt();
			double s = (a + b + c) / 2;
			result = Math.sqrt(s * (s - a) * (s - b) * (s - c));
			break;
		}
		
		case "rectangle": {
			double a = (double) scanner.nextInt();
			double b = (double) scanner.nextInt();
			result = a * b;
			break;
		}
		
		case "circle": {
			double r = (double) scanner.nextInt();
			result = pi * r * r;
			break;
		}
		
		default: 
			System.out.println("This is not a shape for a proper room");
			break;

		}
		
		System.out.println(result);


		scanner.close();
	}
}
