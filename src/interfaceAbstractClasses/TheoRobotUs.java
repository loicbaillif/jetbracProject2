package interfaceAbstractClasses;

public class TheoRobotUs implements TheoryInterface {
	
	public int timesFive(int userInput) {
		int result = userInput + userInput;
		System.out.println("Oh yeah, the Yankee way!");
		System.out.printf("You want me to multiply %d by 5 dude?", userInput);
		System.out.println("I can do it in 4 steps!");
		System.out.printf("\t1) %d + %d = %d%n", userInput, userInput, result);
		System.out.printf("\t2) %d + %d = %d%n", result, userInput, 
				result + userInput);
		result += userInput;
		System.out.printf("\t3) %d + %d = %d%n", result, userInput, 
				result + userInput);
		result += userInput;
		System.out.printf("\t4) %d + %d = %d%n", result, userInput, 
				result + userInput);
		result += userInput;
		
		return result;
	}
	
	public boolean isEven(int userInput) {
		return false;
	}
}
