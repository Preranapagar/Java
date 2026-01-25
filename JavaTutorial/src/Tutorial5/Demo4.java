package Tutorial5;

import java.util.Arrays;

public class Demo4 {
	public static void main(String[] args) {
		int[] abc = { 100, 30, 50, 60, 70 };

		int[] xyz = { 50, 70, 100, 30, 60 };

		Arrays.parallelSort(abc);
		Arrays.parallelSort(xyz);

		if (Arrays.equals(abc, xyz)) {
			System.out.println("Arrays are anagram");
		} else {
			System.out.println("Arrays are not anagram");
		}
	}
}
