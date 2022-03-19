package inheritance;

/* ****** INHERITANCE - EXERCISE : Hospital ******
 * 
 * In this problem, you need to develop a class hierarchy 
 * for the Hospital System. 
 * 
 * The root of the hierarchy is the Person class. It represents all employees 
 * and patients of the Hospital. Doctors are kind of employees.
 * 
 * Please, do not make the classes public.
 * 
 * 
 */

class Hospital {

}

class PersonH {
	// Fields and properties
}

class EmployeeH extends PersonH {
	// Fields and properties
}

class Doctor extends EmployeeH {
	// Fields and properties
}

class Patient extends PersonH {
	// Fields and properties
}