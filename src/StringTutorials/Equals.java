package StringTutorials;

public class Equals {

	public static void main(String[] args) {
		// Equals method
		// use to compare two different objects
		// return type is boolean
		// use to compare actual content of string object
		
		String a = "selenium";
		String b = "Selenium";
		
		boolean answer = a.equals(b);
		System.out.println(answer);
		
		String c = "Selenium";
		String d = "Selenium";
		
		boolean answer2 = c.equals(d);
		System.out.println(answer2);
		

	}

}
