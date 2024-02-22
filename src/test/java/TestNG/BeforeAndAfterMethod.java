package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethod {

	 @BeforeClass 
	void OpenApp() {
		System.out.println("OpenApp");
	}
	@Test
	void Login() {
		System.out.println("Login");
	}
	@Test
	void search() {
		System.out.println("Seach i phone");
	}
	@AfterClass
	void CloseApp() {
		System.out.println("closeApp");
	}
	

	
	
	
	
	
	
	
	
	
}
