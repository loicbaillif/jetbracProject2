package multidimensionalArrays;

import java.util.Scanner;

public class FillTheMatrix {

	public static void main(String[] args) {
		/* ****** EXERCISE : Fill the matrix by numbers ******
		 * Given the number n, not greater than 100, create a matrix of size 
		 * n*n and fill it using the following rule. 
		 * Numbers 0 should be stored on the primary (main) diagonal. 
		 * The two diagonals, adjacent to the primary one, should contain 
		 * numbers 1. 
		 * The next two diagonals should contain numbers 2; etc. 
		 * 
		 * Note: the primary diagonal runs from the top left corner to the 
		 * 		 bottom right corner. 
		 * 
		 * --> Sample Input 1: 
		 * 		5 
		 * 
		 * --> Sample Output 1: 
		 * 		0 1 2 3 4
		 * 		1 0 1 2 3 
		 * 		2 1 0 1 2 
		 * 		3 2 1 0 1 
		 * 		4 3 2 1 0
		 */

		Scanner scanner = new Scanner(System.in);
		byte nInput = scanner.nextByte(); // not greater than 100 ==> byte;
		int[][] matrix = new int[nInput][nInput];
		for (byte i = 0; i < nInput; i++) {
			for (byte j = 0; j < nInput; j++) {
				matrix[i][j] = j - i > 0 ? j - i : i - j;
				System.out.format("%d ", matrix[i][j]);
			}
			System.out.format("%n");
		}
		
		scanner.close();		
		System.out.println("****** END OF PROGRAM ******");
	}

}
