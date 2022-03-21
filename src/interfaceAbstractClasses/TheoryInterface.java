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
	
	void instanceMethod1(); // Abstract method without implementation
	
	void instanceMethod2(); // Abstract method without implementation
	
	
	
}
