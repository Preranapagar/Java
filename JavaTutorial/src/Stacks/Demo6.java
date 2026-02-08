package Stacks;

import java.util.ArrayList;
import java.util.Collections;

public class Demo6 {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		emp1.setId(101);
		emp1.setFname("Madhura");
		emp1.setDname("HR");
		emp1.setSalary(120000);
		
		Employee emp2 = new Employee();
		
		emp2.setId(102);
		emp2.setFname("Radhika");
		emp2.setDname("PERF");
		emp2.setSalary(4000000);
		
		Employee emp3 = new Employee();
		
		emp3.setId(103);
		emp3.setFname("Manohar");
		emp3.setDname("QAD");
		emp3.setSalary(329000);
		
		ArrayList<Employee> arr = new ArrayList<Employee>();
		
		arr.add(emp1);
		arr.add(emp2);
		arr.add(emp3);
		
		Collections.sort(arr);
		
		for (Employee emp : arr) {
			System.out.println(emp.getFname() + "::" + emp.getDname());
		}
		
		
	}

}
