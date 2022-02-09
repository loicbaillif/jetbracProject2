package nullPointerException;

import java.util.*;

/* ****** EXERCISE : Avoid the NPE ******
 * 
 * Here's a program that may throw NullPointerException. 
 * Fix it to avoid the exception.
 * 
 * In the case when the exception may occur, the program 
 * should print the string "NPE!".
 */

public class AvoidNPE2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = "null".equals(string) ? null : string;
        /* Do not change code above */

        System.out.println(string == null ? "NPE!" : string.toLowerCase());
        
        scanner.close();

	}

}
