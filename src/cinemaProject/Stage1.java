package cinemaProject;

public class Stage1 {

	public static void main(String[] args) {
		/* ****** PROJECT : Cinema Room Manager - Stage 1 ******
		 * 
		 * Description:
		 * There are many enjoyable activities on this funny little planet 
		 * Earth, and still, the happiest, simplest, and most fulfilling one 
		 * is probably going to the movies. Going with friends, going with 
		 * loved ones, experiencing a whole new adventure from the safety of 
		 * a cinema seat, surrounded by like-minded fellow travellers.
		 * 
		 * As a beginner developer, you can contribute to creating this 
		 * wonderful cinema experience. Your good friends asked you to help 
		 * them create an application for a cinema theatre where people can 
		 * get tickets, reserve seats, and enjoy their movie night.
		 * 
		 * 
		 * Objectives:
		 * There is not a lot of space in our new cinema theatre, so you need 
		 * to take into account the restrictions on the number of seats. Your 
		 * friends said that the room would fit 7 rows of 8 seats. Your task 
		 * is to help them visualise the seating arrangement by printing the 
		 * scheme to the console.
		 * 
		 * Your output should be like in the example below and should contain 
		 * 9 lines.
		 * 
		 * 
		 * Example:
		 * Cinema:
		 *   1 2 3 4 5 6 7 8
		 * 1 S S S S S S S S
		 * 2 S S S S S S S S
		 * 3 S S S S S S S S
		 * 4 S S S S S S S S
		 * 5 S S S S S S S S
		 * 6 S S S S S S S S
		 * 7 S S S S S S S S
		 * 
		 */

		final byte nbCols = 8;
		final byte nbRows = 7;
		final char seat = 'S';
		final char separator = ' ';
		System.out.println("Cinema:");
		
		for (int i = 0; i <= nbRows; i++) {
			for (int j = 0; j <= nbCols; j++) {
				if (i == 0 && j == 0) {
					System.out.print(separator);
				} else if (i == 0) {
					System.out.print(j);
				} else if (j == 0) {
					System.out.print(i);
				} else {
					System.out.print(seat);
				}
				System.out.print(separator);
			}
			System.out.printf("%n");
		}
		
	}

}
