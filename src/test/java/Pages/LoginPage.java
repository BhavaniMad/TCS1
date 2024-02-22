package Pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
    	this.driver=driver;
    }
    	
	
	
	
	By UserID=By.name("uid");
	By Uword=By.name("password");
	By Submit=By.name("btnLogin");
	
	
	
	public void LoginDetails() {
	driver.findElement(UserID).sendKeys("mngr549185");	
	driver.findElement(Uword).sendKeys("UzehYbY");	
	driver.findElement(Submit).click();	
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
