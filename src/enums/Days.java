package enums;

/* ****** EXERCISE : Days of the week ******
 * 
 * Declare an enum named DayOfWeek. It should include all days of the week in
 * uppercase: SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY.
 * The constants can be declared in any order.
 * 
 * Do not make the enum public.
 */

class Days {

	enum DayOfWeek {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}
	
	public static void main(String[] args) {
		for (DayOfWeek day : DayOfWeek.values()) {
			System.out.printf("%d - %s : %s%n", 
					day.ordinal(), day.name());
		}
	}
}
