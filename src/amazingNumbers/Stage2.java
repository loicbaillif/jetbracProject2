package amazingNumbers;

import java.util.Scanner;


/* ****** PROJECT AMAZING NUMBERS : Stage 2/8 - Duck Numbers ******
 * 
 * Description
 * Your next task is to determine whether a number is a Duck number. A Duck 
 * number is a positive number that contains zeroes. For example, 3210, 
 * 8050896, 70709 are Duck numbers. Note that a number with a leading 0 is not 
 * a Duck number. So, numbers like 035 or 0212 are not Duck numbers. 
 * Although, 01203 is a Duck, since it has a trailing 0.
 * 
 * In this stage, we need to simplify the way we display the information. 
 * We already have several properties that we need to show; we are going to 
 * add new features to our program in each stage. From now on, the card 
 * should follow this notation:
 * 
 * Properties of {number}
 * {property}: true/false
 * {property}: true/false
 * ...
 * {property}: true/false
 * 
 * In this stage, the properties are even, odd, buzz and duck. 
 * For 14, the program output should look like this:
 * 
 * Properties of 14
 *       even: true
 *       odd: false
 *       buzz: true
 *       duck: false
 *       
 * The property order, indentation, and spaces are not checked by the tests. 
 * The tests are also case-insensitive.
 * 
 * 
 * Objectives
 * Your program should print the properties of a natural number. 
 * In this stage, your program should:
 * 
 * Ask a user to enter a natural number;
 * If the number is not natural, the program should print an error message;
 * If the number is natural, the program should indicate 
 * the properties of the number;
 * Finish the program after printing the message.
 */

public class Stage2 {

	public static void main(String[] args) {
		/*
		Number number0 = new Number(1);
		Number number1 = new Number(22);
		Number number2 = new Number(333);
		Number number3 = new Number(1232);
		Number number4 = new Number(567);
		Number[] numberArray = {number0, number1, number2, number3, number4};
		for (Number numberTested : numberArray) {
			numberTested.presentNumber();
			System.out.println("\n**********\n");
		}
		*/
		
		Number userInput = new Number(getNatural());
		if (userInput.getNatural()) {
			userInput.presentNumber();
		}		
		
	}
	
	
	public static int getNatural() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a natural number:");
		int userInput = 0;
		if (scanner.hasNextInt()) {
			userInput = scanner.nextInt();
			if (userInput < 0) {
				userInput = 0;
			}
		}
		if (userInput == 0) {
			System.out.println("This number is not natural!");
		}
		scanner.close();
		return userInput;
	}

}
