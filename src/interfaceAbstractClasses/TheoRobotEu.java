package interfaceAbstractClasses;

public class TheoRobotEu implements TheoryInterface {
	
	public int timesFive(int userInput) {
		System.out.printf("Multiply %d by 5? Easy peasy.%n", userInput);
		System.out.println("I add a 0 at the end ... which gives ...");
		System.out.printf("\t%d%n", userInput * 10);
		System.out.println("Then I divide by 2! which gives ...");
		System.out.printf("%d / 2 => %d%n", userInput * 10, userInput * 10 / 2);
		return userInput * 10 / 2;
	}
	
	public boolean isEven(int userInput) {
		boolean result = false;
		int lastDigit = userInput % 10;
		System.out.printf("Check if %d is even? even easier ...%n", userInput);
		System.out.printf("First, get %d last digit: %d%n", 
				userInput, lastDigit);
		System.out.printf("Then if it equals 0, 2, 4, 6 or 8 it means "
				+ "%d is even%n", userInput);
		if (lastDigit == 0
				|| lastDigit == 2
				|| lastDigit == 4 
				|| lastDigit == 6 
				|| lastDigit == 8) {
			result = true;
		}
		return result;
	}

	
}
