package arrayExceptions;

import java.util.*;

/* ****** EXERCISE : Out of Bounds ******
 * 
 * Take a look at the program that reads a string and a number N 
 * and outputs the Nth element of a string (starting from 0).
 * 
 * This program may throw StringIndexOutOfBoundsException. 
 * Fix it to avoid the exception.
 * 
 * In the case when the exception might happen, your updated program 
 * should output: "Out of bounds!".
 */

public class OutOfBounds {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int index = scanner.nextInt();

        if (string != null) {
        System.out.println( (index < string.length() && index >= 0) 
        		? string.charAt(index) 
        		: "Out of bounds!");
        }
        
        scanner.close();
	}

}
