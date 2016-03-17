package PageObjects;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search {

	/**
	 * @param args
	 */
	private static WebElement element = null;
	 
    public static WebElement location(WebDriver driver){
 
         element = driver.findElement(By.id("geoaddress"));
 
         return element;
 
         }
 
     public static WebElement service(WebDriver driver){
 
         element = driver.findElement(By.id("servicebox"));
 
         return element;
 
         }
 
     public static WebElement searchbtn(WebDriver driver){
 
         element = driver.findElement(By.id("offerpickup"));
 
         return element;
 
         }

}
