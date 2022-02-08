package nullPointerException;

import java.util.Scanner;

/* ****** EXERCISE : Avoid NPE with Strings ******
 * 
 * Your task is to fix the method concatStrings. 
 * The method should concat two strings and avoid NPE.
 * 
 * If both of the strings are null, you should return an empty string ("");
 * 
 * If only one string is null, you should return the other string.
 */

public class AvoidNPE {

	public static String concatStrings(String str1, String str2) {
        /* write your code here */
		String result = str1 == null 
				? str2 == null ? "" : str2
				: str2 == null ? str1 : str1.concat(str2);

        return result;
    }
	
	// DO NOT CHANGE THE CODE BELOW
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        str1 = "null".equalsIgnoreCase(str1) ? null : str1;
        str2 = "null".equalsIgnoreCase(str2) ? null : str2;

        System.out.println(concatStrings(str1, str2));
        
        scanner.close();

	}

}
