package iteratingOverArrays;

import java.util.Scanner;

public class MaxProductAdjacent {

	public static void main(String[] args) {
		/* ****** EXERCISE : Maximum Product of 2 adjacent numbers ******
		 * 
		 * Write a program that reads an array of ints and outputs the 
		 * maximum product of two adjacent elements in the given array 
		 * of non-negative numbers. 
		 * 
		 * --> Input data format 
		 * 		The first line of the input contains the number of 
		 * 		elements in the array. 
		 * 		The second line contains the elements of the array 
		 * 		separated by spaces. 
		 * 
		 * The array always has at least two elements.
		 */
		
		Scanner scanner = new Scanner(System.in);
		short nbElts = scanner.nextShort();
		int[] elts = new int[nbElts];
		for (short i = 0; i < nbElts; i++) {
			elts[i] = scanner.nextInt();
		}
		int maxProduct = elts[0] * elts[1];
		for (int j = 2; j < nbElts; j++) {
			maxProduct = elts[j-1] * elts[j] > maxProduct 
					? elts[j-1] * elts[j] 
					: maxProduct;
		}
		
		System.out.format("%d%n", maxProduct);
		
		scanner.close();
		System.out.println("****** END OF PROGRAM ******");
	}

}
