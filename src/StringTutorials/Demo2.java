package StringTutorials;

public class Demo2 {

	public static void main(String[] args) {
		// remove all star, ending and mid spaces and reverse a string
		
		String a = "         ui    automation testing          ";
		String b = a.trim().replaceAll("\\s+", " ");
		System.out.println(b);
		
		int len = b.length()-1;
		
		String ans = "";
		
		for(int i=len; i>=0; i--)
		{
			char c = b.charAt(i);
			ans += c;
		}
		
		System.out.println(ans);

	}

}
