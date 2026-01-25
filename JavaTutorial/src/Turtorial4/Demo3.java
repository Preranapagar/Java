package Turtorial4;

import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {

		int abc[] = new int[5];

		abc[0] = 52;
		abc[1] = 6;
		abc[2] = 80;
		abc[3] = 9;
		abc[4] = 10;
		
		System.out.println(abc[3]);
		
		System.out.println(abc[2]);
		
		System.out.println(Arrays.toString(abc));
		
		Arrays.sort(abc);
		
		System.out.println(Arrays.toString(abc));
		
		
	}

}
