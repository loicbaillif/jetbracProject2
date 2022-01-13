package iteratingOverArrays;

import java.util.Scanner;

public class TwoNumbersNeverOccur {

	public static void main(String[] args) {
		/* ****** EXERCISE : Two numbers never occur together ******
		 * 
		 * Write a program that reads an array of integers and two 
		 * numbers n and m. The program must check that n and m never 
		 * occur next to each other (in any order) in the array.
		 * 
		 * --> Input data format 
		 * 		The first line contains the size of an array.
		 * 		The second line contains elements of the array. 
		 * 		The third line contains two integer numbers n and m. 
		 * 		All numbers in the same line are separated by the space 
		 * 		character.
		 * 
		 * --> Output data format 
		 * 		The result is a single boolean value true if n and m never 
		 * 		occur next to each other; otherwise, it is false.
		 */
		Scanner scanner = new Scanner(System.in);
		short nbElts = scanner.nextShort();
		int[] elts = new int[nbElts];
		for (int i = 0; i < nbElts; i++) {
			elts[i] = scanner.nextInt();
		}
		int nNumber = scanner.nextInt();
		int mNumber = scanner.nextInt();
		boolean result = true;
		if (nbElts > 1) {
			for (int j = 1; j < nbElts; j++) {
				if (
						elts[j-1] == nNumber && elts[j] == mNumber || 
						elts[j-1] == mNumber && elts[j] == nNumber) {
					result = false;
					break;
				}
			}
		}
		System.out.format("%b%n", result);
		
		
		scanner.close();
		
		System.out.println("****** END OF PROGRAM ******");

	}

}
