package Tutorial8;

public class Demo1 {
	
	public static void revereseString(String s) {
		
		for(int i = s.length()-1; i>=0; i--) {
			char s1 = s.charAt(i);
			System.out.print(s1);
		}
		
		System.out.println();
		
	}

	public static void main(String[] args) {
		
		System.out.println("Main Methoda");
		
		Demo1.revereseString("Radhika");
		Demo1.revereseString("Mohan");
		

	}

}
