package multidimensionalArrays;

import java.util.Scanner;

public class MaxElement {

	public static void main(String[] args) {
		/* ****** EXERCISE : Maximum Element in a matrix ******
		 * Find the indexes of the initial appearance of the maximum 
		 * element in a matrix. 
		 * 
		 * --> Input data format 
		 * 		On the input, the program receives the size of matrix n and m,
		 * 		and then n lines having m integer numbers in each. n and m 
		 * 		do not exceed 100. 
		 * 
		 * --> Output data format 
		 * 		Output two numbers: the row index and the column index, in 
		 * 		which the greatest item in the two-dimensional array (matrix) 
		 * 		is located. If there are several such elements, output the 
		 * 		one, which has the smaller row index; and if row indexes are 
		 * 		the same, output the one having the smaller column index.
		 */
		Scanner scanner = new Scanner(System.in);
		byte nRows = scanner.nextByte(); // does not exceed 100 ==> byte
		byte mColumns = scanner.nextByte(); // does not exceed 100 ==> byte
		int[][] matrix = new int[nRows][mColumns];
		int max = Integer.MIN_VALUE; // Initialize with minimal value possible
		byte rowMax = 0;
		byte colMax = 0;
		for (byte i = 0; i < nRows; i++) {
			for (byte j = 0; j < mColumns; j++) {
				matrix[i][j] = scanner.nextInt();
				if (max < matrix[i][j]) {
					max = matrix[i][j]; // Store the new max value
					rowMax = i; // Store its coordinates in the matrix
					colMax = j; 
				}				
			}
		}
		System.out.format("%d %d%n", rowMax, colMax);
		
		scanner.close();
		System.out.println("****** END OF PROGRAM ******");

	}

}
