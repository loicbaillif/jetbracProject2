package cinemaProject;

import java.util.Scanner;


/* ****** PROJECT : Cinema Room Manager - Stage 5 ******
 * 
 * 
 * Description
 * Running a cinema theater is no easy business. To help our friends, let's 
 * add statistics to your program. The stats will show the current income, 
 * total income, the number of available seats, and the percentage of 
 * occupancy.
 * 
 * In addition, our friends asked you to take care of a small inconvenience: 
 * it's not good when a user can buy a ticket that has already been 
 * purchased by another user. Let's fix this!
 * 
 * 
 * Objectives
 * Now your menu should look like this:
 * 		1. Show the seats
 * 		2. Buy a ticket
 * 		3. Statistics
 * 		0. Exit
 * 
 * When the item Statistics is chosen, your program should print 
 * the following information:
 * 		- The number of purchased tickets;
 * 		- The number of purchased tickets represented as a percentage. 
 * 		Percentages should be rounded to 2 decimal places;
 * 		- Current income;
 * 		- The total income that shows how much money the theater will get 
 * 		if all the tickets are sold.
 * 
 * The rest of the menu items should work the same way as before, except 
 * the item Buy a ticket shouldn't allow a user to buy 
 * a ticket that has already been purchased.
 * 
 * If a user chooses an already taken seat, print That ticket has already 
 * been purchased! and ask them to enter different seat coordinates until 
 * they pick an available seat. Of course, you shouldn't allow coordinates 
 * that are out of bounds. If this happens, print "Wrong input!" and ask to 
 * enter different seat coordinates until the user picks an available seat.
 *  
 */

public class Stage5 {

	final static byte LARGE_ROOM = 60;
	final static byte MENU_MIN = 0;
	final static byte MENU_MAX = 3;
	final static byte PRICE_TOP = 10; // Top seats as per description
	final static byte PRICE_STANDARD = 8; // Standard seats as per description
	final static char EMPTY_SEAT = 'S';
	final static char BOOKED_SEAT = 'B';
	final static char SEPARATOR = ' ';
	static byte nbTickets = 0;
	static byte ticketsSold = 0;
	static int currentIncome = 0;
	static int totalIncome = 0;
	

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.printf("Enter the number of rows:%n> ");
		byte nbRows = scanner.nextByte(); // Not greater than 9 ==> byte
		System.out.printf("Enter the number of seats in each row:%n> ");
		byte seatsPerRow = scanner.nextByte(); // Not greater than 9 ==> byte
		byte menuChoice = 1; // from 0 to 3 ==> byte.
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
			case 3:
				// Statistics
				showStats();
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
		Scanner scanner1 = new Scanner(System.in);
		byte customerRow;
		byte customerSeat;
		byte ticketPrice;
		
		do {
			// Get row
			System.out.printf("Enter a row number:%n> ");
			if (scanner1.hasNextByte()) {
				customerRow = scanner1.nextByte();
			} else {
				customerRow = 0;
				scanner1.nextLine(); // clear input buffer to get next input
			}
			// Get seat in row
			System.out.printf("Enter a seat number in that row:%n> ");
			if (scanner1.hasNextByte()) {
				customerSeat = scanner1.nextByte();
			} else {
				customerSeat = 0;
				scanner1.nextLine(); // clear input buffer to get next input
			}
			
		} while (!validRowSeat(room, nbRows, seatsPerRow, customerRow, 
				customerSeat));		
		
		// Row is sufficient to provide price
		ticketPrice = priceSeat(nbRows, seatsPerRow, customerRow); 
		currentIncome += ticketPrice;
		ticketsSold++;
		System.out.printf("Ticket price: $%d%n", ticketPrice);
		updateRoom(room, customerRow, customerSeat);

	}


	public static char[][] createRoom(byte nbRows, byte seatsPerRow) {
		char[][] room = new char[nbRows][seatsPerRow];
		for (byte i = 0; i < nbRows; i++) {
			for (byte j = 0; j < seatsPerRow; j++) {
				room[i][j] = EMPTY_SEAT;
			}
			// Room array is counted from 1 ... First row of seats is row 1
			totalIncome += priceSeat(nbRows, seatsPerRow, 
					(byte) (i + 1)) * seatsPerRow;
			
		}	
		nbTickets = (byte) (nbRows * seatsPerRow);
		return room;
	}


	public static byte displayMenu() {
		@SuppressWarnings("resource")
		Scanner scanner2 = new Scanner(System.in);
		boolean validInput = false;
		byte userInput = -1;
		do { 
			System.out.printf("%n1. Show the seats%n");
			System.out.println("2. Buy a ticket");
			System.out.println("3. Statistics");
			System.out.printf("0. Exit%n");
			if (scanner2.hasNextByte()) {
				userInput = scanner2.nextByte();
			} else {
				scanner2.nextLine();
			}
			if (userInput < MENU_MIN || userInput > MENU_MAX) {
				System.out.println("Wrong input!");
			} else {
				validInput = true;
			}
		} while (!validInput);
		return userInput;
	}


	public static void displayRoom(char[][] room) {
		byte nbRows = (byte) room.length;
		byte seatsPerRow = (byte) room[0].length;

		System.out.printf("%nCinema:%n");

		for (byte i = 0; i <= nbRows; i++) {
			for (byte j = 0; j <= seatsPerRow; j++) {
				if (i == 0 && j == 0) {
					System.out.print(SEPARATOR);
				} else if (i == 0) { // row with numbers
					System.out.print(j);
				} else if (j == 0) { // column with numbers
					System.out.print(i);
				} else {
					System.out.print(room[i - 1][j - 1]);
				}
				System.out.print(SEPARATOR);
			}
			System.out.printf("%n");
		}

	}


	public static byte priceSeat(byte nbRows, byte seatsPerRow, byte row) {
		byte topRows = (byte) (nbRows / 2);
		byte result;
		if ((byte) (nbRows * seatsPerRow) > LARGE_ROOM) {
			result = row <= topRows ? PRICE_TOP : PRICE_STANDARD;
		} else {
			result = PRICE_TOP;
		}
		return result;
	}
	
	
	public static void showStats() {
		float percentage = (float) (ticketsSold * 100) / nbTickets;
		System.out.format("Number of purchased tickets: %d%n", ticketsSold);
		System.out.format("Percentage: %.2f%%%n", percentage);
		System.out.format("Current income: $%d%n", currentIncome);
		System.out.format("Total Income: $%d%n", totalIncome);
	}
	
	
	public static boolean validRowSeat(char[][] room, byte nbRows, 
			byte seatsPerRow, byte customerRow, byte customerSeat) {
		// This method returns true if and only if the input is valid
		// and the selected seat is empty.
		boolean result = false;
		// First we check if the input is valid
		if ((customerRow < 1) || (customerRow > nbRows) || 
				(customerSeat < 1) || (customerSeat > seatsPerRow)) {
			System.out.printf("%nWrong input!%n");
		} else if (room[customerRow - 1][customerSeat - 1] == BOOKED_SEAT) {
			// Then we check if this seat is free
			System.out.printf("%nThat ticket has already been purchased!%n");
		} else {
			// Valid input + empty seat == OK
			result = true;
		}
		
		return result;
	}
	

	public static void updateRoom(char[][] room, byte row, byte seat) {
		// WARNING : Remember that the cinema room top left seat is (1;1)
		// WARNING : It is not (0;0) ==> 1 to be subtracted from row and seat
		room[row - 1][seat - 1] = BOOKED_SEAT;
	}

}
