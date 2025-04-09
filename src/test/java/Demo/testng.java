package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testng {
	
	WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	
	public void setup() {
		 driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
	
	}
	@Test(priority = 2,groups = "Smoke")
public void  LOGIN()  {
		 
		driver.findElement(By.cssSelector("[type=\"text\"]")).sendKeys("tomsmith");	
		
		
	}
	@Test(priority = 1,groups = "Smoke")
	public void password() {
		
		
		driver.findElement(By.cssSelector("[type=\"password\"]")).sendKeys("SuperSecretPassword!");
	}
	
	@Test(priority = 3,groups ="muskan")
	
	public void click() {
		
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		
	}
	
	@AfterMethod(alwaysRun = true)
	
	public void teardpoown() {
		driver.quit();
		
		
	}

}
