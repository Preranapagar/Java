package Turtorial4;

public class Demo8 {

	public static void main(String[] args) {
		// find min value in array

		int[] abc = { 34, 78, 54, 23, 56, 23, 56, 89, 88 };

		int min = abc[0];

		for (int i = 0; i < abc.length; i++) {
			
			if(abc[i]<min) {
				min=abc[i];
			}
		}
		System.out.println(min);
	}

}
