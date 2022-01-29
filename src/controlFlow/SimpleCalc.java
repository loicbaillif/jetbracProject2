package controlFlow;

import java.util.Scanner;

public class SimpleCalc {

	public static void main(String[] args) {
		/* ****** EXERCISE : Simple Calculator ******
		 * 
		 * Write a simple calculator that reads the three values from the line:
		 * the first number, the operation, and the second number.
		 * 
		 * The program should apply the operation to the numbers entered 
		 * ("first number" "operation" "second number") and output the result 
		 * to the screen. Note that the numbers are long.
		 * 
		 * The calculator should support:
		 * 		addition: "+"
		 * 		subtraction: "-"
		 * 		integer division: "/"
		 * 		multiplication: "*"
		 * 
		 * If a user performs division and the second number is 0, it is 
		 * necessary to output the line "Division by 0!".
		 * 
		 * If the input operator is not one from the list, 
		 * the program should output "Unknown operator".
		 */

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] inputA = input.split(" ");
		String operator = ".";
		double num1 = 0.0;
		double num2 = 0.0;
		final int nbElts = 3;
		if (inputA.length == nbElts) {
			operator = inputA[1];
			num1 = Double.valueOf(inputA[0]);
			num2 = Double.valueOf(inputA[2]);
		} 
		double output = 0.0;
		boolean valid = true;
		String message = "Unknown operator";

		switch (operator) {
		case "+":
			output = num1 + num2;
			break;
		case "-":
			output = num1 - num2;
			break;
		case "*":
			output = num1 * num2;
			break;
		case "/": 
			if (num2 == 0) {
				valid = false;
				message = "Division by 0!";
				break;
			} else {
				output = (int) num1 / (int) num2;
				break;
			}
		default:
			valid = false;
			break;			
		}
		if (valid) {
			System.out.format("%d", Math.round(output));
		} else {
			System.out.println(message);
		}

		scanner.close();

	}

}
