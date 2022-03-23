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
		System.out.println("Not convinced by the Yankee way yet dude?!");
		System.out.printf("So now you want me to tell you if %d is even?", 
				userInput);
		System.out.println("I'll do it mym way dude. Just need one check");
		System.out.printf("What's the remaining of %d divided by 2? "
				+ "if it is 0, %d is even. Else it is NOT! Yeah!", 
				userInput, userInput);
		System.out.printf("Yeah dude, that's %d ... ", userInput%2);
		return userInput % 2 == 0;
	}
}
