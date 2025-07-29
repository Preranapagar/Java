package loopa;

public class Demo2 {
	public static void main(String[] args) {
		
		int a = 10, b = 200, c = 80;
		
		if((a > b) && (a>c))
		{
			System.out.println("A is greater than B and C");
		}
		else if ((b > a) && (b > c))
		{
			System.out.println("B is greater than A and C");
		}
		else
		{
			System.out.println("C is greater than A and B");
		}
	}

}
