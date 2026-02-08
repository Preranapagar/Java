package Stacks;

import java.util.Stack;

public class Demo1 {

	public static void main(String[] args) {

		Stack s = new Stack();

		s.add(100);
		s.add("P");
		s.add("selenium");
		s.add(45.6f);
		s.add(null);
		s.add(true);

		Object a = s.get(2);

		System.out.println(a);

		boolean a1 = s.contains(null);

		System.out.println(a1);
		
		System.out.println(s);
		
		s.set(0, "Java");
		
		System.out.println(s);
		
		s.add(1,"Neha");
		
		System.out.println(s);
		
		s.add("liya");
		
		System.out.println(s);
		
		Object a3 = s.remove(4);
		
		System.out.println(a3);
		
		boolean a4 = s.isEmpty();
		
		System.out.println(a4);
		
		int a5 = s.size();
		
		System.out.println(a5);
		
		s.clear();
		
		System.out.println(s);

	}

}
