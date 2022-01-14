package iteratingOverArrays;

import java.util.Scanner;

public class AlphabeticalOrder {

	public static void main(String[] args) {
		/* ****** EXERCISE : Alphabetical Order ******
		 * 
		 * Write a program that reads an array of lowercase strings and checks 
		 * whether the array is in alphabetical order or not.
		 * 
		 * --> Input data format 
		 * 		The single input line contains lowercase strings separated 
		 * 		by spaces. 
		 * 
		 * --> Output data format 
		 * 		Only a single word: true or false.
		 */
		
		Scanner scanner = new Scanner(System.in);
		String words = scanner.nextLine();
		String[] wordsA = words.split(" ");
		boolean result = true;
		for (int i = 1; i < wordsA.length; i++) {
			if (wordsA[i].compareTo(wordsA[i - 1]) < 0) {
				result = false;
				break; // One failed check is sufficient, no need to go further.
			}
		}		
		
		System.out.format("%b%n", result);
		
		scanner.close();
		System.out.println("****** END OF PROGRAM ******");
	}

}
