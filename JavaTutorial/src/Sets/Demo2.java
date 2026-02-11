package Sets;

import java.util.LinkedHashSet;

public class Demo2 {

	public static void main(String[] args) {
		
		LinkedHashSet s1 = new LinkedHashSet();
		
		s1.add(100);
		s1.add("selenium");
		s1.add(true);
		s1.add(100);
		s1.add(100);
		s1.add(null);
		s1.add(null);
		s1.add("rest");
		
		System.out.println(s1);
		
		boolean a1 = s1.remove("rest");
		
		System.out.println(a1);
		
		boolean a2 = s1.contains(null);
		
		System.out.println(a2);
		
		

	}

}
