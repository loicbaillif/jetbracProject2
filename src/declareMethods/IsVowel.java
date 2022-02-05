package declareMethods;
import java.util.Scanner;

/* ****** EXERCISE : Vowel or not ******
 * 
 * Implement a method that checks whether a given English letter 
 * is a vowel or not. The input may be in any case.
 * 
 * In our case, the letter 'y' is not considered a vowel.
 */

public class IsVowel {

	public static boolean isVowel(char ch) {
		String vowel = "aeiouAEIOU";
		return vowel.indexOf(ch) >= 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char letter = scanner.nextLine().charAt(0);
		System.out.println(isVowel(letter) ? "YES" : "NO");
		scanner.close();
	}

}
