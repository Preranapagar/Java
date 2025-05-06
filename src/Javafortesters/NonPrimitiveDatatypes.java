package Javafortesters;

public class NonPrimitiveDatatypes {
	
	public static void main (String[] args) {
		
		// Non Primitive Datatypes
		
		/*
		 * • string : - String is sequence of character written in double quote - String
		 * may have numbers, upper case character, lower case character and special
		 * character
		 */
		
			String a = "I am learning java";
			System.out.println("String :" + a);
			
		//String Methods
			
		/*
		 * 1. length() 
		 * - it is used to capture the length of string. 
		 * - return type of length() method is int.
		 */
			
			int len = a.length();
			System.out.println("Length :"+len);

		/*
		 * 2.toUpperCase()
		 * - it is used to convert the string into the upper case.
		 * - return type is String
		 */
			
			String upper = a.toUpperCase();
			System.out.println("Upper Case :"+upper);
			
		/*
		 * 3. toLowerCase()
		 * - it will convert String into lower case.
		 * - return type is String.
		*/
			
			String lower = a.toLowerCase();
			System.out.println("Lower Case :"+lower);
			
		/*
		 * 4. startsWith()
		 * - it is used to check specific string is starts with specific character or not?
		 * - return type is boolean (true/false).
		 */
			
			boolean ans = a.startsWith("I");
			System.out.println("Start with :"+ans);
			
		/*
		 * 5. endWith()
		 * - it will check specific string is ends with specific character or not 
		 * - return type is boolean
		 */
			
			boolean ans2 = a.endsWith("I");
			System.out.println("End with :"+ans2);
			
		/*
		 * 6. contains()
		 * - it will check specific string contains specific keyword is present or not in any locations of the String.
		 * - return type is boolean
		 */
			
			boolean ans3 = a.contains("java");
			System.out.println("Contains :"+ans3);
			
		/*
		 * 7. equals()
		 * -it used to compare the 2 different Object.
		 * -return type is boolean. 
		 * - it used to compare the ""actual content of the String/object". 
		 */
			
			String obj1 = "Java";
			String obj2 = "JAVA";
			
			boolean ans4 = obj1.equals(obj2);
			System.out.println("Equals :"+ans4);
			
		/*
		 * 8. equalsIgnoreCase()
		 * - it is compare the 2 different String and it will ignore upper case and lower case.
		 * - return type is boolean.
		 * - it used to compare the actual content of string and it will ignore upper case and lower case.
		 */

			String obj3 = "Java";
			String obj4 = "JAVA";
			
			boolean ans5 = obj3.equalsIgnoreCase(obj4);
			System.out.println("Equals Ignore Case :"+ans5);
			
		/*
		 * 9.== operator
		 * - it used to compare the different objects.
		 * - return type is boolean
		 * - this method is used to compare the """memory location of String/object.""".
		 */
		
		boolean op = obj1==obj2;
		 System.out.println("== Operator :" + op);
		 
		/*
		 * 10. concat()
		 * - it used to combine the 2 different string
		 * - return type is String
		 */
		 
		 String con = obj1.concat(obj4);
		 System.out.println("Concat :" + con);
		 
		/*
		 * 11. combine the string using + operator
		 * - we can combine any values using + operator
		 */
		 
		 String com = obj1+obj2;
		 System.out.println("Combine :"+com);
		 
		/*
		 * 12. charAt()
		 * - it used to capture the character as per the index position.
		 * - return type is char datatype.
		 */
		 
		 String b = "Pune";
		 char b2 = b.charAt(2);
		 System.out.println("Char at :"+b2);
		 
		 /*
		  * 13. trim() 
		  * - it used to remove space from the start and end of string.
		  * - return type is string.
		  */
		 
		 String str = "         bat        ";
		 String ak = str.trim();
		 System.out.println("Trim :" +ak);
		 
		 /*
		  * 14. replace()
		  * - it used to replace the String.
		  * - return type is string.
		  */
		 
		 String a1 = "Selenium Testing";
		 String a2 = a1.replace("Selenium", "Java");
		 System.out.println("Replace :"+a2);
		 
		 /*
		  * 15.  replaceAll() 
		  * -it used to replace the string
		  * -return type is string
		  */
		 
		 String b1 = "Selenium Testing, Selenium";
		 String b3 = b1.replaceAll("Selenium", "Java");
		 System.out.println("replace all :" + b3);
		 
		 /*
		  * 16. subString() method
		  * -  it return the string based on index position.
		  * - return type is string.
		  */
		 
		 String b4 = b1.substring(6);	
		 System.out.println("Substring :" + b4);
		 
		 /*
		  * 17. indexOf()
		  * - this method is used to find the first index of specific character.
		  * - return type int
		  */
		 
		 String z = "Selenium";
		 int z2 = z.indexOf("i");
		 System.out.println("Index of :" + z2);
		 
		 /*
		  * 18. lastIndexOf() 
		  * -  this method is used to find the last index of specific character.
		  * - return type int
		  */
		 
		 String sel1="selenium";
		 int k = sel1.lastIndexOf('e');
		 System.out.println("Last Index :"+k);
		 
		 /*
		  * 19.valueOf() 
		  * - it convert the any datatype values into the string.
		  * - return type is string
		  */
		 
		 int aks = 100;
		 String  bks = String.valueOf(aks);
		 System.out.println("valueOf :" + bks);
		 
		
		

		
	}

}
