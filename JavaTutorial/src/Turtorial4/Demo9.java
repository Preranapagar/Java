package Turtorial4;

import java.util.Arrays;

public class Demo9 {

	public static void main(String[] args) {
		// sort array without sort method

		int[] abc = { 34, 78, 54, 23, 56, 23, 56, 89, 88 };

		for (int i = 0; i < abc.length; i++) {

			for( int j = i+1; j < abc.length; j ++) {
				
				if(abc[i]>abc[j]) {
					int temp = abc[i];
					abc[i] = abc[j];
					abc[j]= temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(abc));

	}

}
