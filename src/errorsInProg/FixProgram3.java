package errorsInProg;

/* ****** EXERCISE : Fix the program (3) ******
 * 
 * Given a program that reads two lines and outputs them in another order. 
 * Now the program cannot compile. 
 * Fix all compile-time errors as well as logic-errors.
 * 
 * Erroneous Program:
 * 
 * import java.util.Scanner;
 * 
 * public clazz Main { 
 *     public static void main(String[] args) { 
 *     	   scanner = new Scanner(System.in); 
 *         String line1 = scanner.nextLine(); 
 *         String line2 = scanner.nextLine(); 
 *
 *         System.out.println(line1); 
 *         System.out.println(line2); 
 *     }
 * }
 */

// Correction:

import java.util.Scanner;

public class FixProgram3 { // renamed "FixProgram3" for personal organization
	// and typo corrected in "clazz".

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // variable type added 
		String line1 = scanner.nextLine(); 
		String line2 = scanner.nextLine(); 
		
		System.out.println(line2); // Variable printed corrected: "line1" 
		System.out.println(line1); // Variable printed corrected: "line2"
		// We need to print the two lines in an other order 
		// So we need to print line2 first then line1.
		
		scanner.close(); // And remember to close the scanner;
	}
}
