package AutomationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.Search;

public class SearchTest {

	/**
	 * @param args
	 */
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new FirefoxDriver();
		 
	     driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	 
	     driver.get("https://pstakecare.com");
	 
	     // Use page Object library now
	 
	     
	     Search.location(driver).sendKeys("santacruz");
	 
	     Search.service(driver).sendKeys("dentistry");
	 
	     Search.searchbtn(driver).click();
	 
	     System.out.println(" Result shown Successfully.");
	 
	    
	     driver.quit();
	}

}
