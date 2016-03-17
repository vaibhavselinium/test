package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Surgey {

	/**
	 * @param args
	 */
	private static WebElement element = null;
	 
    public static WebElement name(WebDriver driver){
 
         element = driver.findElement(By.name("customerName"));
 
         return element;
 
         }
 
     public static WebElement email(WebDriver driver){
 
         element = driver.findElement(By.name("customerEmail"));
 
         return element;
 
         }
     
     public static WebElement mobile(WebDriver driver){
    	 
         element = driver.findElement(By.name("customerMobile"));
 
         return element;
 
         }
     public static WebElement Surgery(WebDriver driver){
    	 
         element = driver.findElement(By.name("surgeryName"));
 
         return element;
 
         }
 
     public static WebElement submitt(WebDriver driver){
 
         element = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/form/div[2]/button"));
 
         return element;
 
         }

}
