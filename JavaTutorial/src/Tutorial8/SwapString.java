package Tutorial8;

public class SwapString {

	public static String[] swapStringWithT() {

		String a = "Anisha";
		String b = "Nisha";

		String temp = b;
		b = a;
		a = temp;

		return new String[] { a, b };

	}
	
	public static String[] swapStringWithT(String a, String b) {
		
		String temp = b;
		b=a;
		a=temp;
		
		return new String[] {a,b};
	}
	
	public static String[] swapString() {
		
		String a = "Ashish";
		String b = "Nehra";
		
		a = a.concat(b);
		b = a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
		
		
		return new String[] {a,b};
	}

	public static void main(String[] args) {

		String[] result = SwapString.swapStringWithT();

		System.out.println(result[0]);
		System.out.println(result[1]);
		
		
		String[] result1 = SwapString.swapStringWithT("Kesha", "Anvesha");
		
		System.out.println(result1[0]);
		System.out.println(result1[1]);
		
		String[] result2 = SwapString.swapString();
		
		System.out.println(result2[0]);
		System.out.println(result2[1]);

	}

}
