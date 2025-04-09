package maven.maven;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

public class testng {
    
  @org.testng.annotations.Test
  
	public void setup() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://v1.training-support.net/selenium/iframes"); // { IFram}
//		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//		WebElement iframe = driver.findElement(By.cssSelector("[id=\"courses-iframe\"]"));
//		driver.switchTo().frame(0);
//
//		driver.findElement(By.cssSelector("[onclick=\"action()\"]")).click();
//		driver.switchTo().defaultContent();
//		driver.switchTo().frame(1);
//
//		driver.findElement(By.cssSelector("[onclick=\"action()\"]")).click();
//
//		driver.switchTo().defaultContent();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://v1.training-support.net/selenium/iframes");
	  
	  WebElement source = driver.findElement(By.cssSelector("[class=\"activity content\"]"));
	  
	  driver.switchTo().frame(0);
	  
	  driver.findElement(By.id("actionButton")).click();
	  driver.switchTo().defaultContent();
    
}
  
  
   
	   
	  
  }

