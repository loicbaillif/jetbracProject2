package multidimensionalArrays;

public class CreateCube {

	public static void main(String[] args) {
		/* ****** EXERCISE : Create Cube ******
		 * You need to implement the createCube method. It should create 
		 * a 3x3x3 three-dimensional array with the following content: 
		 * 
		 * [0, 1, 2]	[3, 4, 5]	[6, 7, 8] 
		 * [0, 1, 2]	[3, 4, 5]	[6, 7, 8] 
		 * [0, 1, 2]	[3, 4, 5]	[6, 7, 8] 
		 * 
		 * The elements should be of type int.
		 */
		
		createCube();
	}
	
	public static int[][][] createCube() {
		
		final byte size = 3;
		final int[] zDimension = {0, 1, 2};
		int[][][] cube = new int[size][size][size];
		for (byte i = 0; i < size; i++) {
			for (byte j = 0; j < size; j++) {
				for (byte k = 0; k < size; k++) {
					cube[i][j][k] = zDimension[k] + size * j;
				}
			}
		}
		
		return cube;

	}

}
