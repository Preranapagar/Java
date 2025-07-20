package javaproject;

public class Operatorsinjava {
	
	public static void main (String[] args) {
		
		System.out.println("Operators in Java :");
		System.out.println("**************************************************************************");
		/*
		 * there are 4 types operator in java
		 * 1) Arithemetic operator
		 * 2) Relational Operator
		 * 3) Assignment Operator
		 * 4) Logical Operator
		 */
		
		System.out.println("1) Arithmetic Operators");
		
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
		
		System.out.println("**************************************************************************");
		
		int abc = 50;
		float xyz = 5.5f;
		
		
		System.out.println("Addition: " + (abc+ xyz));
		
		System.out.println("**************************************************************************");
		
		System.out.println("2) Relational Operator");
		/*
		 * there are 6 types in Relational Operator
		 * i) equal to ==
		 * ii) not equal to !=
		 * iii) greater than >
		 * iv)  greater than and equal to >=
		 * v) less than <
		 * vi) less than and equal to <=
		 */
		
		int jep =100, mep=200;
		
		System.out.println(jep==mep);
		System.out.println(jep != mep);
		System.out.println(jep > mep);
		System.out.println(jep >= mep);
		System.out.println(jep < mep);
		System.out.println( jep <= mep);
		System.out.println("**************************************************************************");

		System.out.println("3) Assignment Operators");
		
		/*
		 * we can assign the values for variable
		 * i) assignment =
		 * ii) add and Assign +=
		 * iii) sub and Assign -=
		 * iv) div and assign /=
		 * v) mult and assign *=
		 * vi) module and assign %=
		 * 
		 */
		
		int p = 100;
		System.out.println(p);
		
		p=2000;
		System.out.println(p);
		
		
		System.out.println("Add and assign :");
		
		p += 2;
		System.out.println(p);
		
		p += 30;
		System.out.println(p);
		
		
		System.out.println("Sub and assign :");
		
		p -= 2;
		System.out.println(p);
		
		p -= 30;
		System.out.println(p);
		
		
		System.out.println("Div and assign :");
		
		p /= 2;
		System.out.println(p);
		
		p /= 30;
		System.out.println(p);
		
		System.out.println("Mult and assign :");
		
		p *= 2;
		System.out.println(p);
		
		p *= 30;
		System.out.println(p);
		
		System.out.println("Module and assign :");
		
		p %= 7;
		System.out.println(p);
		
		p %= 30;
		System.out.println(p);
		
		System.out.println("**************************************************************************");

		System.out.println("4) Logical Operators");
		
		/*
		 * there are 3 types Logical operators
		 * 1) and operator			&&  >>if both condition are true then and then only result is true.
		 * 2) or operator			||  >>if anyone condition is true then result is true
		 * 3) not operator			!	>>if condition is true, not operator mark the result is fals
		 * 								>>if condition is false, not operator mark the result is true
		 */
		
		System.out.println(true&&true);
		System.out.println(true&&false);//false
		System.out.println(false&&true);//false
		System.out.println(false&&false);//false
		
		
		System.out.println(true || true);	//true
		System.out.println(true || false);	//true
		System.out.println(false || true);	//true
		System.out.println(false || false);	//false

		System.out.println(!true);

		System.out.println(!false);

		
	}

}
