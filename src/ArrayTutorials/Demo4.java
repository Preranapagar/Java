package ArrayTutorials;

import java.util.Arrays;

public class Demo4 {

	public static void main(String[] args) {
		//copy array values from one array to another
		
		int [] abc = {10,203,405,60,70};
		System.out.println(Arrays.toString(abc));
		
		int[] xyz = abc;
		System.out.println(Arrays.toString(xyz));
		
		int[] pqr = abc.clone();
		System.out.println(Arrays.toString(pqr));

	}

}
