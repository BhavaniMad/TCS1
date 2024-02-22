package Pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class ManagersPage {

	WebDriver driver;
	
	public ManagersPage (WebDriver driver) {
		 this.driver=driver;
	 }
	
	By NC =By.linkText("NewCustomer");
	By Edit=By.linkText("Edit Customer");
	
	
	void NewCustomer() {
	   driver.findElement(NC).click();
	   driver.navigate().refresh();
	   driver.findElement(NC).click();
	   
	}
	void EditCustomer() {
		driver.findElement(Edit).click();
		driver.navigate().refresh();
		driver.findElement(Edit).click();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
						