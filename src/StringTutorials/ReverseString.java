package StringTutorials;

public class ReverseString {

	public static void main(String[] args) {
		
		String a = "Pune";
		
		int len = a.length()-1;
		
		String ans = "";
		
		for(int i=len; i>=0; i--) {
			char b = a.charAt(i);
			ans+=b;
		}
		
		System.out.println(ans);

	}

}
