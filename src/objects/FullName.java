package objects;

/* ****** EXERCISE : Prepare Full Name ******
 * 
 * Implement a function for outputting the full name of a person. 
 * The function takes two string arguments: firstName and lastName. 
 * You need to concat them together with a space in between.
 * 
 * If an argument is null, do not add it to the full name and 
 * do not insert a space.
 */

import java.util.Scanner;

public class FullName {

	public static String prepareFullName(String firstName, String lastName) {
        // write your code here
		String space = " ";
		String result = firstName == null 
				? lastName == null ? "" : lastName
				: lastName == null 
						? firstName 
						: firstName.concat(space).concat(lastName);
		
		
		return result;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        firstName = "null".equals(firstName) ? null : firstName;

        String lastName = scanner.nextLine();
        lastName = "null".equals(lastName) ? null : lastName;

        System.out.println(prepareFullName(firstName, lastName));
    }

}
