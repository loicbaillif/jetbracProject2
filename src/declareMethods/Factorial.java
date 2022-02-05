package declareMethods;
import java.util.Scanner;

/* ****** EXERCISE : Factorial ******
 * 
 * Write a method that calculates the factorial of a given number.
 * 
 * The factorial of n is calculated by the product of integer number 
 * from 1 to n (inclusive). The factorial of 0 is equal to 1.
 */

public class Factorial {
	
	public static long factorial(long n) {
		long result = 1L;
		while (n > 1) {
			result *= n--;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
        scanner.close();
	}

}
