package Tutorial11;

import java.util.ArrayList;

public class Demo2 {

	public static void main(String[] args) {
		
		ArrayList<Object> arr = new ArrayList<>();
		
		arr.add(100);
		arr.add("selenium");
		arr.add("cucumber");
		arr.add(200);
		arr.add(null);
		arr.add(34.5f);
		arr.add(false);
		
		Object [] abc = arr.toArray();
		
		for(int i =0; i < abc.length; i ++) {
			
			System.out.println(abc[i]);
		}

	}

}
