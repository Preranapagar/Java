package Tutorial5;

public class Demo14 {

	public static void main(String[] args) {
		
		
		String a = "           Selenium              Java             ";
		
		System.out.println(a);
		
		String a1 = a.trim();
		
		System.out.println(a1);
		
		String a2 = a1.replaceAll(" ", "");
		System.out.println(a2);
		
		String a3 = a1.replaceAll("\\s+", " ");
		
		System.out.println(a3);

	}

}
