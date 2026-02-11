package Tutorial11;

import java.util.LinkedHashSet;

public class Demo5 {

	public static void main(String[] args) {

		String a = "cucumber";

		char[] abc = a.toCharArray();

		LinkedHashSet<Character> h1 = new LinkedHashSet<Character>();

		for (char value : abc) {

			boolean result = h1.add(value);

			if (!result) {
				System.out.println(value);
			}
		}
	}

}
