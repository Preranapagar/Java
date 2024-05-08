package ArrayTutorials;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		// Find max value in array
		
		int [] abc = new int[5];
		
		abc[0] = 20;
		abc[1] = 22;
		abc[2] = 96;
		abc[3] = 57;
		abc[4] = 82;
		
		int max = abc[0];
		
		for(int i=0; i<=4;i++)
		{
			if (abc[i]>max)
			{
				max = abc[i];
				
			}
		}
		System.out.println(max);
		
		//enhance for loop
		
		for (int xyz:abc)
		{
			System.out.println(xyz);
		}
		
		//array creation
		
		int [] kbc = {34,67,89,432};
		System.out.println(kbc.length);
		System.out.println(Arrays.toString(kbc));

	}

}
