package functionalDecomposition;

import java.util.Scanner;

/* ****** EXERCISE : Simple calculator ******
 * 
 * In a template below you have a simple calculator that subtracts, sums, 
 * divides, and multiplies the two numbers inside the switch statement. 
 * Now, we've decided to upgrade it to perform more complex tasks, such as 
 * logarithmic functions. For that, separate methods are a better solution. 
 * Let's start with decomposing what we have.
 * 
 * Take a look at the template and decompose operations of the calculator 
 * into four methods: subtractTwoNumbers(long a, long b) for subtraction, 
 * sumTwoNumbers(long a, long b) for adding, divideTwoNumbers(long a, long b) 
 * for integer division and multiplyTwoNumbers(long a, long b) 
 * for multiplication. Each method should print the result of calculations.
 * 
 * Note that you can't divide by zero. In case your second argument is zero, 
 * you should print the "Division by 0!" message.
 */

public class SimpleCalculator {

	public static void subtractTwoNumbers(long a, long b) {
		System.out.print(a - b);
	}

	public static void sumTwoNumbers(long a, long b) {
		System.out.print(a + b);
	}

	public static void divideTwoNumbers(long a, long b) {
		System.out.printf(b == 0 ? "Division by 0!" : "%.3f", (double) a / b);
	}

	public static void multiplyTwoNumbers(long a, long b) {
		System.out.print(a * b);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] userInput = scanner.nextLine().split(" ");
		switch (userInput[1]) {
		case "+":
			sumTwoNumbers(
					Long.parseLong(userInput[0]), 
					Long.parseLong(userInput[2]));
			break;
		case "-":
			subtractTwoNumbers(
					Long.parseLong(userInput[0]), 
					Long.parseLong(userInput[2]));
			break;
		case "*":
			multiplyTwoNumbers(
					Long.parseLong(userInput[0]), 
					Long.parseLong(userInput[2]));
			break;
		case "/":
			divideTwoNumbers(
					Long.parseLong(userInput[0]), 
					Long.parseLong(userInput[2]));
			break;
		default: 
			System.out.println("Unknown operation");
			break;
		}

		scanner.close();
	}

}
