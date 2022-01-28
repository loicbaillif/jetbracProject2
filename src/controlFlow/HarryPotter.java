package controlFlow;

import java.util.Scanner;

public class HarryPotter {

	public static void main(String[] args) {
		/* ****** EXERCISE : Harry Potter ******
		 * 
		 * Harry Potter needs help identifying what each house means. 
		 * 
		 * Read a string representing a house and output the following: 
		 * 		if it is "gryffindor", output "bravery"; 
		 * 		if it is "hufflepuff", output "loyalty"; 
		 * 		if it is "slytherin", output "cunning"; 
		 * 		if it is "ravenclaw", output "intellect"; 
		 * 		otherwise, output "not a valid house".
		 */
		
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		String output;
		switch (userInput) {
		case "gryffindor": 
			output = "bravery";
			break;
		case "hufflepuff": 
			output = "loyalty";
			break;
		case "slytherin":
			output = "cunning";
			break;
		case "ravenclaw":
			output = "intellect";
			break;
		default:
			output = "not a valid house";
			break;
		}
		System.out.println(output);
		
		scanner.close();
	}

}
