package Turtorial4;

public class Demo7 {

	public static void main(String[] args) {
		//find max value in array
		
		int [] abc = {34,78,54,23,56,23,56,89,88};
		
		int max = abc[0];
		
		for (int i=0; i < abc.length; i++) {
			
			if(abc[i]>max) {
				max=abc[i];
			}
		}
		
		System.out.println(max);

	}

}
