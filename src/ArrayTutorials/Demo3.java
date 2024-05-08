package ArrayTutorials;

import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {
		
		int []abc = {23,56,87,32,78,43};
		
		Arrays.sort(abc);
		
		int a = abc[abc.length - 1];
		System.out.println(a);
		
		int b = abc[0];
		System.out.println(b);
	}

}
