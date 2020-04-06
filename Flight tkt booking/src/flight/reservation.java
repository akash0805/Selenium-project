package flight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class reservation 
{
   public static void main(String[] args) 
    {  
	      
		 System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://newtours.demoaut.com/");
	     driver.findElement(By.name("userName")).sendKeys("mercury");
	     driver.findElement(By.name("password")).sendKeys("mercury");
	     driver.findElement(By.name("login")).click();
	     Select Departingfrom = new Select(driver.findElement(By.name("fromPort")));
	     Departingfrom.selectByVisibleText("London");
	     Select ArrivingIn = new Select(driver.findElement(By.name("toPort")));
	     ArrivingIn.selectByVisibleText("New York");
	     driver.findElement(By.cssSelector("input[value='Business']")).click();
	     driver.findElement(By.name("findFlights")).click();
	     driver.quit();
	     
    }
   
}
	        
	       
	     
	        
	        
		  
		 
		  
		 




