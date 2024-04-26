
public class NestedIFElse {

	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 40;
		int num3 = 30;
		
		if (num1>num2)
		{
			if (num1>num3)
			{
				System.out.println("Num 1 is largest number");
			}
		}
		else if (num2>num3)
		{
			System.out.println("Num 2 is largest number");
		}
		else
		{
			System.out.println("Nume 3 is largest number");
		}

	}

}
