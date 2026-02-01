package Tutorial8;

import java.util.Arrays;

public class Anagram {

	public static String anagramCheck() {

		String a = "silent";
		String b = "listen";

		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();

		Arrays.sort(a1);
		Arrays.sort(b1);

		boolean result = Arrays.equals(a1, b1);

		if (result) {
			return "Strings are anagram";
		} else {
			return "String is not anagram";
		}

	}

	public static void main(String[] args) {

		String answer = Anagram.anagramCheck();

		System.out.println(answer);
	}

}
