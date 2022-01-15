package multidimensionalArrays;

import java.util.Scanner;

public class StarArray {

	public static void main(String[] args) {
		/* ****** EXERCISE : Star Array ******
		 * Your task is to draw a star on the n×n field using the 
		 * symbols . and *. n is odd and doesn't exceed 15.
		 * 
		 * --> Sample Input:
		 * 		9
		 * 
		 * --> Sample Output: 
		 * 		* . . . * . . . *
		 * 		. * . . * . . * .
		 * 		. . * . * . * . . 
		 * 		. . . * * * . . . 
		 * 		* * * * * * * * * 
		 * 		. . . * * * . . . 
		 * 		. . * . * . * . . 
		 * 		. * . . * . . * . 
		 * 		* . . . * . . . *
		 */
		
		Scanner scanner = new Scanner(System.in);
		byte nInput = scanner.nextByte(); // n doesn't exceed 15 ==> byte;
		
		
		
		scanner.close();
		System.out.println("****** END OF PROGRAM ******");
	}

}
