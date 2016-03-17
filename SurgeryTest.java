package AutomationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SurgeryTest {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		driver = new FirefoxDriver();
		 
	     driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	 
	     driver.get("https://pstakecare.com");
	}

}
