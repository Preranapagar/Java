package Tutorial8;

public class Demo2 {

	public static void gradeClaculator(int grade) {

		if (grade >=0 && grade <= 55) {
			System.out.println("Grade is D");
		} 
		else if (grade > 55 && grade <= 65) {
			System.out.println("Grade is C");
		}
		else if(grade>65 && grade<=75) {
			System.out.println("Grade is B");
		}
		else if(grade>75) {
			System.out.println("Grade is A");
		}
		else {
			System.out.println("Invalid Marks");
		}

	}

	public static void main(String[] args) {
//		i) if marks is below 55 then print grade as D
//		ii) if marks is between 56 to 65 then print grade as C
//		iii) if marks is between 65 to 75 then print grade as B
//		iv) if marks is above 76 then print grade as A
		
		Demo2.gradeClaculator(0);
		Demo2.gradeClaculator(-2);
		Demo2.gradeClaculator(75);
		Demo2.gradeClaculator(65);

	}

}
