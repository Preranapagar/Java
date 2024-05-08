package StringTutorials;

public class EqualsIgnoreCase {

	public static void main(String[] args) {
		// it is use to compare two different strings ignoring the case
		// return type is boolean
		
		String a = "selenium";
		String b = "Selenium";
		
		boolean answer = a.equalsIgnoreCase(b);
		System.out.println(answer);

	}

}
