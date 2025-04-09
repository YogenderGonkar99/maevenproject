package maven.maven;

import java.awt.Frame;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ifram_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://ui.vision/demo/webtest/frames/");
		  
		  driver.switchTo()
		  .frame(0);
		  
		  driver.findElement(By.cssSelector("[type=\"text\"]")).sendKeys("yogi");
		  
		  driver.switchTo().defaultContent();
		  
		  
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement frame2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[src=\"frame_2.html\"]")));

  
		  driver.switchTo().frame(frame2);
		  
		  driver.findElement(By.cssSelector("#id2 > div > input[type=text]")).sendKeys("chotu");
		  
		  
		  
		  
		
		
	}

}
