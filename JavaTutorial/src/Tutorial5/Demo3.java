package Tutorial5;

import java.util.Arrays;

public class Demo3 {
	
	public static void main(String[]args) {
		
		String [] abc = {"Neha","Radha","Keshav","Sunita","Chetan"};
		
		Arrays.sort(abc);
		
		System.out.println(Arrays.toString(abc));
		
		Arrays.parallelSort(abc);
		
		System.out.println(Arrays.toString(abc));
	}

}
