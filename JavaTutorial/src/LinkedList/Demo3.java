package LinkedList;

import java.util.ArrayList;

public class Demo3 {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setFirstName("Prerana");
		emp1.setAge(30);
		emp1.setCity("Nashik");
		
		Employee emp2 = new Employee();
		emp2.setFirstName("Neha");
		emp2.setAge(27);
		emp2.setCity("Pune");
		
		Employee emp3 = new Employee();
		emp3.setFirstName("Akku");
		emp3.setAge(32);
		emp3.setCity("Faltan");
		
		ArrayList<Employee> obj = new ArrayList<Employee>();
		
		obj.add(emp1);
		obj.add(emp2);
		obj.add(emp3);
		
		System.out.println(obj);
		
		Employee abc1 = obj.get(0);
		
		System.out.println(abc1);
	}

}
