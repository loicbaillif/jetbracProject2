package constructor;

/* ****** EXERCISE : Complex ******
 * 
 * Write a class named Complex. It must have two double fields real and 
 * imaginary and a constructor to initialize the fields. The order of 
 * parameters in the constructor must be the same as presented above.
 */

class Complex {
	
	double real;
	double imaginary;
	
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
}
