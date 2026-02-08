package Stacks;

public class Employee implements Comparable<Employee> {

		int id;
		String fname;
		String dname;
		int salary;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getDname() {
			return dname;
		}
		public void setDname(String dname) {
			this.dname = dname;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		@Override
		public int compareTo(Employee newEmployee) {
			return fname.compareTo(newEmployee.fname);
	}
	

}
