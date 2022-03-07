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
		if (natural) {
			isEven();
			isOdd();
			isBuzz();
			isDuck();
		}
		
	}

	public int getNumber() {
		return number;
	}

	public boolean getNatural() {
		return natural;
	}

	public boolean getEven() {
		return even;
	}

	public boolean getOdd() {
		return odd;
	}

	public boolean getBuzz() {
		return buzz;
	}

	public boolean getDuck() {
		return duck;
	}


	public void isNatural() {
		natural = number > 0;
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
	
	public void isDuck() {
		duck = containsX(number, 0);
	}


	public boolean containsX(int number, int digit) {
		if (number < 10) {
			return number == digit;
		} else {
			int remainingDigits = number;
			int lastDigit = number % 10;
			boolean result = false;
			while (remainingDigits > 9) {
				if (lastDigit == digit) {
					result = true;
					remainingDigits = 0; // Interrupt the while if digit found
				} else {
					remainingDigits /= 10;
					lastDigit = remainingDigits % 10;
				}
			}
			return result;
		}
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
		String present = "Properties of %d%n\tEven: %b%n\tOdd: %b%n" + 
				"\tBuzz: %b%n\tDuck: %b%n";
		System.out.printf(present, number, even, odd, buzz, duck);
	}



}
