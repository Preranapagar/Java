package Tutorial9;

public class Demo1 {
	
	public void reverseString() {
		
		String a = "Java";
		
		for(int i=a.length()-1; i>=0; i--) {
			
			System.out.print(a.charAt(i));
		}
		System.out.println();
	}
	
	public void reverseString(String a) {
		for(int i = a.length()-1; i>=0; i--) {
			System.out.print(a.charAt(i));
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		Demo1 obj = new Demo1();
		
		obj.reverseString();
		obj.reverseString("Kalpesha");
		
	}

}
