package project1;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, world!");
		Scanner scanner = new Scanner(System.in);
		int currentInput = scanner.nextInt();
        int nextInput = scanner.nextInt();
        while (currentInput == nextInput && nextInput != 0) {
            currentInput = nextInput;
            nextInput = scanner.nextInt();
        }
        boolean ascending = currentInput < nextInput ? true : false;
        boolean ordered = true;
        while (nextInput != 0 && ordered) {
            currentInput = nextInput;
            nextInput = scanner.nextInt();
            if (ascending && currentInput > nextInput) {
                ordered = false;
            } else if (!ascending && currentInput < nextInput) {
                ordered = false;
            }
        }
        System.out.format("%b%n", ordered);
        System.out.println("***** End of program *****");
		
	}

}
