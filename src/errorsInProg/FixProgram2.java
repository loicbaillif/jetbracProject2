package errorsInProg;

/* ****** EXERCISE : Fix the program (2) ******
 * 
 * Given a program that reads one number and outputs it incremented by one.
 * Now the program cannot compile.
 * Fix all compile-time errors as well as logic-errors.
 * 
 * Erroneous program:
 * 
 * port java.util.Scanner; 
 * public class Main { 
 *     public static void main(String[] args) {
 *         Scanner scanner = new Scanner(System.in); 
 *         int number = scanner.nextInt(); 
 *         System.out.println(nextInt); 
 *     } 
 * } 
 */

// Correction

import java.util.Scanner; // typo corrected (port)

public class FixProgram2 { // renamed "FixProgram2" for personal organization

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		int number = scanner.nextInt(); 
		System.out.println(++number); // input is incremented, then printed
		
		scanner.close(); // And we remember to close the scanner
	}

}
