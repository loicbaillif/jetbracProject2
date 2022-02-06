package declareMethods;

import java.util.Scanner;

/* ****** EXERCISE : Sum In Range ******
 * 
 * Implement a method sumInRange for calculating 
 * the sum of numbers in the range from (inclusive), to (exclusive).
 */

public class SumInRange {
	
	public static long sumInRange(int from, int to) {
		// Based on mathematics formula
		// sum = (first + last) * number of elements / 2
		return (long) (from + to - 1) * (to - from) / 2L;
	}

	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);

        int from = scanner.nextInt();
        int to = scanner.nextInt();

        System.out.println(sumInRange(from, to));

        scanner.close();
	}

}
