package iteratingOverArrays;

import java.util.Scanner;

public class countOccurences {

	public static void main(String[] args) {
		/* ***** Exercise *****
		 * Count how many times a number occurs:
		 * Write a program that reads an array of ints and an integer number n.
		 * The program must check how many times n occurs in the array. 
		 * --> Input data format
		 * 		The first line contains the size of the input array.
		 * 		The second line contains elements of the array separated by spaces.
		 * 		The third line contains n.
		 * --> Output data format 
		 * 		The result is only a single non-negative integer number.
		 */
		
		Scanner scanner = new Scanner(System.in);
		short nbElts = scanner.nextShort();
		int[] elts = new int[nbElts];
		for (int i = 0; i < nbElts; i++) {
			// Filling the array
			elts[i] = scanner.nextInt();
		}
		int nNumber = scanner.nextInt();
		short cpt = 0;
		for (int elt : elts) {
			cpt += elt == nNumber ? 1 : 0;
		}
		System.out.println(cpt);
	}

}
