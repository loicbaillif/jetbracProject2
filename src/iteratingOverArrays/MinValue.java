package iteratingOverArrays;

import java.util.Scanner;

public class MinValue {

	public static void main(String[] args) {
		/* ****** EXERCISE ******
		 * Write a program that reads an array of integers and finds the minimum value of the array.
		 * --> Input data format 
		 * 		The first line contains the size of an array. 
		 * 		The second line contains elements of the array separated by spaces. 
		 * --> Output data format 
		 * 		An integer number representing the minimum in the input array.
		 */
		Scanner scanner = new Scanner(System.in);
		short nbElts = scanner.nextShort();
        int[] elts = new int[nbElts];
        for (; nbElts > 0; nbElts--) {
            elts[nbElts - 1] = scanner.nextInt();
        }
        int min = elts[0];
        for (int elt : elts) {
            min = min < elt ? min : elt;
        }
		System.out.println(min);
		
		scanner.close();
	}

}
