package iteratingOverArrays;

import java.util.Scanner;

public class IndexFirstMax {

	public static void main(String[] args) {
		/* ****** EXERCISE : Index of first max ******
		 * Write a program that reads an array of ints and finds the index of 
		 * the first maximum in that array. 
		 * 
		 * --> Input data format 
		 * 		The first line contains the number of elements in the array. 
		 * 		The second line contains the array elements separated by spaces. 
		 * 		An array always has at least one element. 
		 * 
		 * --> Output data format 
		 * 		Only a single integer value: the index of the first maximum.
		 */
		Scanner scanner = new Scanner(System.in);
		short nbElts = scanner.nextShort();
		int[] elts = new int[nbElts];
		short indexMax = 0;
		for (short i = 0; i < nbElts; i++) {
			elts[i] = scanner.nextInt();
		}
		int max = elts[0];
		for (short j = 1; j < nbElts; j++) {
			if (elts[j] > max) {
				indexMax = j;
				max = elts[j];
			}
		}
		System.out.format("%d%n", indexMax);
		
		
		scanner.close();
		
		System.out.println("****** END OF PROGRAM ******");

	}

}
