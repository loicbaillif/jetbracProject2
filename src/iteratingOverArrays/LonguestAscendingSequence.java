package iteratingOverArrays;

import java.util.Scanner;

public class LonguestAscendingSequence {

	public static void main(String[] args) {
		/* ****** EXERCISE : Longuest Ascending Sequence ******
		 * Write a program that reads an array of ints and outputs the length 
		 * of the longest sequence in strictly ascending order. Elements of 
		 * the sequence must go one after another. A single number is assumed 
		 * to be an ordered sequence with the length = 1. 
		 * 
		 * --> Input data format 
		 * 		The first line contains the size of an array. 
		 * 		The second line contains elements of the array separated 
		 * 		by spaces. 
		 * 
		 * Example 
		 * 		The input array is 1 2 4 1 2 3 5 7 4 3. In this case, the 
		 * 		length of the longest sequence in ascending order is 5. 
		 * 		It includes the following elements: 1 2 3 5 7.
		 */
		Scanner scanner = new Scanner(System.in);		
		short nbElts = scanner.nextShort();
		int[] elts = new int[nbElts];
		short longest = 1;
		short temp = 1;
		for (int i = 0; i < nbElts; i++) {
			elts[i] = scanner.nextInt();
		}
		for (int j = 0; j < nbElts - 1; j++) {
			if (elts[j+1] > elts[j]) {
				temp++;
			} else {
				// Store longest sequence
				longest = longest > temp ? longest : temp;
				temp = 1;
			} 
		}
		System.out.format("%d", longest > temp ? longest : temp);
		scanner.close();
		System.out.println("****** END OF PROGRAM ******");
	}

}
