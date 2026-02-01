package Tutorial7;

public class Demo2 {
	
	public static void Display() {
		
		System.out.println("Display method in demo class");
	}

	public static void main(String[] args) {
		
		Demo2.Display();
		
		Display();
		
		Demo2 obj = new Demo2();
		obj.Display();
		

	}

}
