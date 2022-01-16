package multidimensionalArrays;

import java.util.Scanner;

public class SwapColumns {

	public static void main(String[] args) {
		/* ****** EXERCISE : Swap Columns ******
		 * Given a two-dimensional array (matrix) and the two numbers: i and j.
		 * Swap the columns with indexes i and j within the matrix. 
		 * 
		 * Input contains matrix dimensions n and m, not exceeding 100, 
		 * then the elements of the matrix, then the indexes i and j.
		 * 
		 * --> Sample Input 1: 
		 * 		3 4
		 * 		11 12 13 14 
		 * 		21 22 23 24 
		 * 		31 32 33 34 
		 * 		0 1
		 * 
		 * --> Sample Output 1:
		 * 		12 11 13 14 
		 * 		22 21 23 24 
		 * 		32 31 33 34
		 */
		
		Scanner scanner = new Scanner(System.in);
		final byte iInput = scanner.nextByte();
		final byte jInput = scanner.nextByte();
		int[][] inputMatrix = new int[iInput][jInput];
		int[] pivot = new int[iInput];
		for (byte i = 0; i < iInput; i++) {
			for (byte j = 0; j < jInput; j++) {
				inputMatrix[i][j] = scanner.nextInt();
			}
		}
		final byte firstCol = scanner.nextByte();
		final byte secondCol = scanner.nextByte();
		for (byte k1 = 0; k1 < iInput; k1++) {
			pivot[k1] = inputMatrix[k1][firstCol];
			inputMatrix[k1][firstCol] = inputMatrix[k1][secondCol];
			inputMatrix[k1][secondCol] = pivot[k1];
		}
		for (int[] rows : inputMatrix) {
			for (int elt : rows) {
				System.out.format("%d ", elt);
			}
			System.out.format("%n");
		}		
		
		scanner.close();
		System.out.println("****** END OF PROGRAM ******");
		

	}

}
