package Tutorial5;

public class Demo8 {

	public static void main(String[] args) {

		String a = "Mumbai";

		int len = a.length();

		for (int i = len - 1; i >= 0; i--) {

			char j = a.charAt(i);
			System.out.println(j);
		}

	}

}
