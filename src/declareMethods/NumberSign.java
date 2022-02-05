package declareMethods;
import java.util.Scanner;

/* ****** EXERCISE : The sign of a number ******
 * 
 * Write a method with the name sign that takes an int number and checks 
 * whether the number is negative, positive or zero. The method should 
 * return -1, +1 or 0 respectively.
 */

public class NumberSign {
	
	public static int sign(int number) {
		int result = (number > 0) 
				? 1 
				: (number < 0) ? -1 : 0;
		return result;
	}

	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
        scanner.close();
	}

}
