package cinemaProject;

import java.util.Scanner;

public class Stage2 {

	public static void main(String[] args) {
		/* ****** PROJECT : Cinema Room Manager - Stage 2 ******
		 * 
		 * 
		 * Description:
		 * Good job: our friends really liked your program! Now they want to 
		 * expand their theatre and add screen rooms with more seats. However,
		 * this is expensive, so they want to make sure this will pay off. 
		 * Help them calculate the profit from all the sold tickets depending 
		 * on the number of available seats.
		 * 
		 * 
		 * Objectives:
		 * In this stage, you need to read two positive integer numbers from 
		 * the input: the number of rows and the number of seats in each row. 
		 * The ticket price is determined by the following rules:
		 * 		. If the total number of seats in the screen room is not more 
		 * 		than 60, then the price of each ticket is 10 dollars.
		 * 		. In a larger room, the tickets are 10 dollars for the front 
		 * 		half of the rows and 8 dollars for the back half. Please note 
		 * 		that the number of rows can be odd, for example, 9 rows. 
		 * 		In this case, the first half is the first 4 rows, and the 
		 * 		second half is the other 5 rows.
		 * 
		 * Calculate the profit from the sold tickets depending on the number 
		 * of seats and print the result as shown in the examples below. 
		 * After that, your program should stop. Note that in this project, 
		 * the number of rows and seats won't be greater than 9.
		 */
		
		Scanner scanner = new Scanner(System.in);
		final byte largeRoom = 60;
		final byte priceTop = 10; // Top seats as per description
		final byte priceStandard = 8; // standard seats as per description
		int result; 
		
		System.out.printf("Enter the number of rows:%n> ");
		byte nbRows = scanner.nextByte(); // Not greater than 9 ==> byte
		System.out.printf("Enter the number of seats in each row:%n> ");
		byte seatsPerRow = scanner.nextByte(); // Not greater than 9 ==> byte
		byte topRows = (byte) (nbRows / 2);
		result = (nbRows * seatsPerRow <=  largeRoom) 
				? nbRows * seatsPerRow * priceTop 
				: seatsPerRow * ( (priceTop * topRows) +
		                (priceStandard * (nbRows - topRows)) );
		
		System.out.printf("Total income: %n$%d", result);
		
		scanner.close();

	}

}
