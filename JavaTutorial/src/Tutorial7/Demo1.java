package Tutorial7;

public class Demo1 {

	public static void main(String[] args) {
		
		char a1 = 'p';
		char a2 = '1';
		char a3 = ' ';
		char a4 = 'T';
		
		
		System.out.println(Character.isLetter(a1));
		System.out.println(Character.isLetter(a2));
		System.out.println(Character.isLetter(a3));
		System.out.println(Character.isLetter(a4));
		
		char b1 = Character.valueOf(a1);
		
		System.out.println(b1);
		
		Character b2 = Character.valueOf(a2);
		
		System.out.println(b2);
		
		// Convert char into int, Java automatically return the ASCII number
		int b3 = a1;
		System.out.println(b3);
		
		String x1 = "1234";

		int y1 = Integer.parseInt(x1);
		int y2 = Integer.valueOf(x1);

		System.out.println(y1);
		System.out.println(y2);

	}

}
