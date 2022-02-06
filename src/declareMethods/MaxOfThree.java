package declareMethods;

import java.util.Scanner;

/* ****** EXERCISE : Find the max of three ******
 * 
 * Here is the method named getNumberOfMaxParam that takes three integer 
 * numbers and returns the position of the first maximum in the order of 
 * the method parameters.
 * 
 * The method should return number 1, 2 or 3 respectively.
 * 
 * Write just a body of the method.
 */

public class MaxOfThree {
	
	public static int getNumberOfMaxParam(int a, int b, int c) {
		return a >= b 
				? a >= c ? 1 : 3
				: b >= c ? 2 : 3;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
        
        scanner.close();
	}

}
