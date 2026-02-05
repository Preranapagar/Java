package LinkedList;

import java.util.LinkedList;

public class Demo1 {

	public static void main(String[] args) {
		
		LinkedList h1 = new LinkedList();
		
		h1.add(100);
		h1.add("selenium");
		h1.add(null);
		h1.add(null);
		h1.add("selenium");
		h1.add(true);
		h1.add("cucumber");
		
		System.out.println(h1);
		
		Object a1 = h1.get(0);
		Object a2 = h1.getFirst();
		
		System.out.println(a1);
		System.out.println(a2);
		
		Object b1 = h1.get(h1.size()-1);
		Object b2 = h1.getLast();
		
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println(h1);
		
		h1.remove();
		System.out.println(h1);
		
		Object r1 = h1.remove(1);
		System.out.println(r1);
		System.out.println(h1);
		
		h1.removeLast();
		
		System.out.println(h1);
		
		h1.removeFirst();
		System.out.println(h1);
		
		h1.add(2,"Jenkins");
		
		System.out.println(h1);
		
		int len = h1.size();
		
		System.out.println(len);
		
		h1.set(1,"Miracle");
		
		System.out.println(h1);
		
		

	}

}
