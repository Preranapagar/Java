package Tutorial8;

public class Demo3 {

	public static void noReturn() {
		System.out.println("No return type");
	}

	public static String checkPalindrome() {

		String original = "cucumber";

		String reverse = "";

		for (int i = original.length() - 1; i >= 0; i--) {
			char a = original.charAt(i);
			reverse = reverse + a;

		}

		
		if(original.equals(reverse)) {
			return "String is Palindrome";
		}
		else {
			return "String is not Palindrome";
		}
	}

	public static void main(String[] args) {

		String result = Demo3.checkPalindrome();
		System.out.println(result);
	}

}
