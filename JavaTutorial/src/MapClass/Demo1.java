package MapClass;

import java.util.HashMap;

public class Demo1 {

	public static void main(String[] args) {
		
		HashMap h1 = new HashMap();
		
		h1.put(101,"selenium");
		h1.put(102,"java");
		h1.put(103,"postman");
		h1.put(null, 1021);
		h1.put(null, "test");
		h1.put(null, "jesha");
		
		System.out.println(h1);
		
		h1.remove(103);
		
		System.out.println(h1);
		
		

	}

}
