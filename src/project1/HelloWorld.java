package project1;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, world!");
		char letter = 'A';
		int i = 0;
		char[] alphabet = new char[26];
		while (letter <= 'Z') {
			alphabet[i] = letter;
			i++;
			letter++;
		}
		
		System.out.println(alphabet);
		
	}

}
