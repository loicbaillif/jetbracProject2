package project1;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, world!");
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
        final String[] answer = {"even", "odd"};
        final int two = 2;
        while (nextInt != 0) {
            System.out.println(answer[nextInt % two]);
            nextInt = scanner.nextInt();
        }
        System.out.println("***** End of program *****");
		scanner.close();
	}

}
