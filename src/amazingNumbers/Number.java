package amazingNumbers;

public class Number {
	private long number;
	private boolean buzz;
	private boolean duck;
	private boolean even;
	private boolean natural;
	private boolean odd;
	private boolean palindromic;

	public Number(long number) {
		this.number = number;
		isNatural();
		if (natural) {
			isEven();
			isOdd();
			isBuzz();
			isDuck();
			isPalindromic();
		}
		
	}

	public long getNumber() {
		return number;
	}

	public boolean getBuzz() {
		return buzz;
	}

	public boolean getDuck() {
		return duck;
	}

	public boolean getEven() {
		return even;
	}

	public boolean getNatural() {
		return natural;
	}

	public boolean getOdd() {
		return odd;
	}
	
	public boolean getPalindromic() {
		return palindromic;
	}
	

	public void isBuzz() {
		buzz = divisibleBySeven(number) || endByX(number, 7);
	}
	
	public void isDuck() {
		duck = containsX(number, 0);
	}

	public void isEven() {
		even = number % 2 == 0;
	}

	public void isNatural() {
		natural = number > 0;
	}

	public void isOdd() {
		odd = number % 2 == 1;
	}
	
	public void isPalindromic() {
		palindromic = palindromic(number);
	}


	public boolean containsX(long number, int digit) {
		if (number < 10) {
			return number == digit;
		} else {
			long remainingDigits = number;
			int lastDigit = (int) (number % 10);
			boolean result = false;
			while (remainingDigits > 9) {
				if (lastDigit == digit) {
					result = true;
					remainingDigits = 0; // Interrupt the while if digit found
				} else {
					remainingDigits /= 10;
					lastDigit = (int) (remainingDigits % 10);
				}
			}
			return result;
		}
	}


	public boolean divisibleBySeven(long number) {
		long remainingDigits = number;
		byte unitDigits;
		while (remainingDigits > 9) {
			unitDigits = (byte) (remainingDigits % 10);
			remainingDigits = (remainingDigits / 10)  - (2 * unitDigits);
		}
		return (remainingDigits == -14 || remainingDigits == -7 
				|| remainingDigits == 0 || remainingDigits == 7);
	}


	public boolean endByX(long number, int lastDigit) {
		return (number % 10 == lastDigit);
	}
	
	
	public boolean palindromic(long number) {
		long remaining = number;
		long numberMirror = 0;		
		while (remaining > 0) {
			numberMirror *= 10;
			numberMirror += remaining % 10;
			remaining /= 10;
		}
		
		return numberMirror == number;
	}


	public void presentNumber() {
		String present = "Properties of %d%n\tEven: %b%n\tOdd: %b%n" + 
				"\tBuzz: %b%n\tDuck: %b%n\tPalindromic: %b%n";
		System.out.printf(present, number, even, odd, buzz, duck, palindromic);
	}



}
