package Tutorial5;

public class Demo9 {

	public static void main(String[] args) {
		
		String a = "Cucumber";
		
		char[] abc = a.toCharArray();
		
		int len = abc.length -1;
		
		for(int i = len; i>=0; i--) {
			
			char b = abc[i];
			System.out.print(b);
		}
		

	}

}
