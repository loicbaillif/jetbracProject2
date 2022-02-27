package amazingNumbers;

import java.util.Scanner;


/* ****** PROJECT AMAZING NUMBERS : Stage 1/8 - Buzz Numbers ****** 
 * 
 * 
 * Description
 * Integers can be even or odd. All numbers that end with 0, 2, 4, 6, or 8 are 
 * even; the rest are odd. However, numbers have many other properties, you 
 * will learn about some of them in this project.
 * 
 * First, let's talk about Buzz numbers. They are numbers that are either 
 * divisible by 7 or end with 7. For example, the number 14 is a buzz number, 
 * since it is divisible by 7 without a remainder; the number 17 ends with 7, 
 * so it is also a buzz number. However, the number 75 is not a Buzz number, 
 * since it is neither divisible by 7 nor does it end with 7. 
 * The number 7 is a Buzz number too.
 * 
 * Your task at this stage is to write a program that prints the natural 
 * number parity and determines whether this number is a Buzz. The program 
 * should print why this number is a Buzz number.
 * 
 * Do you know how to determine whether a number is divisible by 7 or not? 
 * We have a great tip:
 * 
 * - Remove the last digit;
 * - Multiply the removed digit by 2 and subtract it from the remaining number.
 * - If the result of the subtraction can be divided by 7, then the initial 
 * 	 number is divisible by 7. You can apply the whole sequence multiple times 
 *   until you get a relatively small/easy-to-interpret subtraction result.
 *   
 * For example, take 196. We remove the last digit and get 19. We subtract 12 
 * (the removed digit multiplied by 2) to get 7. Since the last left digit 
 * is 7, the number is multiple of 7. So 196 is a Buzz number!
 * 
 * You can use any solution you want, the tests won't check it.
 * 
 * 
 * Objectives
 * Your program should check whether the given natural number is a buzz number.
 * 
 * 1) Ask a user to enter a natural number.
 * 2) If the number is not natural, print an error message.
 * 3) Calculate and print the parity of the number.
 * 4) Check whether is the number is a Buzz number and print the explanation. 
 * 5) Finish the program after printing the message. 
 * 
 * Natural numbers are whole numbers starting from 1.
 * 
 */

public class BuzzNumbers {

	final static String askNumber = "Enter a natural number:";
	final static String buzzStatus1 = "%d is neither divisible by 7 "
			+ "nor does it end with 7";
	final static String buzzStatus2 = "%d is divisible by 7";
	final static String buzzStatus3 = "%d ends with 7";
	final static String buzzStatus4 = "%d is divisible by 7 and ends with 7";
	final static String notNatural = "This number is not natural!";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(askNumber);
		int n = isNatural();
		if (n != 0) {
			isEven(n);
			isBuzz(n);
		} 
	}
	
	
	public static boolean divisibleBy7(int n) {
		// Guaranteed to be > 0;
		boolean result = false;
		int unitDigit;
		int mainDigits = n;
		int remainingDigits;
		do {
			unitDigit = mainDigits % 10;
			remainingDigits = (mainDigits / 10) - (2 * unitDigit);
			mainDigits = remainingDigits;
			if (remainingDigits == 0 || remainingDigits == 7) {
				result = true;
			}
		} while (mainDigits > 9);
		
		return result;
	}


	public static void isBuzz(int n) {
		int unitNumber = n % 10;
		// buzzStatus : {isBuzz?, buzzDetail0?, buzzDetail1?, buzzDetail2?, 
		// 				 buzzDetail3?, buzzDetail4}
		boolean[] buzzStatus = {false, false, false, false, false};
		if (unitNumber == 7) {
			buzzStatus[0] = true;
			buzzStatus[3] = true;
		}
		
		System.out.printf("%d is a Buzz?%n", n);
	}


	public static void isEven(int n) {
		if (n % 2 == 0) {
			System.out.println("This number is Even.");
		} else {
			System.out.println("This number is Odd.");
		}
	}


	public static int isNatural() {
		Scanner scanner = new Scanner(System.in);
		int userInput;

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("An integer number please ...");
		} 
		userInput = scanner.nextInt();
		if (userInput < 0) {
			System.out.println(notNatural);
			userInput = 0;
		}		
		scanner.close();
		return userInput;
	}

}
