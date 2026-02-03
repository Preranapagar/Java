package Tutorial10;

import java.util.ArrayList;

public class Demo1 {
	public static void main(String[] args) {

		ArrayList arr = new ArrayList();

		arr.add(100);
		arr.add(true);
		arr.add(22.5f);
		arr.add("testing");
		arr.add(null);
		arr.add("api");

		Object a1 = arr.get(2);

		System.out.println(arr);

		arr.add(2, "Java");

		System.out.println(arr);

		arr.add(2, 200);

		System.out.println(arr);

		arr.set(1, "fix");

		System.out.println(arr);

		System.out.println(a1);

		Object d1 = arr.remove(1);
		System.out.println(arr);

		System.out.println(d1);

		int d2 = arr.indexOf("Java");

		System.out.println(d2);

		boolean d3 = arr.isEmpty();

		System.out.println(d3);

		boolean d4 = arr.contains("selenium");

		System.out.println(d4);

		int d5 = arr.size();

		System.out.println(d5);

		arr.clear();

		System.out.println(arr);
	}

}
