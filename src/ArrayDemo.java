
public class ArrayDemo {

	public static void main(String[] args) {
		
		//Single dimensional array
		int[] myIntArray = new int[10];
		myIntArray[0] = 10;
		myIntArray[1] = 20;
		
		System.out.println("Single Dimensional Array");
		System.out.println(myIntArray[1]);
		System.out.println(myIntArray.length);
		
		int[] myArray = {3,4,5,6};
		System.out.println(myArray[3]);
		System.out.println(myArray.length);
		
		//Multidimensional array
		
		int [][] myMultiArray = new int [2][3];
		myMultiArray[0][0] = 2;
		myMultiArray[0][1] = 3;
		myMultiArray[0][2] = 4;
		myMultiArray[1][0] = 5;
		myMultiArray[1][1] = 6;
		myMultiArray[1][2] = 7;
		
		System.out.println("Multi Dimensional Array");
		System.out.println(myMultiArray[1][1]);
		
		int [][] myMultiArray1 = {{2,3,4},{5,6,7}};
		System.out.println(myMultiArray1[1][1]);
		
		System.out.println("Accessing Array Values Using For Loop");
		
		for (int i=0; i < myMultiArray.length; i++) {
			for (int j=0; j < myMultiArray[i].length; j++) {
				System.out.println(myMultiArray[i][j]);
			}
		}
	}

}
