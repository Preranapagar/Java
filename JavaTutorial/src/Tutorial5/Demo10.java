package Tutorial5;

public class Demo10 {

	public static void main(String[] args) {
		
		String a = "Prerana";
		
		char []abc = a.toCharArray();
		
		for (int i = abc.length-1; i>=0; i--) {
			
			char b = abc[i];
			System.out.print(b);
		}

	}

}
