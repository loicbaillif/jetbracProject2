package amazingNumbers;

public class Number {
	private int number;
	private boolean even;
	private boolean odd;
	private boolean buzz;
	private boolean duck;
	
	public Number(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
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
	
	
	public void even() {
		even = number % 2 == 0;
	}
	
	
	
	

}
