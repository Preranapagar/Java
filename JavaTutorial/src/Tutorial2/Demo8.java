package Tutorial2;

public class Demo8 {

	public static void main(String[] args) {
		// i) if age is between 0 to 11 then print customer is child
		//ii) if age is between 12 to 17 the print customer is teen
		//iii) if age is between 19 to 64 then print customer is adult 
		//iv) if age is above 65+ then print customer is senior 

		int age = 0;
		
		if (age>=0 && age<=11)
		{
			System.out.println("Customer is child");
		}
		else if(age<=17)
		{
			System.out.println("Customer is teen");
		}
		else if(age<=64)
		{
			System.out.println("Customer is adult");
		}
		else
		{
			System.out.println("Cutsomer is senior");
		}


	}

}
