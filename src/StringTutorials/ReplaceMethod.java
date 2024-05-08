package StringTutorials;

public class ReplaceMethod {

	public static void main(String[] args) {
		// use to replace string
		
		String a = "Selenium testing Selenium";
		
		String answ = a.replace("Selenium", "Cucumber");
		System.out.println(answ);
		
		String answ2 = a.replaceAll("Selenium", "Cucumber");
		System.out.println(answ2);

	}

}
