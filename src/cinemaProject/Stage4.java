package cinemaProject;

import java.util.Scanner;


/* ****** PROJECT : Cinema Room Manager - Stage 4 ******
 * 
 * 
 * Description
 * The theater is getting popular, and the customers started complaining that 
 * it's not practical that the program stops after buying one ticket. Let's 
 * add a menu that will allow them to buy tickets and display the current 
 * state of the seating arrangement when needed.
 * 
 * Objectives
 * At the start, your program should read two positive integer numbers that 
 * represent the number of rows and seats in each row. 
 * Then, it should print a menu with the following three items:
 * 	- Show the seats should print the current seating arrangement. 
 * 	  	The empty seats should be marked with an S symbol, and taken seats 
 *    	are marked with a B symbol.
 *  - Buy a ticket should read the seat coordinates from the input and print 
 *  	the ticket price like in the previous stage. After that, the chosen 
 *  	seat should be marked with a B when the item Show the seats is called.
 *  - Exit should stop the program.
 *  
 */

public class Stage4 {

	final static byte largeRoom = 60;
	final static byte menuMin = 0;
	final static byte menuMax = 2;
	final static byte priceTop = 10; // Top seats as per description
	final static byte priceStandard = 8; // Standard seats as per description
	final static char emptySeat = 'S';
	final static char bookedSeat = 'B';
	final static char separator = ' ';

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.printf("Enter the number of rows:%n> ");
		byte nbRows = scanner.nextByte(); // Not greater than 9 ==> byte
		System.out.printf("Enter the number of seats in each row:%n> ");
		byte seatsPerRow = scanner.nextByte(); // Not greater than 9 ==> byte
		byte menuChoice = 1; // 0, 1 or 2 ==> byte.
		char[][] room = createRoom(nbRows, seatsPerRow);

		while (menuChoice != 0) {
			menuChoice = displayMenu();
			switch (menuChoice) {
			case 1: 
				// Show the seats
				displayRoom(room);
				break;
			case 2:
				// Buy a ticket
				buyTicket(room, nbRows, seatsPerRow);
				break;
			case 0:
				// Exit
				break;
			default: 
				break;
			}

		}

		scanner.close();
	}


	public static void buyTicket(char[][] room, byte nbRows, byte seatsPerRow) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		byte customerRow = 0;
		byte customerSeat = 0;
		do {
			System.out.printf("Enter a row number:%n> ");
			customerRow = scanner.nextByte();
		} while (customerRow < 1 || customerRow > nbRows);
		do {
			System.out.printf("Enter a seat number in that row:%n> ");
			customerSeat = scanner.nextByte(); 
		} while (customerSeat < 1 || customerSeat > seatsPerRow);


		priceSeat(room, customerRow); // Row is sufficient to provide price.
		updateRoom(room, customerRow, customerSeat);
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


	public static byte displayMenu() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		byte userInput = -1;
		do { 
			System.out.printf("%n1. Show the seats%n");
			System.out.println("2. Buy a ticket");
			System.out.printf("0. Exit%n");
			userInput = scanner.nextByte();
		} while (userInput < menuMin || userInput > menuMax);
		return userInput;
	}


	public static void displayRoom(char[][] room) {
		byte nbRows = (byte) room.length;
		byte seatsPerRow = (byte) room[0].length;

		System.out.printf("%nCinema:%n");

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
			result = priceTop;
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
