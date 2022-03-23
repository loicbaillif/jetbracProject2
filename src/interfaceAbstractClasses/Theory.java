package interfaceAbstractClasses;

import java.util.Scanner;

class Theory implements TheoryInterface {
	
	public int timesFive(int userInput) {
		System.out.println("Multiply by 5? Easy peasy.");
		System.out.println("I add a 0 at the end ... which gives ...");
		System.out.printf("\t%d%n", userInput * 10);
		System.out.println("Then I divide by 2! which gives ...");
		System.out.printf("%d / 2 => %d", userInput * 10, userInput * 10 / 2);
		return userInput * 10 / 2;
	}
	
	public boolean isEven(int userInput) {
		System.out.println("Class Theory: instanceMethod2 ...");
		return false;
	}
	
	TheoryInterface instance = new Theory();
	
	// To be continued ...
	
	public static void main(String[] args) {
		Theory t1 = new Theory();
		int userInput = 1;
		int result;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a natural int");
		if (scanner.hasNextInt() && scanner.nextInt() > 0) {
			userInput = scanner.nextInt();
		} else {
			scanner.next();
		}
		result = t1.timesFive(userInput);
		System.out.println(result);
		
	}
	
}
