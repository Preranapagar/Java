package Tutorial5;

public class Demo7 {

	public static void main(String[] args) {
		// reverse string
		
		String a = "Selenium";
		
		int length = a.length()-1;
		
		for(int i =length; i>=0; i--) {
			char j = a.charAt(i);
			System.out.println(j);
		}

	}

}
