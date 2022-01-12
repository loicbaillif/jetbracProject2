package iteratingOverArrays;

import java.util.Scanner;

public class DoesArrayContainN {

	public static void main(String[] args) {
		/* ***** EXERCISE *****
		 * Write a program that reads an array of integers and an integer. 
		 * The program must check if the array contains that number. 
		 * 
		 * --> Input data format
		 * 		The first line: the size of an array.
		 * 		The second line: all the elements of the array separated by the space. 
		 * 		The third line: one integer.
		 * 
		 *  --> Output data format 
		 *  	Only a single value: true or false.
		 */
		Scanner scanner = new Scanner(System.in);
		short nbElts = scanner.nextShort();
		int[] elts = new int[nbElts];
		boolean result = false;
		for (int i = 0; i < nbElts; i++) {
			elts[i] = scanner.nextInt();
		}
		int nNumber = scanner.nextInt();
		for (int elt : elts) {
			if (elt == nNumber) {
				result = true;
				break;
			}
		}
		System.out.print(result);
		scanner.close();
	}

}
