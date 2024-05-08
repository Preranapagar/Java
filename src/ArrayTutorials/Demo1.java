package ArrayTutorials;

public class Demo1 {
	public static void main (String[]args) {
		
		int[] abc = new int[5];
		
		abc[0]=10;
		abc[1]=20;
		abc[2]=30;
		abc[3]=40;
		abc[4]=50;
		
		System.out.println(abc[0]);
		System.out.println(abc[1]);
		System.out.println(abc[2]);
		System.out.println(abc[3]);
		System.out.println(abc[4]);
		
		for(int i=0; i<=4; i++)
		{
			System.out.println(abc[i]);
		}
	}

}
