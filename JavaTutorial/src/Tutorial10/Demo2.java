package Tutorial10;

import java.util.ArrayList;

public class Demo2 {

	public static void main(String[] args) {

		ArrayList arr1 = new ArrayList();

		ArrayList arr2 = new ArrayList();

		System.out.println(arr1);
		System.out.println(arr2);

		arr1.add("a");
		arr1.add("b");
		arr1.add("c");
		arr1.add("d");

		System.out.println(arr1);
		
		arr2.add(1);
		arr2.add(2);
		arr2.add(3);
		arr2.add(4);
		
		System.out.println(arr2);
		
		arr1.addAll(arr2);
		
		System.out.println(arr1);
		
		boolean a = arr1.containsAll(arr2);
		
		System.out.println(a);
		
		arr1.removeAll(arr2);
		
		System.out.println(arr1);
		
		boolean a1 = arr1.containsAll(arr2);
		System.out.println(a1);
		
		arr1.retainAll(arr2);
		
		System.out.println(arr1);
		
		ArrayList arr3 = new ArrayList();
		
		arr3.add(1);
		arr3.add(10);
		arr3.add(4);
		
		System.out.println(arr3);
		
		arr2.retainAll(arr3);
		
		System.out.println(arr2);

	}

}
