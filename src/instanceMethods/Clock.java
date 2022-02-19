package instanceMethods;

/* ****** EXERCISE : Simulating a clock ******
 * 
 * 
 * You are given a class Clock. It has two int fields: hours and minutes. 
 * The clock has a minute scale from 0 to 59 and an hour scale from 1 to 12. 
 * The clock does not know whether it's day or night (no AM or PM).
 * 
 * Implement the method next that increases the value of minutes by 1. 
 * The minutes must be reset to zero when the current hour ends. 
 * Do not forget to change the hours as well.
 * 
 * Do not make the fields and methods private.
 */

public class Clock {
	
	int hours = 12;
	int minutes = 0;
	
	int minHours = 1;
	int maxHours = 12;
	int minMinutes = 0;
	int maxMinutes = 59;
	
	void next() {
		this.minutes = this.minutes == maxMinutes 
				? minMinutes 
				: this.minutes++; 
		if (this.minutes == minMinutes) {
			if (this.hours == maxHours) {
				this.hours = minHours;
			} else {
				this.hours ++;
			}
			
		}
		
	}
}
