package project1;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, world!");
		Scanner scanner = new Scanner(System.in);
		int nbElts = scanner.nextInt();
        int[] a = new int[nbElts];
        for (short i = 1; i <= nbElts; i++) {
            if (i != nbElts) {
                a[i] = scanner.nextInt();
            } else {
                a[0] = scanner.nextInt();
            }
        }
        for (int elt: a) {
        	System.out.format("%d ", elt);
        }
		scanner.close();
	}

}
