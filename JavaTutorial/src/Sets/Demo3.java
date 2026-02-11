package Sets;

import java.util.SortedSet;
import java.util.TreeSet;

public class Demo3 {

	public static void main(String[] args) {
		// SortedSet

		SortedSet<String> s1 = new TreeSet<String>();
		
		s1.add("Java");
		s1.add("selenium");
		s1.add("cucumber");
		s1.add("jenkins");
		s1.add("python");
		s1.add("sql");
		
		System.out.println(s1);
		
		String a1 = s1.first();
		
		System.out.println(a1);
		
		SortedSet<String> a2 = s1.headSet("cucumber");
		
		System.out.println(a2);
		
		SortedSet<String> a3 = s1.tailSet("cucumber");
		
		System.out.println(a3);
		
		SortedSet<String> a4 = s1.subSet("cucumber","python");
		
		System.out.println(a4);
		

	}

}
