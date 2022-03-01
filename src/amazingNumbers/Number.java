package amazingNumbers;

public class Number {
	private int number;
	private boolean natural;
	private boolean even;
	private boolean odd;
	private boolean buzz;
	private boolean duck;
	
	public Number(int number) {
		this.number = number;
		isNatural();
		isEven();
		isOdd();
		
	}
	
	public int getNumber() {
		return number;
	}
	
	public boolean getNatural() {
		return natural;
	}
	
	public void setNatural(boolean natural) {
		this.natural = natural;
	}
	
	public boolean getEven() {
		return even;
	}
	
	public void setEven(boolean even) {
		this.even = even;
	}

	public boolean getOdd() {
		return odd;
	}

	public void setOdd(boolean odd) {
		this.odd = odd;
	}

	public boolean getBuzz() {
		return buzz;
	}

	public void setBuzz(boolean buzz) {
		this.buzz = buzz;
	}

	public boolean getDuck() {
		return duck;
	}

	public void setDuck(boolean duck) {
		this.duck = duck;
	}
	
	
	public void isNatural() {
		natural = number != 0;
	}
	
	public void isEven() {
		even = number % 2 == 0;
	}
	
	public void isOdd() {
		odd = number % 2 == 1;
	}
	
	public void isBuzz() {
		buzz = divisibleBySeven(number) || endByX(number, 7);
	}
	
	
	public boolean divisibleBySeven(int number) {
		int remainingDigits = number;
		byte unitDigits;
		while (remainingDigits > 9) {
			unitDigits = (byte) (remainingDigits % 10);
			remainingDigits = (remainingDigits / 10)  - (2 * unitDigits);
		}
		return (remainingDigits == -14 || remainingDigits == -7 
				|| remainingDigits == 0 || remainingDigits == 7);
	}
	
	
	public boolean endByX(int number, int lastDigit) {
		return (number % 10 == lastDigit);
	}
	
	
	public void presentNumber() {
		String present = "Number %d:%n\tEven? %b%n\tOdd? %b%n" + 
				"\tDivisible by 7? %b%n\tEnds by 7? %b%n";
		System.out.printf(present, number, even, odd, divisibleBySeven(number), 
				endByX(number, 7));
	}
	
	

}
