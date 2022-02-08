package nullPointerException;

/* ****** EXERCISE : Unknown input ******
 * 
 * Correct the code so it doesn't throw an exception.
 */

public class correctCode {

	public static void main(String[] args) {
		System.out.println(args == null ? 0 : args.length);

	}

}
