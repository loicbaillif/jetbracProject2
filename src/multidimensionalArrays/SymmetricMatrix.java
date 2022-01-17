package multidimensionalArrays;

import java.util.Scanner;

public class SymmetricMatrix {

	public static void main(String[] args) {
		/* ****** EXERCISE : Symmetric Matrix ******
		 * Given the number n, not exceeding 10, and a matrix of size n × n. 
		 * Check whether this matrix is symmetric in relation to the main 
		 * diagonal. Output the word “YES”, if it is symmetric and the 
		 * word “NO” otherwise. 
		 * 
		 * Keep in mind that the main diagonal runs from the top left corner 
		 * to the bottom right corner.
		 * 
		 * --> Sample input: 
		 * 		3
		 * 		0 1 2
		 * 		1 2 3
		 * 		2 3 4
		 * 
		 * --> Sample output:
		 * 		YES
		 */
		
		Scanner scanner = new Scanner(System.in);
		byte nInput = scanner.nextByte(); // n does not exceed 10 ==> byte
		int[][] matrix = new int[nInput][nInput];
		boolean result = true;
		for (byte i = 0; i < nInput; i++) {
			for (byte j = 0; j < nInput; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		for (byte k1 = 0; k1 < nInput; k1++) {
			for (byte k2 = 0; k2 < nInput; k2++) {
				if (k1 <= k2) {
					continue;
				}
				if (matrix[k1][k2] != matrix[k2][k1]) {
					result = false;
				}
			}
		}
		System.out.println(result ? "YES" : "NO");
		
		scanner.close();
		System.out.println("****** END OF PROGRAM ******");
	}

}
