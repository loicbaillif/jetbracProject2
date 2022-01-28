package controlFlow;

import java.util.Scanner;

public class TestLearner {

	public static void main(String[] args) {
		/* ****** EXERCISE : Test Learner ****** 
		 * We need your help to improve an adaptive system. 
		 * There's a program that asks learners what programming language they
		 * are learning. There are four options, one of them is correct: 
		 * 
		 * 	1. Java
		 *  2. Kotlin
		 *  3. Scala 
		 *  4. Python
		 *  
		 *  Your task: read the answer’s number from the standard input and 
		 *  output the result of the test: "Yes!", "No!" or "Unknown number". 
		 *  We hope you know which answer is correct. You don't need to 
		 *  print the question itself.
		 */
		
		Scanner scanner = new Scanner(System.in);

		byte answer = scanner.nextByte();
		String result;

		switch (answer) {
		case 1:
			result = "Yes!";
			break;
		case 2: 
		case 3:
		case 4:
			result = "No!";
			break;
		default: 
			result = "Unknown number";
			break;
		}
		
		System.out.println(result);

		scanner.close();

	}

}
