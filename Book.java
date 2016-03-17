package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Book {

	private static WebElement element = null;
	 
	    public static WebElement BookApp(WebDriver driver){
		 
        element = driver.findElement(By.id("bookAppointment"));

        return element;

        }
        public static WebElement Service(WebDriver driver){
 
         element = driver.findElement(By.id("servicebox"));
 
         return element;
 
         }
 
         public static WebElement Hospital(WebDriver driver){
 
         element = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div[2]/input"));
 
         return element;
 
         }
     
         public static WebElement doctor(WebDriver driver){
    	 
         element = driver.findElement(By.id("appointDoc"));
 
         return element;
 
         }
         public static WebElement next(WebDriver driver){
 
         element = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div[5]/button"));
 
         return element;
 
         }

}
