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

		String b1 = abc1.getFirstName();
		int b2 = abc1.getAge();
		String b3 = abc1.getCity();

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

		for (Employee xyz : obj) {
			int age = xyz.getAge();
			if (age > 25) {
				String x1 = xyz.getFirstName();
				String x2 = xyz.getCity();
				
				System.out.println(x1);
				System.out.println(x2);
			}
			
		}
		
		
		

	}

}
