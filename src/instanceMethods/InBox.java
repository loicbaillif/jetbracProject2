package instanceMethods;

/* ****** EXERCISE : In a box ******
 * 
 * You are given a class named Box that has three double fields.
 * 
 * Create an instance method to calculate the volume of the box. 
 * The method must be named getVolume. 
 * It should take no arguments and return a double result.
 * 
 * Do not make the fields and method private!
 */

public class InBox {

	double height;
	double length;
	double width;
	
	public double getVolume() {
		return this.height * this.length * this.width;
	}
	
}
