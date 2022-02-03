package cinemaProject;

import java.util.Scanner;

public class Stage3 {

	final static byte largeRoom = 60;
	final static byte priceTop = 10; // Top seats as per description
	final static byte priceStandard = 8; // standard seats as per description
	final static char emptySeat = 'S';
	final static char bookedSeat = 'B';
	final static char separator = ' ';

	public static void main(String[] args) {
		/* ****** PROJECT : Cinema Room Manager - Stage 3 ******
		 * 
		 * 
		 * Description
		 * When choosing a ticket you are guided not only by your space 
		 * preference but also by your finances. Let's implement the 
		 * opportunity to check the ticket price and see the reserved seat.
		 * 
		 * 
		 * Objectives
		 * Read two positive integer numbers that represent the number of rows 
		 * and seats in each row and print the seating arrangement like in the 
		 * first stage. Then, read two integer numbers from the input: 
		 * a row number and a seat number in that row. These numbers represent 
		 * the coordinates of the seat according to which the program should 
		 * print the ticket price. The ticket price is determined by the same 
		 * rules as the previous stage:
		 * 
		 * 	- If the total number of seats in the screen room is not more than 
		 * 	  60, then the price of each ticket is 10 dollars.
		 *  - In a larger room, the tickets are 10 dollars for the front half 
		 *    of the rows and 8 dollars for the back half. Please note that 
		 *    the number of rows can be odd, for example, 9 rows. In this case,
		 *    the first half is the first 4 rows, and the second half is the 
		 *    last 5 rows.
		 *    
		 * After that, the program should print out all the seats in the 
		 * screen room as shown in the example and mark the chosen seat by 
		 * the B symbol. Finally, it should print the ticket price and stop. 
		 * Note that in this project, the number of rows and seats won't be 
		 * greater than 9.
		 */

		Scanner scanner = new Scanner(System.in);


		System.out.printf("Enter the number of rows:%n> ");
		byte nbRows = scanner.nextByte(); // Not greater than 9 ==> byte
		System.out.printf("Enter the number of seats in each row:%n> ");
		byte seatsPerRow = scanner.nextByte(); // Not greater than 9 ==> byte
		byte customerRow = 0;
		byte customerSeat = 0;
		char[][] room = createRoom(nbRows, seatsPerRow);
		displayRoom(room);

		do {
			System.out.printf("Enter a row number:%n> ");
			customerRow = scanner.nextByte();
		} while (customerRow < 1 || customerRow > nbRows);
		do {
			System.out.printf("Enter a seat number in that row:%n> ");
			customerSeat = scanner.nextByte(); 
		} while (customerSeat < 1 || customerSeat > seatsPerRow);
		
		priceSeat(room, customerRow); // Row is enough to provide price.
		room = updateRoom(room, customerRow, customerSeat);
		displayRoom(room);

		scanner.close();

	}


	public static char[][] createRoom(byte nbRows, byte seatsPerRow) {
		char[][] room = new char[nbRows][seatsPerRow];
		for (byte i = 0; i < nbRows; i++) {
			for (byte j = 0; j < seatsPerRow; j++) {
				room[i][j] = emptySeat;
			}
		}
		return room;
	}


	public static void displayRoom(char[][] room) {
		byte nbRows = (byte) room.length;
		byte seatsPerRow = (byte) room[0].length;

		System.out.println("Cinema:");

		for (byte i = 0; i <= nbRows; i++) {
			for (byte j = 0; j <= seatsPerRow; j++) {
				if (i == 0 && j == 0) {
					System.out.print(separator);
				} else if (i == 0) { // row with numbers
					System.out.print(j);
				} else if (j == 0) { // column with numbers
					System.out.print(i);
				} else {
					System.out.print(room[i - 1][j - 1]);
				}
				System.out.print(separator);
			}
			System.out.printf("%n");
		}
	}


	public static byte priceSeat(char[][] room, byte row) {
		byte nbRows = (byte) room.length;
		byte seatsPerRow = (byte) room[0].length;
		byte topRows = (byte) (nbRows / 2);
		byte result;
		if ((byte) (nbRows * seatsPerRow) > largeRoom) {
			result = row <= topRows ? priceTop : priceStandard;
		} else {
			result = priceStandard;
		}
		System.out.printf("Ticket price: $%d%n", result);
		return result;
	}


	public static char[][] updateRoom(char[][] room, byte row, byte seat) {
		// WARNING : Remember that the cinema room top left seat is (1;1)
		// WARNING : It is not (0;0) ==> 1 to be subtracted from row and seat
		room[row - 1][seat - 1] = bookedSeat;
		return room;
	}


}
