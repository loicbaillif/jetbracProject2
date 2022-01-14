package iteratingOverArrays;

import java.util.Scanner;

public class RightRotation {

	public static void main(String[] args) {
		/* ****** EXERCISE : The right rotation ******
		 * A right rotation is an operation that shifts each element of an 
		 * array to the right. For example, if an array is {1,2,3,4,5} and we 
		 * right rotate it by 1, the new array will be {5,1,2,3,4}. If we 
		 * rotate it by 2, the new array will be {4,5,1,2,3}. It goes like 
		 * this: {1,2,3,4,5} -> {5,1,2,3,4} -> {4,5,1,2,3}. 
		 * Write a program that performs a right rotation on an array by a given number. 
		 * 
		 * --> Input format: 
		 * 		The first line is an array of numbers. 
		 * 		The second line is the number of rotations. 
		 * 
		 * --> Output format: 
		 * 		Resulting array
		 */
		
		Scanner scanner = new Scanner(System.in);
		String elts = scanner.nextLine();
		int nbRot = scanner.nextInt();
		String[] eltsA = elts.split(" ");
		int nbElts = eltsA.length;
		int nbRotNeeded = nbRot % nbElts;
		String temp;
		while (nbRotNeeded != 0) {
			temp = eltsA[nbElts-1];
			for (int i = nbElts-1; i > 0; i--) {
				eltsA[i] = eltsA[i-1];
			}
			eltsA[0] = temp;
			nbRotNeeded--;
		}
		
		for (String elt : eltsA) {
			System.out.format("%s ", elt);
		}
		
		System.out.format("%n");
		scanner.close();
		System.out.println("****** END OF PROGRAM ******");

	}

}
