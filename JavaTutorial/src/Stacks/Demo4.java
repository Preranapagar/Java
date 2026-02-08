package Stacks;

import java.util.Stack;

public class Demo4 {

	public static void main(String[] args) {

		String a = "[{(}]";

		char[] arr = a.toCharArray();

		Stack<Character> s = new Stack<Character>();

		boolean result = true;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == '[' || arr[i] == '{' || arr[i] == '(') {

				s.push(arr[i]);
			}
			else if(arr[i]==']' || arr[i]=='}'|| arr[i]==')') {
				char value = s.pop();
				
				if((value == '[' && arr[i] !=']')||(value == '{' && arr[i] != '}')||(value == '(' && arr[i]!=')')) {
					result = false;
				}
			}
		}
		
		if (result) {
			System.out.println("Paranthesis is balance");
		}
		else {
			System.out.println("Parathesis is not balance");
		}
	}

}
