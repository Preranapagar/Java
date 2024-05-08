package StringTutorials;

public class SpaceRemoval {

	public static void main(String[] args) {
		// remove two or more spaces between words
		
		String a = "Selenium     Testing";
		String answ = a.replaceAll("\\s+", " ");
		System.out.println(answ);

	}

}
