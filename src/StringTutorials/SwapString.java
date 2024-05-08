package StringTutorials;

public class SwapString {

	public static void main(String[] args) {
		// swap string using third variable
		
		String a = "Java";
		String b = "Selenium";
		
		String c = a;
		a=b;
		
		System.out.println(a);
		
		b=c;
		System.out.println(b);

	}

}
