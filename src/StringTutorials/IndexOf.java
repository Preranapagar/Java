package StringTutorials;

public class IndexOf {

	public static void main(String[] args) {
		// This method is use to find first index of special character
		// return type int
		
		String a = "Selenium";
		
		int b = a.indexOf('e');
		System.out.println(b);

		// lastindex  : finding a last index of given character
		
		int c = a.lastIndexOf('e');
		System.out.println(c);
	}

}
