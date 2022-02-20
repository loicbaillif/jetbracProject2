package terminal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old?");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You can drive a car!");
        } else {
            System.out.println("You can ask your parents for money");
        }
        
        scanner.close();
    }
}
