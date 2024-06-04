package Methods;

public class Demo1 {
	
	//Non Static method
	public void abc()
	{
		System.out.println("abc method");
	}

	public static void main(String[] args) {
		//main method
		
		Demo1 obj = new Demo1();
		obj.abc();

	}

}
