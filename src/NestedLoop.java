
public class NestedLoop {
	public static void main(String[]args) {
		
		for (int i = 1; i<=4; i++) {
			int j = 1;
			while (j<=10) {
				System.out.println(i +":"+ j);
				j++;	
			}
		System.out.println("*******");
		}
	}
}
