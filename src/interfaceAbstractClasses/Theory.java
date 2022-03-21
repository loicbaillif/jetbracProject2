package interfaceAbstractClasses;

class Theory implements TheoryInterface {
	
	public void instanceMethod1() {
		System.out.println("Class Theory: instanceMethod1 ...");
	}
	
	public void instanceMethod2() {
		System.out.println("Class Theory: instanceMethod2 ...");
	}
	
	TheoryInterface instance = new Theory();
	
	// To be continued ...
	
}
