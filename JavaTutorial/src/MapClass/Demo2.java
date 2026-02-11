package MapClass;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {

		String s = "javaja";

		char[] abc = s.toCharArray();

		LinkedHashMap<Character, Integer> h1 = new LinkedHashMap<Character, Integer>();

		for (char key : abc) {
			if (h1.containsKey(key)) {

				int existingval = h1.get(key);
				h1.put(key, existingval + 1);
			} else {
				h1.put(key, 1);
			}
		}
		
		Set<Entry<Character, Integer>> a4 = h1.entrySet();
		
		System.out.println(a4);

	}

}
