package Tutorial5;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		// check array values are anagram or not

		int[] abc = { 100, 30, 50, 60, 70 };
		int[] xyz = { 50, 70, 100, 30, 60 };
		
		Arrays.sort(abc);
		Arrays.sort(xyz);
		
		if(Arrays.equals(abc,xyz)) {
			System.out.println("Arrays are anagram");
		}
		else {
			System.out.println("Arrays are not anagram");
		}

	}

}
