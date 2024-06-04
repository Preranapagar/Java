package Methods;

public class Demo2 {

	public void reverseString() {
		String s = "Selenium";
		int abc = s.length()-1;
		
		for(int i=abc;i>=0;i--) {
			char p = s.charAt(i);
			System.out.print(p);
		}
	}
	public static void main(String[] args) {
		
		Demo2 obj = new Demo2();
		obj.reverseString();
	}

}
