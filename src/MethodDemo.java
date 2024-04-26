
public class MethodDemo {

	public static void main(String[] args) {
		
		//creating object
		MethodDemo md = new MethodDemo();
		md.doLogin();
		md.doLogout();
		
		System.out.println(md.addNumbers(5, 6));
		
		md.subNumbers(5, 3);
		
		md.diffParameters(9, "I am String", 9);
	}
	
	public void doLogin()
	{//start
		//login code
		System.out.println("Login Successfull");
	}//end
	
	public void doLogout()
	{
		System.out.println("Logout Successfull");
	}
	
	public int addNumbers(int x, int y) {
		
		int z = x + y;
		return z;
	}

	public void subNumbers(int x, int y) {
		int z = x - y;
		System.out.println(z);
	}
	
	public void diffParameters(int i, String s, float f) {
		
		System.out.println("First Parameter :"+ i);
		System.out.println("Second Parameter :" + s);
		System.out.println("Third Parameter :" + f);
	}
}
