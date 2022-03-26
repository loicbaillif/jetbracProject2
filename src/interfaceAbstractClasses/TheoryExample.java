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
		System.out.println("*** The EU robot:");
		result = tr1.timesFive(userInput);
		System.out.println("\n*** The US robot:");
		result = tr2.timesFive(userInput);
		System.out.println("\n\t****** SECOND EXERCISE ******\n");
		System.out.println("*** The EU robot:");
		isEven = tr1.isEven(userInput);
		System.out.printf("******%n%d is even? %b%n", userInput, isEven);
		System.out.println("\n*** The US robot:");
		isEven = tr2.isEven(userInput);
		System.out.printf("******%n%d is even? %b%n", userInput, isEven);
		System.out.println("\n\t****** THIRD EXERCISE ******\n");
		System.out.println("*** The EU robot:");
		tr1.defaultMethod();
		System.out.println("\n*** The US robot:");
		tr2.defaultMethod();
		System.out.println("\n\t****** FOURTH EXERCISE ******\n");
		System.out.println("*** The EU robot:");
		tr1.staticMethod();
		System.out.println("\n*** The US robot:");
		tr2.defaultMethod();
	}

}
