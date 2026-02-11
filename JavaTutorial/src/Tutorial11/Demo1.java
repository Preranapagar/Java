package Tutorial11;

import java.util.ArrayList;

public class Demo1 {

	public static void main(String[] args) {
		
		ArrayList<Object>arr = new ArrayList<>();
		
		arr.add(100);
		arr.add("selenium");
		arr.add("cucumber");
		arr.add(null);
		arr.add(23.45f);
		
		System.out.println(arr);
		
		Object [] abc = arr.toArray();
		
		for (Object value: abc) {
			System.out.println(value);
		}
	}

}
