package errorsInProg;

/* ****** EXERCISE : Fix the program (1) ******
 * You are given a program that should read three numbers
 * and output their sum.
 * For some reason, the program does not compile.
 * Fix all compile-time errors as well as logic-errors.
 * 
 * Erroneous program:
 * 
 * import java.util.Scanner; 
 * public class Main { 
 *     public static vo1d main(String[] args) { 
 *         Scanner scanner = new Scanner(System.in); 
 *             
 *         String a = scanner.next(); 
 *         int b = scanner.next(); 
 *         String c = scanner.next()
 *         
 *         String result = a - b - d;
 *         
 *         System.out.println(result); 
 *     }
 * }
 * 
 */
// Correction:

import java.util.Scanner; 

public class FixProgram1 { // not a bug but renamed FixProgram1

	public static void main(String[] args) { // Typo in "void"
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt(); // we need to sum ==> int type
		int b = scanner.nextInt(); // int ==> scanner.nextInt();
		int c = scanner.nextInt(); // end-of-line ; missing + int type

		int result = a + b + c; // Sum expected, and d does not exist
		// and result is an int, not a String.

		System.out.println(result);
		
		scanner.close(); // and remember to close the scanner...
	}
}


