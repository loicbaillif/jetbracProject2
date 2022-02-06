package arrayAsParams;

import java.util.*;
import java.util.stream.Collectors;

/* ****** EXERCISE : Inverse Boolean Flags ******
 * 
 * Write a body and a parameter of the method inverseFlags. The method must 
 * take an array of booleans and negate each of them. Do not make a copy 
 * of the parameter, change elements of a passed array.
 */

public class InverseBoolean {
	
	public static void inverseFlags(boolean... flags) {
		int nbFlags = flags.length;
		for (int i = 0; i < nbFlags; i++) {
			if (flags[i]) {
				flags[i] = false;
			} else {
				flags[i] = true;
			}
		}
	}
	

	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
        final List<Boolean> booleans = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Boolean::parseBoolean)
                .collect(Collectors.toList());
        final boolean[] flags = new boolean[booleans.size()];
        for (int i = 0; i < flags.length; i++) {
            flags[i] = booleans.get(i);
        }
        inverseFlags(flags);
        final String representation = Arrays.toString(flags)
                .replace("[", "")
                .replace("]", "")
                .replace(",", "");
        System.out.println(representation);
        
        scanner.close();
	}

}
