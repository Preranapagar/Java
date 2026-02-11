package Sets;

import java.util.TreeSet;

public class Demo4 {

	public static void main(String[] args) {
		
		TreeSet<String> t1 = new TreeSet<String>();
		
		t1.add("Java");
		t1.add("cucumber");
		t1.add("netflix");
		t1.add("amazon");
		t1.add("Nirali");
		t1.add("Patel");
		
		System.out.println(t1);
		
		String a1 = t1.pollFirst();
		System.out.println(a1);
		
		String a2 = t1.pollLast();
		System.out.println(a2);
		
		String a3 = t1.lower("Patel");
		System.out.println(a3);
		
		String a4 = t1.higher("amazon");
		System.out.println(a4);
		
		String a5 = t1.ceiling("Rain");
		System.out.println(a5);
		
		String a6 = t1.floor("Rain");
		System.out.println(a6);
		
		String a7 = t1.ceiling("Java");
		System.out.println(a7);
		
		String a8 = t1.floor("cucumber");
		System.out.println(a8);


	}

}
