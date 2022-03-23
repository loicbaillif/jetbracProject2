package interfaceAbstractClasses;

import java.util.Scanner;

public class TheoryExample {

	public static void main(String[] args) {
		TheoRobotEu tr1 = new TheoRobotEu();
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
		result = tr1.timesFive(userInput);
		System.out.printf("******%n%d*5 = %d%n", userInput, result);
		isEven = tr1.isEven(userInput);
		System.out.printf("******%n%d is even? %b", userInput, isEven);
	}

}
