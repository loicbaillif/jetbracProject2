package project1;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, world!");
		Scanner scanner = new Scanner(System.in);
		int nInput = scanner.nextInt();
        int output = nInput;
        final byte THREE = 3;
        final byte TWO = 2;
        final byte ONE = 1;
        while (output != ONE) {
        	System.out.format("%d ", output);
            if (output % TWO == 0) {
                output /= TWO;
            } else {
                output = output * THREE + ONE;
            }            
        }
        System.out.format("1%n***** End of program *****");
		
	}

}
