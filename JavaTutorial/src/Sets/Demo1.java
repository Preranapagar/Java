package Sets;

import java.util.HashSet;

public class Demo1 {

	public static void main(String[] args) {
		
		HashSet s1 = new HashSet();
		
		s1.add(100);
		s1.add("selenium");
		s1.add(34.67f);
		s1.add(true);
		s1.add("java");
		s1.add(null);
		s1.add(null);
		
		System.out.println(s1);
		
		boolean a1 = s1.remove("java");
		
		System.out.println(a1);
		
		System.out.println(s1);
		
		int a2 = s1.size();
		
		System.out.println(a2);
		
		s1.clear();

	}

}
