package Tutorial7;

public class Demo6 {
	
	public static void employeeName(String name) {
		System.out.println("Employee name is :" + name);
	}
	
	public static void employeeID(int Id) {
		System.out.println("Employee Id :" + Id);
	}

	public static void main(String[] args) {
		
		System.out.println("Main Method started");
		
		Demo6.employeeName("Neha");
		Demo6.employeeID(9);
		Demo6.employeeName("Radha");
		Demo6.employeeID(20);
		
		System.out.println("Main method ended");

	}

}
