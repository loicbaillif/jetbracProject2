package iteratingOverArrays;

import java.util.Scanner;

public class SortedAscending {

	public static void main(String[] args) {
		/* ****** EXERCISE : Check if an array is sorted ascending ******
		 * 
		 * Write a program that reads an array of int's and checks if the 
		 * array is sorted ascending (from smallest to largest number). 
		 * 
		 * --> Input data format 
		 * 		The first line contains the size of an array. 
		 * 		The second line contains elements of the array separated 
		 * 		by spaces. 
		 * 
		 * --> Output data format 
		 * 		Only a single value: true or false.
		 */
		
		Scanner scanner = new Scanner(System.in);
		short nbElts = scanner.nextShort();
		int[] elts = new int[nbElts];
		boolean result = true;
		if (nbElts > 0) {
			elts[0] = scanner.nextInt();
		}
		for (short i = 1; i < nbElts; i++) {
			elts[i] = scanner.nextInt();
			if (elts[i] < elts[i-1]) {
				result = false;
				break; // Not needed to build the array entirely
			}
		}
		System.out.format("%b%n", result);
		
		scanner.close();
		System.out.println("****** END OF PROGRAM ******");
	}

}
