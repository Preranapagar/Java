package Tutorial11;

import java.util.LinkedHashSet;

public class Demo6 {

	public static void main(String[] args) {

		String a = "aaaaaaaaaaabbbbbbbbbbbbbbcccccd";

		char[] abc = a.toCharArray();

		LinkedHashSet<Character> l1 = new LinkedHashSet<Character>();

		LinkedHashSet<Character> l2 = new LinkedHashSet<Character>();

		for (char value : abc) {
			boolean result = l1.add(value);

			if (!result) {
				l2.add(value);
			}

		}

		System.out.println(l2);
	}

}
