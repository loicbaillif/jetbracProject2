package interfaceAbstractClasses;

import java.util.Scanner;

class Theory implements TheoryInterface {
	
	public int timesFive(int userInput) {
		System.out.printf("Multiply %d by 5? Easy peasy.%n", userInput);
		System.out.println("I add a 0 at the end ... which gives ...");
		System.out.printf("\t%d%n", userInput * 10);
		System.out.println("Then I divide by 2! which gives ...");
		System.out.printf("%d / 2 => %d", userInput * 10, userInput * 10 / 2);
		return userInput * 10 / 2;
	}
	
	public boolean isEven(int userInput) {
		boolean result = false;
		int lastDigit = userInput % 10;
		System.out.println("Check if %d is even? even easier ...");
		System.out.printf("First, get %d last digit: %d", 
				userInput, lastDigit);
		System.out.printf("Then if it equals 0, 2, 4, 6 or 8 it means"
				+ "%d is even", userInput);
		if (lastDigit == 0
				|| lastDigit == 2
				|| lastDigit == 4 
				|| lastDigit == 6 
				|| lastDigit == 8) {
			result = true;
		}
		return result;
	}
	
	TheoryInterface instance = new Theory();
	
	// To be continued ...
	
	public static void main(String[] args) {
		Theory t1 = new Theory();
		int userInput = 1;
		int result;
		boolean isEven;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a natural int");
		if (scanner.hasNextInt() && scanner.nextInt() > 0) {
			userInput = scanner.nextInt();
		} else {
			scanner.next();
		}
		result = t1.timesFive(userInput);
		System.out.println(result);
		isEven = t1.isEven(userInput);
		System.out.printf("%d is even? %b", userInput, isEven);
		
	}
	
}
