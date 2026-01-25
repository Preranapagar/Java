package Tutorial6;

public class Demo1 {
	public static void main(String[]args) {
		
		String a = "Java";
		
		int b = a.indexOf("a");
		System.out.println(b);
		
		int c = a.lastIndexOf("a");
		System.out.println(c);
		
		int d = a.indexOf("b");
		System.out.println(d);
		
		boolean p = a.isBlank();
		System.out.println(p);
		
		String a2 = "";
		
		boolean p1 = a2.isBlank();
		boolean p2 = a2.isEmpty();
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
