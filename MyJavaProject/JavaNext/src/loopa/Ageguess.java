package loopa;

public class Ageguess {
	public static void main(String[] args) {
		
		/*
		 * if age is between 1 to 11 then print child keyword 
		 * if age is between 12 to 17 then print teen keyword
		 * if age is between 18 to 64 then print adult keyword
		 * if age is above 64 then print senior keyword
		 */
		
		int age = 0;
		
		if ((age >= 1) && (age <= 11))
		{
			System.out.println("Child");
		}
		else if ((age > 11) && (age <= 17))
		{
			System.out.println("Teen");
		}
		else if ((age > 17) && ( age <= 64))
		{
			System.out.println("Adult");
		}
		else if ( age > 64)
		{
			System.out.println("Senior");
		}
		else
		{
			System.out.println("Enter valid age");
		}
	}

}
