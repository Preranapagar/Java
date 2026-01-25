package Turtorial4;

import java.util.Arrays;

public class Demo6 {

	public static void main(String[] args) {
		
		int [] abc = {45,67,32,78,97,45,3,12};
		
		for(int i:abc) {
			System.out.println(i);
		}
		
		Arrays.sort(abc);
		
		for(int i=0; i< abc.length;i++) {
			System.out.println(abc[i]);
		}
	}

}
