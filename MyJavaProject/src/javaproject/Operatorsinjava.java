package javaproject;

public class Operatorsinjava {
	
	public static void main (String[] args) {
		
		System.out.println("Operators in Java :");
		
		/*
		 * there are 4 types operator in java
		 * 1) Arithemetic operator
		 * 2) Relational Operator
		 * 3) logical Operator
		 * 4) Assignment Operator
		 */
		
		System.out.println("1) Arithmetic Ooperators");
		
		/*
		 * there are 7 types of Arithemetic operator
		 * i) addition +
		 * ii) substraction -
		 * iii) Multiplication *
		 * iv) Division /
		 * v) module %
		 * vi) increment ++
		 * viii) decrement --
		 * 
		 */
		
		int a= 10, b=20;
		
		System.out.println("Addition: " + (a + b));
		System.out.println("Substraction: " + (a - b));
		System.out.println("Multiplication: " + (a * b));
		System.out.println("Division: " + (a / b));
		System.out.println("module: " + (a % b));
		
		a++;
		System.out.println("increment: " + a);
		
		b--;
		System.out.println("decrement: " + b);
		
		
		int abc = 50;
		float xyz = 5.5f;
		
		
		System.out.println("Addition: " + (abc+ xyz));
	}

}
