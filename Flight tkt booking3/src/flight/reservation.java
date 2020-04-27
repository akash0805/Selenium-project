package flight;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;




public class reservation 
{
	
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://newtours.demoaut.com/");
		 driver.manage().window().maximize();
		 String titleText=driver.getTitle();
		 String title="Welcome: Mercury Tours";
		 if(titleText.equals(title))
		  System.out.println("Webpage contains 'Welcome: Mercury Tours'");
		 else
		  System.out.println("Webpage doesn't contains 'Welcome: Mercury Tours'");
		 WebElement date=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b"));
		 if(date.isDisplayed())
			 System.out.println("Webpage contains today's date");
		 else
			 System.out.println("Webpage doesn't contains today's date");
	     driver.findElement(By.name("userName")).sendKeys("mercury");
	     driver.findElement(By.name("password")).sendKeys("mercury");
	     driver.findElement(By.name("login")).click();
	     WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img")));
	     WebElement finder=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img"));
	     if(finder.isDisplayed())
			  System.out.println("Webpage contains 'Flight Finder'");
	     else
			  System.out.println("Webpage doesn't contains 'Flight Finder'");
	     Select Departingfrom = new Select(driver.findElement(By.name("fromPort")));
	     Departingfrom.selectByVisibleText("London");
	     Select ArrivingIn = new Select(driver.findElement(By.name("toPort")));
	     ArrivingIn.selectByVisibleText("New York");
	     driver.findElement(By.cssSelector("input[value='Business']")).click();
	     driver.findElement(By.name("findFlights")).click();
	     Wait wait1=new FluentWait(driver)
	     .withTimeout(Duration.ofSeconds(30))
	     .pollingEvery(Duration.ofSeconds(5))
	     .ignoring(NoSuchElementException.class);
	     WebElement select=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img"));
	     if(select.isEnabled())
			  System.out.println("Webpage contains 'Select Flight'");
		 else
			  System.out.println("Webpage doesn't contains 'Select Flight'");
	     driver.findElement(By.name("reserveFlights")).click();
	     driver.findElement(By.name("passFirst0")).sendKeys("John");
	     driver.findElement(By.name("passLast0")).sendKeys("Peter");
	     driver.findElement(By.name("creditnumber")).sendKeys("123456");
	     driver.findElement(By.name("buyFlights")).click();
	     

		
	}

}
