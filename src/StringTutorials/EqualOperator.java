package StringTutorials;

public class EqualOperator {

	public static void main(String[] args) {
		// == Operator
		// use to compare different objects
		// return type is boolean
		// this method is use to compare memory location of string
		
		String a = "Selenium"; //same memory location
		
		String b = "Selenium"; // same memory location
		
		System.out.println(a==b);
		
		String c = new String("Selenium");
		String d = new String("Selenium");
		
		System.out.println(a==c);
		System.out.println(c==d);
		
		System.out.println(a.equals(c));

	}

}
