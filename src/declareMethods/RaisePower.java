package declareMethods;

/* ****** EXERCISE : Raise power ******
 * 
 * You're given the method power that takes two int numbers n and m. 
 * The method should return the value of n^m as a long value.
 * 
 * Write a body of the method.
 */

import java.util.Scanner;

public class RaisePower {
	
	public static long power(int n, int m) {
		long result = 1L;
		while (m != 0) {
			result *= n;
			m--;
		}
		return result;
	}
	

	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
        
        scanner.close();
	}

}
