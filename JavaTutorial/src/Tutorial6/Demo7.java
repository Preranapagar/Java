package Tutorial6;

public class Demo7 {

	public static void main(String[] args) {
		// swap string using third variable
		
		String a1 = "Selenium";
		String a2 = "Java";
		
		System.out.println(a1);
		System.out.println(a2);
		
		String temp = a1;
		a1 = a2;
		a2 = temp;
		
		System.out.println(a1);
		System.out.println(a2);
		
		//swap without third variable
		
		String b1 = "Manohar";
		String b2 = "Gandhi";
		
		System.out.println(b1);
		System.out.println(b2);
		
		b1 = b1.concat(b2);
		
//		System.out.println(b1);
		
		
		b2 = b1.substring(0, b1.length()-b2.length());
		b1 = b1.substring(b2.length());
		
		System.out.println(b1);
		System.out.println(b2);
		
		

	}

}
