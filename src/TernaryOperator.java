
public class TernaryOperator {

	public static void main(String[] args) {
		// variable = (condition) ? TrueExpression : FalseExpression
		// Ternary operator use to replace if else in Java
		
		int num1 = 20;
		int num2 = 40;
		
		if (num1>num2) {
			System.out.println("Num 1 is greater than Num 2");
		}
		else {
			System.out.println("Num 2 is greater than Num 1");
		}

		String result = (num1>num2) ? "Num 1 is greater than Num 2" : "Num 2 is greater than Num 1";
		System.out.println(result);
		
		int result2= (num1>num2) ? 1:2;
		System.out.println(result2);
	}

}
