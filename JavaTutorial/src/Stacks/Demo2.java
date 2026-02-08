package Stacks;

import java.util.Stack;

public class Demo2 {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		s.add(100);
		s.add(34.6f);
		s.add("Krishna");
		s.add("java");
		s.add(false);
		s.add(null);
		s.add(null);
		
		System.out.println(s);
		
		Object a1 = s.pop();
		
		System.out.println(a1);
		
		System.out.println(s);
		
		Object a2 = s.peek();
		
		System.out.println(a2);
		
		System.out.println(s);
		
		int a3 = s.search(100);
		
		System.out.println(a3);
		
		System.out.println(s);
		
		s.push(null);
		
		System.out.println(s);
		
	
	}

}
