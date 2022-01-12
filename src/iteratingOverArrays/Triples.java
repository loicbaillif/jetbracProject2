package iteratingOverArrays;

import java.util.Scanner;

public class Triples {

	public static void main(String[] args) {
		/* ****** EXERCISE : TRIPLES ******
		 * Write a program that reads an array of ints and outputs 
		 * the number of "triples" in the array. 
		 * A "triple" is three consecutive ints in increasing order differing 
		 * by 1 (i.e. 3,4,5 is a triple, but 5,4,3 and 2,4,6 are not). 
		 * 
		 * --> Input data format 
		 * 		The first line contains the size of an array. 
		 * 		The second line contains elements of the array separated by spaces. 
		 * 
		 * 	--> Output data format 
		 * 		Only a single integer value: the number of "triples".
		 */
		Scanner scanner = new Scanner(System.in);
		short nbElts = scanner.nextShort();
		int[] elts = new int[nbElts];
		short nbTriple = 0;
		for (int i = 0; i < nbElts; i++) {
			elts[i] = scanner.nextInt();
		}
		for (int j = 0; j < nbElts - 2; j++) {
			if (elts[j] + 1 == elts[j+1] && elts[j+1] + 1 == elts[j+2]) {
				nbTriple++;
			}
		}
		System.out.format("%d%n", nbTriple);
		scanner.close();
		
		System.out.println("***** END OF PROGRAM *****");
	}

}
