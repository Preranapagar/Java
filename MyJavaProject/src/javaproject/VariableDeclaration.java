package javaproject;

public class VariableDeclaration {
	public static void main(String[] args) {
		
		/*
		 * Variable name declaration rules
		 * abc -- valid
		 * ABC -- valid
		 * _abc -- valid
		 * _ABC -- valid
		 * $abc -- valid
		 * $ABC -- valid
		 * abcXYZ -- valid
		 * abc123 -- valid
		 * 123abc -- invalid >> syntax error
		 * @abc -- invlaid >> syntax error
		 * 
		 */
		
		int abc = 10;
		int ABC = 20;
		int _abc = 30;
		int _ABC = 40;
		int $abc = 50;
		int $ABC = 60;
		int abcXYZ = 70;
		int abc123 = 80;
		//int 123abc = 90; //syntax error
		//int @abc = 100; //syntax error
		
		System.out.println(abc);
		
		//can we declare multiple variables in same line with same datatypes? yes
		
		int a=10,b=20,c=30;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		char k='K',l='L',z='Z';
		
		System.out.println(k);
		System.out.println(l);
		System.out.println(z);
		
		//can we declare multiple variables in same line with different datatypes? No
		
		//int d=40, e =10.2, h='a'; // syntax error
		
	}

}
