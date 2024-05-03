
public class IfElseConditions {

	public static void main(String[] args) {
		// If age is 0 to 10 then 'Child'
		// If age is between 11 to 18 then 'teen'
		// If age is between 19 to 60 then 'adult'
		// If age is above 61 then 'senior'
		
		int age = -11;
		
		if((age>=0)&&(age<=10))
		{
			System.out.println("Child");
		}
		else if ((age>10)&&(age<=18))
		{
			System.out.println("Teen");
		}
		else if ((age>18)&&(age<=60))
		{
			System.out.println("Adult");
		}
		else if (age>60)
		{
			System.out.println("Senior");
		}
		else
		{
			System.out.println("Please enter proper age");
		}

	}

}
