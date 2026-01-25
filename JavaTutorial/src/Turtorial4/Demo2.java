package Turtorial4;

import java.util.Arrays;

public class Demo2 {
	public static void main(String[] args) {

		String[] xyz = new String[5];

		xyz[0] = "Manisha";
		xyz[1] = "Nanasaheb";
		xyz[2] = "Prerana";
		xyz[3] = "Pratik";
		xyz[4] = "Shaoumik";

		System.out.println(xyz[4]);
		System.out.println(Arrays.toString(xyz));

		Arrays.sort(xyz);
		
		System.out.println(Arrays.toString(xyz));

	}
}
