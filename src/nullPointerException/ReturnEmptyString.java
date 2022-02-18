package nullPointerException;

import java.util.Scanner;
import java.util.Locale;
import java.util.Objects;

/* ****** EXERCISE : Return Empty String ******
 * 
 * Take a look at the method that takes a string, converts all characters of 
 * the string to upper case, and then returns the resulting string.
 * 
 * But there is a problem. Sometimes an input string is null. As you already 
 * know, in this case, the method throws a NullPointerException.
 * 
 * Your task is to fix the method in order to avoid an NPE.
 * 
 * If the input string is null, the method should return the empty string "".
 */

public class ReturnEmptyString {

	// Fix this method:
	public static String toUpperCase(String str) {
		if (Objects.equals(str, null)) {
			return "";
		} else {
			return str.toUpperCase(Locale.ENGLISH);
		}
	}


	// Do not change the code below
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		line = "none".equalsIgnoreCase(line) ? null : line;
		System.out.println(toUpperCase(line));
	}

}
