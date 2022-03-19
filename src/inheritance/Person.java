package inheritance;

/* ****** INHERITANCE - THEORY : Example of class hierarchy ******
* 
* Let's consider a more graphic example. A telecommunication company serves 
* clients. It has a small staff consisting only of managers and programmers. 
* Let's consider a class hierarchy for people associated with the company's 
* activities (including clients).
* 
* 	- 	The base class Person has fields for storing common data: name, year 
* 		of birth, and address;
* 	-	The class Client has additional fields to store the contract number 
* 		and status (gold or not);
* 	-	The class Employee stores the start date of work for the company 
* 		and the salary;
* 	-	The class Programmer has an array of the programming languages 
* 		a programmer uses;
* 	-	The class Manager may have a dazzling smile.
* 
*/

import java.util.Objects;

class Person {	
	// Fields:
	protected String name = "";
	protected int yearOfBirth = 0;
	protected String address = "";	
	
	// Getters and Setters:
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (!Objects.equals(name, null) 
				&& !Objects.equals(name, "")) {
			this.name = name;
		}
	}
	
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	
	public void setYearOfBirth(int yearOfBirth) {
		if (yearOfBirth > 0) {
			this.yearOfBirth = yearOfBirth;
		}
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		if (!Objects.equals(address, null) 
				&& !Objects.equals(address, "")) {
			this.address = address;
		}
	}	
}


class Client extends Person {	
	// Fields
	protected String contractNumber = "";
	protected boolean goldStatus;
	
	// Getters and Setters:
	public String getContractNumber() {
		return contractNumber;
	}
	
	public void setContractNumber(String contractNumber) {
		if (!Objects.equals(contractNumber, null) 
				&& !Objects.equals(contractNumber, "")) {
			this.contractNumber = contractNumber;
		}
	}
	
	public boolean isGoldStatus() {
		return goldStatus;
	}
	
	public void setGoldStatus(boolean goldStatus) {
		this.goldStatus = goldStatus;
	}
	
}


class Employee extends Person {	
	// Fields:
	protected int[] startDateOfWork = new int[3];
	protected int salary; // in cents.
	
	// Getters and Setters:
	public int[] getStartDateOfWork() {
		return startDateOfWork.clone();
	}
	
	public void setStartDateOfWork(int[] startDateOfWork) {
		this.startDateOfWork = startDateOfWork.clone();
	}		
}


class Programmer extends Employee {
	// Fields:
	protected String[] programmingLanguages;
	
	// Getters and Setters
	public String[] getProgrammingLanguages() {
		return programmingLanguages.clone();
	}
	
	public void setProgrammingLanguages(String[] programmingLanguages) {
		this.programmingLanguages = programmingLanguages.clone();
	}		
}


class Manager extends Employee {
	// Fields:
	 protected boolean dazzlingSmile;
	 
	 // Getters and Setters:
	 public boolean isDazzlingSmile() {
		 return dazzlingSmile;
	 }
	 
	 public void setDazzlingSmile(boolean dazzlingSmile) {
		 this.dazzlingSmile = dazzlingSmile;
	 }	 
}