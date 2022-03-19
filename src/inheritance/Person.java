package inheritance;

import java.util.Arrays;

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
	
	
	public static void main(String[] args) {
		Programmer p1 = new Programmer();
		
		p1.setAddress("mail Ada Lovelace");
		p1.setName("John Elephant");
		p1.setProgrammingLanguages(new String[] 
				{"Java", "Python", "JavaScript"});
		p1.setYearOfBirth(1980);
		p1.setStartDateOfWork(new int[] {13, 10, 2020});
		p1.setSalary(500_000L);
		
		p1.introduce();
		
		
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
	protected long salary; // in cents.
	
	// Getters and Setters:
	public int[] getStartDateOfWork() {
		return startDateOfWork.clone();
	}
	
	public void setStartDateOfWork(int[] startDateOfWork) {
		this.startDateOfWork = startDateOfWork.clone();
	}	
	
	public long getSalary() {
		return salary;
	}
	
	public void setSalary(long salary) {
		this.salary = salary;
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
	
	// Method
	public void introduce() {
		System.out.println("Hi, I am honored to work for you!");
		System.out.printf("My name is %s, and you give me %,d$ per year.%n", 
				getName(), getSalary());
		System.out.printf("I was born in %d, and I now master %s.%n", 
				getYearOfBirth(), Arrays.toString(getProgrammingLanguages()));
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