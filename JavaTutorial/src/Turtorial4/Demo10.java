package Turtorial4;

import java.util.Arrays;

public class Demo10 {

	public static void main(String[] args) {
		
		int [] xyz = {23,7,54,23,67,8,34,26};
		
		for(int i=0; i<xyz.length;i++) {
			for(int j = i+1; j <xyz.length; j++) {
				if(xyz[i]>xyz[j]) {
					int temp = xyz[i];
					xyz[i]=xyz[j];
					xyz[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(xyz));

	}

}
