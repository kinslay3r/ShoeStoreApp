package Model;

import java.util.ArrayList;

public class Model {

	ArrayList<Employee> emps = new ArrayList<Employee>();
	
	public Model() {
		Employee em1 = new Employee("Emily", "Smith", "esmith", "password");
		Employee em2 = new Employee("Gary", "Shooze", "eshooze", "bundy");
		Employee em3 = new Employee("Keith", "Coffel", "kcoffel", "abc123");
        
        //add them to the array of employees
        emps.add(em1);
        emps.add(em2);
        emps.add(em3);
	}
	
	
}
