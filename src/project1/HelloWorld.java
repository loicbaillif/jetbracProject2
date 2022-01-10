package project1;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, world!");
		Scanner scanner = new Scanner(System.in);

		int[] testList = {10, 3, 5, 21, 2, 4, 9};
		
		int[] testList2 = sortInt(testList);
		
		for (int elt : testList2) {
			System.out.format("%d%n", elt);
		}
		
		System.out.println("***** END OF PROGRAM *****");
		scanner.close();
	}
	
	public static int[] sortInt(int[] listInt) {
		/**
		 * sortInt : Will sort a list of integers in ascending order;
		 * Probably not the most efficient method to sort a list of integers
		 * but I wrote this little algorithm on my own.
		 */
		int pivot = 0;
		int nbSwitches = 0;
		
		do {
			nbSwitches = 0;
			for (int i = 0; i < listInt.length - 1; i++) {
				if (listInt[i+1] < listInt[i]) {
					pivot = listInt[i];
					listInt[i] = listInt[i+1];
					listInt[i+1] = pivot;
					nbSwitches++;					
				}
			}
		} while (nbSwitches != 0);
		return listInt;
	}

}
