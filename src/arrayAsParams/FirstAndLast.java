package arrayAsParams;

import java.util.*;

/* ****** EXERCISE : Get first and last elements ******
 *  
 * Write a method named getFirstAndLast. The method should take an array of 
 * ints and return a new array of ints. The returned array must contain  
 * two elements: the first and the last elements of the input array.
 * 
 * It's guaranteed, the input array always has at least one element.
 */

public class FirstAndLast {
	
	public static int[] getFirstAndLast(int... numbers) {
		int[] result = new int[2];
		int nbElts = numbers.length;
		result[0] = numbers[0];
		result[1] = nbElts > 1 ? numbers[nbElts - 1] : numbers[0];
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
        
        scanner.close();

	}

}
