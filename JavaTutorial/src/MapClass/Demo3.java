package MapClass;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

public class Demo3 {

	public static void main(String[] args) {
		
		Hashtable h1 = new Hashtable();
		
		h1.put(101,"Playwrite");
		h1.put(102, 1000);
		h1.put("A", "Docker");
//		h1.put(null, "testNG");
//		h1.put(103, null);
		
		Object a1 = h1.get(102);
		
		System.out.println(a1);
		
		Object a2 = h1.remove("A");
		
		System.out.println(a2);
		
		boolean a3 = h1.containsValue("Docker");
		
		System.out.println(a3);
		
		boolean a4 = h1.isEmpty();
		
		System.out.println(a4);
		
		int a5 = h1.size();
		
		System.out.println(a5);
		
		Set a6 = h1.keySet();
		System.out.println(a6);
		
		Collection a8 = h1.values();
		System.out.println(a8);
		

	}

}
