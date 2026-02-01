package Tutorial4;

import io.restassured.RestAssured;

public class StudentApi {
	
	public static void main(String[]args) {
		
		RestAssured.baseURI = "http://localhost:3000";
		
		RestAssured.basePath = "/students";
		
	}

}
