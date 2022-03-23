package interfaceAbstractClasses;

import java.util.Scanner;

public class TheoryExample {

	public static void main(String[] args) {
		TheoRobotEu tr1 = new TheoRobotEu();
		TheoRobotUs tr2 = new TheoRobotUs();
		int userInput = 1;
		int result;
		boolean isEven;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a natural int");
		if (scanner.hasNextInt()) {
			userInput = scanner.nextInt();
			if (userInput < 1) {
				userInput = 1;
			}
		} else {
			scanner.next();
		}
		System.out.println("\n\t****** FIRST EXERCISE ******\n");
		result = tr1.timesFive(userInput);
		System.out.printf("******%n%d*5 = %d%n", userInput, result);
		result = tr2.timesFive(userInput);
		System.out.printf("******%n%d*5 = %d%n", userInput, result);
		System.out.println("\n\t****** SECOND EXERCISE ******\n");
		isEven = tr1.isEven(userInput);
		System.out.printf("******%n%d is even? %b%n", userInput, isEven);
		isEven = tr2.isEven(userInput);
		System.out.printf("******%n%d is even? %b%n", userInput, isEven);
		
	}

}
