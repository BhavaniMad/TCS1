package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {

	public static void main(String[] args) throws IOException {
		
	WebDriver driver =new ChromeDriver();	
		
	driver.get("https://demo.guru99.com/v4");
	
	
	/*//CompleteScreen
	TakesScreenshot TS=(TakesScreenshot)driver;
	
	File LoginPage= TS.getScreenshotAs(OutputType.FILE);
		
	File LoginTrg= new File("C:\\Users\\janardhan\\eclipse-workspace\\TCS1\\ScreenShots\\Login.png");	
		
	FileUtils.copyFile(LoginPage, LoginTrg);	*/

	//Element
	
	WebElement guru99=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/table/tbody/tr"));
	
	File guru=guru99.getScreenshotAs(OutputType.FILE);
	
	File GuruTrg= new File("C:\\Users\\janardhan\\eclipse-workspace\\TCS1\\ScreenShots\\4ikons.png");
	
	FileUtils.copyFile(guru, GuruTrg);
	}

}
