package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

	@Test
	 void OpenApp () {
		   
		WebDriver driver= new ChromeDriver();   
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.demo.guru99.com/v4");
		
	   }
	
	
	void Login() {	
	
		
		
	}
	
	
	
	
}
