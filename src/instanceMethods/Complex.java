package instanceMethods;

/* ****** EXERCISE : Complex numbers ******
 * 
 * Jake wants to write a program that works with complex numbers. He created 
 * a class Complex that represents a complex number with its real and 
 * imaginary parts. Now he needs instance methods so that he can calculate 
 * the sum and difference of two complex numbers.
 * 
 * Help Jake and create two instance methods for his class:
 * 
 * - add(Complex num) that takes another complex number as an argument  
 * 		and adds its corresponding fields to the current instance;
 * - subtract(Complex num) that takes another complex number as an argument 
 * 		and subtracts its corresponding fields from the current instance;
 * 
 * Both methods should return nothing.
 * 
 * Do not make the fields and methods private.
 */


public class Complex {

	double real;
	double image;

	public void add(Complex num) {
		this.real += num.real;
		this.image += num.image;
	}

	public void subtract(Complex num) {
		this.real -= num.real;
		this.image -= num.image;
	}
	
	public void display() {
		System.out.printf("real : %.1f - imaginary : %.1f%n", this.real, this.image);
	}

	public static void main(String[] args) {
		Complex number1 = new Complex();
		Complex number2 = new Complex();
		number1.real = 3;
		number1.image = -5;
		number2.real = -2;
		number2.image = 1;
		
		number1.display(); 
		number2.display();		
		number1.add(number2);
		number1.display(); 
		number2.display();
	}
}
