package enumsAdvanced;

/* ****** EXERCISE : Danger levels ******
 * 
 * You are given an enum named DangerLevel.
 * 
 * Add an integer field to store danger levels and match the number 
 * with each constant:
 * 		. HIGH — 3
 * 		. MEDIUM — 2
 * 		. LOW — 1
 * You should also add the instance method getLevel that returns 
 * the associated integer number.
 * 
 * After your modifications, the following code should compile and 
 * work correctly:
 * 
 * DangerLevel high = DangerLevel.HIGH;
 * DangerLevel medium = DangerLevel.MEDIUM;
 * System.out.println(high.getLevel() > medium.getLevel()); // true
 */

enum DangerLevel {
	HIGH(3),
	MEDIUM(2), 
	LOW(1);
	
	int levelNumber;
	
	DangerLevel(int levelNumber) { // Constructor
		this.levelNumber = levelNumber;
	}
	
	public int getLevel() { // Getter
		return levelNumber;
	}
	
	
	public static void main(String[] args) {
		DangerLevel high = DangerLevel.HIGH;
		DangerLevel medium = DangerLevel.MEDIUM;
		System.out.println(high.getLevel() > medium.getLevel());
	}
	
	
}


