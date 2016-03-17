package AutomationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.Book;

public class BookTest {

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
	 
	      Book.BookApp(driver).click();
	     
	      Book.Service(driver).sendKeys("Dentistry");
	 
	      Book.Hospital(driver).sendKeys("Dental Care");
	     
	      Book.doctor(driver).sendKeys("Dr.Rupa");
	     
	      Book.next(driver).click();
	 
	     System.out.println("Booked Successfully.");
	 
	    
	     driver.quit();

	}

}
