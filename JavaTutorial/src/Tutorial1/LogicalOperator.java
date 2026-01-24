package Tutorial1;

public class LogicalOperator {
	public static void main(String[]args) {
		
		boolean t= true;
		boolean f = false;
		
		System.out.println(t && f); //false
		System.out.println(t && t); //true
		System.out.println(f && f); //false
		System.out.println(f && t); //false
		
		System.out.println(t || t);// true
		System.out.println(t || f);//true
		System.out.println(f || t);//true
		System.out.println(f || f);//false
		
		System.out.println(!t);
		System.out.println(!f);
		
	}

}
