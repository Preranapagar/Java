package Tutorial1;

public class LogicalOperator {
	public static void main(String[]args) {
		
		boolean t= true;
		boolean f = false;
		boolean t1 = true;
		boolean f1 = false;
		
		System.out.println(t && f); //false
		System.out.println(t && t1); //true
		System.out.println(f && f1); //false
		System.out.println(f && t); //false
		
		System.out.println(t || t1);// true
		System.out.println(t || f);//true
		System.out.println(f || t);//true
		System.out.println(f || f1);//false
		
		System.out.println(!t);
		System.out.println(!f);
		
	}

}
