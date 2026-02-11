package Tutorial11;

import java.util.LinkedHashSet;

public class Demo7 {

	public static void main(String[] args) {
		
		String a = "cucumber";
		
		char[] abc = a.toCharArray();
		
		LinkedHashSet<Character> h1 = new LinkedHashSet<Character>();
		
		LinkedHashSet<Character> h2 = new LinkedHashSet<Character>();
		
		for(char value : abc) {
			
			boolean result = h1.add(value);
			
			if (!result) {
				
				h2.add(value);
			}
		}
		
		h1.removeAll(h2);
		
		System.out.println(h1);
		
		
	}

}
