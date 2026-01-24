package Tutorial2;

public class Demo6 {
	public static void main(String[]args) {
//		i) if marks is below 25 then display grade as F
//		ii) if marks is between 26 to 45 then display grade as E
//		iii) if marks is between 46 to 55 then display grade as D
//		iv) if marks is between 56 to 65 then display grade as C
//		v) if marks is between 65 to 75 then display grade as B
//		vi) if marks is above 76 then display grade as A
		
		int marks = 46;
		
		if(marks <= 25)
		{
			System.out.println("Grade F");
		}
		else if(marks>25 && marks <=45)
		{
			System.out.println("Grade E");
		}
		else if(marks>45 && marks<=55)
		{
			System.out.println("Grade D");
		}
		else if(marks > 55 && marks<=65)
		{
			System.out.println("Grade C");
		}
		else if(marks >65 && marks <=75)
		{
			System.out.println("Grade B");
		}
		else
		{
			System.out.println("Grade A");
		}
	}

}
