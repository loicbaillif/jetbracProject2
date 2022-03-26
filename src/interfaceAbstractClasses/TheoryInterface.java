package interfaceAbstractClasses;

/* Declaring interface *
 * 
 * An interface can contain:
 * - public constants
 * - abstract methods without an implementation (keyword "abstract" is not
 * 		required here ...
 * - default methods with implementation (keyword "default" is required)
 * - static methods with implementation (keyword "static" is required)
 * - private methods with implementation
 */

interface TheoryInterface {
	
	int INT_CONSTANT = 0; // Identical to "public static final int ..."
	
	int timesFive(int userInput); // Abstract method without implementation
	
	boolean isEven(int userInput); // Abstract method without implementation
	
	static void staticMethod() {
		System.out.println("TheoryInterface: Static Method");
		System.out.println("This should be the same for all implementations");
	}
	
	default void defaultMethod() {
		System.out.println("TheoryInterface: Default Method. "
				+ "It can be overridden.");
	}
	
}
