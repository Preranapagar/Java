package Stacks;

import java.util.ArrayList;
import java.util.Collections;

public class Demo5 {

	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		
		arr.add(100);
		arr.add(200);
		arr.add(459);
		arr.add(43);
		
		System.out.println(arr);
		
		Collections.sort(arr);
		
		System.out.println(arr);

	}

}
