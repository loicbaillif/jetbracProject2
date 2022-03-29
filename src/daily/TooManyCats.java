package daily;

/* ****** DAILY PROBLEMS - Let's count cats ******
 * 
 * Let's count cats! Implement a class named Cat and a static 
 * method getNumberOfCats.
 * 
 * These are some features of the class:
 * 
 * . The class Cat has two instance fields: a string name and an int age, 
 * and one static int field counter. The static counter field allows you 
 * to know how many cats have already been created.
 * . The class should have a constructor for initializing the instance fields. 
 * During the initialization of a new cat, the value of the static field 
 * counter should be incremented. If counter > 5, the message 
 * "You have too many cats" must be printed to System.out.
 * 
 * Your static method getNumberOfCats returns the current number of created 
 * cats and prints no messages.
 */

class TooManyCats {

	// write static and instance variables
	String name;
	int age; // Respecting the requirements ... but "byte" would be better.
	static int counter = 0;
	

    public TooManyCats(String name, int age) {
        // implement the constructor
        // do not forget to check the number of cats
    	this.name = name;
    	this.age = age;
    	counter++;
    	if (counter > 5) {
    		System.out.println("You have too many cats");
    	}
    }

    public static int getNumberOfCats() {
        // implement the static method
    	return counter;
    }
    
}
