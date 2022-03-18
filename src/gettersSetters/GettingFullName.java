package gettersSetters;

import java.util.Objects;

/* ****** GETTERS AND SETTERS - Exercise : Getting full name ******
 * 
 * Here is the User class with two fields: firstName and lastName.
 * 
 * Implement two null-safety setters and one calculated getter in the 
 * following ways:
 * 
 * - both setters should accept and set a value if it is not 
 * null or an empty string "";
 * - the getter should return the full name of the user by concatenating 
 * firstName and lastName using a single space between them. If one of the 
 * parts was not set, the getter should return another part without 
 * additional spaces. If both parts are empty, the getter should 
 * return the word "Unknown".
 */

class GettingFullName {

	private String firstName;
	private String lastName;

	public GettingFullName() {
		this.firstName = "";
		this.lastName = "";
	}

	public void setFirstName(String firstName) {
		// write your code here
		if (!Objects.equals(firstName, null)  
				&& !Objects.equals(firstName, "")) {
			this.firstName = firstName;
		}
	}

	public void setLastName(String lastName) {
		// write your code here
		if (!Objects.equals(lastName, null) 
				&& !Objects.equals(lastName, "")) {
			this.lastName = lastName;
		}
	}

	public String getFullName() {
		if (Objects.equals(firstName, "")) {
			if (Objects.equals(lastName, ""))  {
				return "Unknown";
			} else {
				return lastName;
			}
		} else if (Objects.equals(lastName, "")) {
			return firstName;
		} else {
			return firstName + " " + lastName;
		}

	}
	
	
	public static void main(String[] args) {
		String[] string1 = {new String(), "Alpha", "Bravo", "Charlie", new String(), "Delta"};
		String[] string2 = {"Mike", "November", "", "Oscar", new String(), "Papa"};
		
		for (int i = 0; i < 6; i++) {
			GettingFullName temp1 = new GettingFullName();
			temp1.setFirstName(string1[i]);
			temp1.setLastName(string2[i]);
			System.out.println(i + " ==>\n\t" + temp1.getFullName());
			System.out.println("*****");
		}
	}

}
