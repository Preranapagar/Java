package Tutorial5;

import java.util.Arrays;

public class Demo5 {

	public static void main(String[] args) {

		int[] abc = { 100, 50, 34, 65, 13, 45, 13, 54 };

		int xyz[] = abc;

		System.out.println(Arrays.toString(xyz));

		int[] pqr = Arrays.copyOf(abc, abc.length);

		System.out.println(Arrays.toString(pqr));

		int[] kyz = Arrays.copyOfRange(abc, 3, 6);

		System.out.println(Arrays.toString(kyz));

		int[] abc2 = Arrays.copyOf(abc, 4);
		System.out.println(Arrays.toString(abc2));

	}

}
