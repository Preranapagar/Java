package Tutorial9;

public class Demo4 {

	public String palindromeCheck(String a) {

		String reverse = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			reverse = reverse + a.charAt(i);
		}
		
		boolean result = a.equals(reverse);
		if(result) {
			return "String is Palindrome";
		}
		else {
			return "String is not Palindrome";
		}
	}

	public static void main(String[] args) {
		
		Demo4 obj = new Demo4();
		
		String ans = obj.palindromeCheck("madam");
		String ans2 = obj.palindromeCheck("silent");
		
		System.out.println(ans);
		System.out.println(ans2);

	}

}
