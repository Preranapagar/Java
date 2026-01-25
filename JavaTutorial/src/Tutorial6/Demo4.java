package Tutorial6;

import java.util.Arrays;

public class Demo4 {
	public static void main(String[]args) {
		
//		String a = "Selenium";
//		
//		//length
//		
//		int len = a.length();
//		System.out.println(len);
//		
//		//toUpperCase
//		String uc = a.toUpperCase();
//		System.out.println(uc);
//		
//		//toLowerCase
//		String lc = a.toLowerCase();
//		System.out.println(lc);
//		
//		//stratsWith
//		
//		boolean sw = a.startsWith("S");
//		System.out.println(sw);
//		
//		boolean sw2 = a.startsWith("a");
//		System.out.println(sw2);
//		
//		//endWith
//		
//		boolean ew = a.endsWith("m");
//		System.out.println(ew);
//		
//		boolean ew2 = a.endsWith("a");
//		System.out.println(ew2);
//		
//		//contains
//		
//		boolean c1 = a.contains("um");
//		System.out.println(c1);
//		
//		boolean c2 = a.contains("java");
//		System.out.println(c2);//false
//		
//		//equals
//		
//		String x = "Selenium";
//		String y = "Java";
//		String z = "Java";
//		
//		boolean eq = x.equals(y);
//		System.out.println(eq);
//		
//		boolean eq2 = y.equals(z);
//		System.out.println(eq2);
//		
//		//equalsIgnoreCase
//		
//		String x1 = "Selenium";
//		String x2 = "SELENIUM";
//		
//		boolean eic = x1.equalsIgnoreCase(x2);
//		System.out.println(eic);
//		
//		// == operator
//		
//		System.out.println(x1==x2);
//		System.out.println(x==x1);
//		
//		//concat
//		
//		String s1 = "Java";
//		String s2 = "Programming";
//		
//		String con = s1.concat(s2);
//		System.out.println(con);
//		
//		//combine strings using + operator
//		
//		System.out.println(s1 + s2);
//		
//		//charAt
//		String city = "Pune";
//		char b = city.charAt(2);
//		
//		System.out.println(b);
//		
//		//trim
//		String city2 = "      Nashik     ";
//		String citytrim = city2.trim();
//		
//		System.out.println(citytrim);
//		
//		//replace
//		
//		String r1 = "Selenium Testing";
//		String r2 = r1.replace("Selenium", "Java");
//		System.out.println(r2);
//		
//		//replaceAll
//		
//		String r3 = "Selenium testing Selenium";
//		String r4 = r3.replaceAll("Selenium","Cucumber");
//		
//		System.out.println(r4);
//		
//		//substring method
//		
//	String sb = r3.substring(4);
//		System.out.println(sb);
//		
//		String sb2 = r3.substring(4,7);
//		System.out.println(sb2);
		
		//isEmpthy
		
		String a = "Selenium";
		
		boolean em = a.isEmpty();
		System.out.println(em);
		
		String b = "";
		boolean em2 = b.isEmpty();
		System.out.println(em2);
		
		//isBlank
		
		boolean bk = a.isBlank();
		System.out.println(bk);
		
		boolean bk2 = b.isBlank();
		System.out.println(bk2);
		
		String c ="  ";
		
		System.out.println(c.isEmpty());
		System.out.println(c.isBlank());
		
		//split method
		
		String a1 = "Java for Tetsing";
		String[] a2 = a1.split(" ");
		
		System.out.println(Arrays.toString(a2));
		
		//tochararray
		
		String a3 = "Selenium";
		char[] a4 = a3.toCharArray();
		
		System.out.println(Arrays.toString(a4));
		
		
	}

}
