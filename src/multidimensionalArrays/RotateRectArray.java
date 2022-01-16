package multidimensionalArrays;

import java.util.Scanner;

public class RotateRectArray {

	public static void main(String[] args) {
		/* ****** EXERCISE : Rotate rectangle array ******
		 * Given a rectangle array n×m in size. Rotate it by 90 degrees 
		 * clockwise, by recording the result into the new array m×n in size. 
		 * 
		 * -->Input data format 
		 * 		Input consists of the two numbers n and m, not exceeding 100, 
		 * 		and then an array n×m in size. 
		 * 
		 * --> Output data format 
		 * 		Output the resulting array. Separate numbers by a single 
		 * 		space in the output.
		 * 
		 * --> Sample Input 1: 
		 * 		3 4 
		 * 		11 12 13 14 
		 * 		21 22 23 24 
		 * 		31 32 33 34 
		 * 
		 * --> Sample Output 1: 
		 * 		31 21 11 
		 * 		32 22 12 
		 * 		33 23 13 
		 * 		34 24 14
		 */
		
		Scanner scanner = new Scanner(System.in);
		byte nInput = scanner.nextByte(); // does not exceed 100 ==> byte;
		byte mInput = scanner.nextByte(); // does not exceed 100 ==> byte;
		int[][] inputArray = new int[nInput][mInput];
		int[][] outputArray = new int[mInput][nInput];
		int temp;
		for (byte i = 0; i < nInput; i++) {
			for (byte j = 0; j < mInput; j++) {
				temp = scanner.nextInt();
				inputArray[i][j] = temp;
				outputArray[j][nInput - i - 1] = temp;
			}
		}
		
		for (int[] row : outputArray) {
			for (int elt : row) {
				System.out.format("%d ", elt);
			}
			System.out.format("%n");
		}
		
		scanner.close();
		System.out.println("****** END OF PROGRAM ******");

	}

}
