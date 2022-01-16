package multidimensionalArrays;

import java.util.Scanner;

public class Cinema {

	public static void main(String[] args) {
		/* ****** EXERCISE : Cinema ******
		 * The cinema has n rows, each row consists of m seats (n and m do 
		 * not exceed 20). A two-dimensional matrix stores the information 
		 * on the sold tickets: the number 1 means that the ticket for this 
		 * place is already sold, and the number 0 means that the place is 
		 * available. You want to buy k tickets to neighboring seats in the 
		 * same row. Find whether it can be done. 
		 * 
		 * --> Input data format 
		 * 		On the input, the program gets the number of n rows and m 
		 *  	seats. Then, there are n lines, each containing m numbers 
		 *  	(0 or 1) separated by spaces. The last line contains the 
		 *  	number k.
		 *  
		 *  --> Output data format
		 *  	The program should output the number of the row with k 
		 *  	consecutive available seats. If there are several rows with k 
		 *  	available seats, output the first row with these seats. If 
		 *  	there is no such a row, output the number 0.
		 */
		
		Scanner scanner = new Scanner(System.in);
		byte nRows = scanner.nextByte(); // n does not exceed 20 ==> byte;
		byte mSeats = scanner.nextByte(); // m does not exceed 20 ==> byte;
		byte[][] cinema = new byte[nRows][mSeats];
		byte neighSeats = 0;
		byte result = 0;
		for (byte i = 0; i < nRows; i++) {
			for (byte j = 0; j < mSeats; j++) {
				cinema[i][j] = scanner.nextByte();
			}
		}
		byte kTickets = scanner.nextByte();
		
		for (byte i = 0; i < nRows; i++) {
			neighSeats = 0; // new row, reset neighboring seats counter
			for (byte j = 0; j < mSeats; j++) {				
				if (cinema[i][j] == 0) {
					neighSeats++;
				} else {
					neighSeats = 0;
				}
				if (neighSeats == kTickets) {
					result = ++i; // Humans start counting from 1;
					break; // Solution found, no need to treat furthermore.
				}
			}
			if (result != 0) {
				break; // Solution found, no need to treat furthermore.
			}
		}
		
		System.out.format("%d%n", result);
		
		scanner.close();
		System.out.println("****** END OF PROGRAM ******");
	}

}
