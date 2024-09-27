package practicedemo2;

/**
*
* @author ajay
*/

import java.util.TreeSet;

public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee("John",5300.80);
		Employee emp2 = new Employee("Tony",3500);
		
		TreeSet<Employee> empset = new TreeSet<Employee>();
		
		empset.add(emp1);
		empset.add(emp2);
		
		System.out.println("Size of Employee Set is:" + empset.size());
		
		for(Employee emp:empset) {
			System.out.println(emp);
		}

	}

}
