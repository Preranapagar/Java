package Tutorial5;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {

		int[] abc = { 12, 57, 87, 34, 24, 67, 43 };

		// length

		int len = abc.length;

		System.out.println("Length of array is : " + len);

		// sort method

		Arrays.sort(abc);

		System.out.println(Arrays.toString(abc));

		// parallelsort

		Arrays.parallelSort(abc);

		System.out.println(Arrays.toString(abc));

		// copy of range

		int[] xyz = Arrays.copyOfRange(abc, 2, 4);

		System.out.println(Arrays.toString(xyz));

	}

}
