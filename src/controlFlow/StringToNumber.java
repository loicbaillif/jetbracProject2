package controlFlow;

import java.util.Scanner;

public class StringToNumber {

	public static void main(String[] args) {
		/* ****** NEW EXERCISE : From String to Integer ****** 
		 * 
		 * Write a program that reads a string from the standard input 
		 * and outputs the number. A number can be from 1 to 9 (inclusive).
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		int output = 0;
		
		switch (userInput) {
        case "one":
            output = 1;
            break;
        case "two":
            output = 2;
            break;
        case "three":
            output = 3;
            break;
        case "four":
            output = 4;
            break;
        case "five":
            output = 5;
            break;
        case "six":
            output = 6;
            break;
        case "seven":
            output = 7;
            break;
        case "eight":
            output = 8;
            break;
        case "nine":
            output = 9;
            break;
        default:
            break;
    }
		System.out.println(output);
		
		scanner.close();
	}

}
