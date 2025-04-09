package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fram_selenium {
    WebDriver driver
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 WebDriver driver = new ChromeDriver();
		
	driver.get("https://v1.training-support.net/selenium/iframes");
		
	WebElement frame1 = driver.findElement(By.cssSelector("/selenium/frame1"));
	
	
	driver.switchTo().frame(frame1);
		
	driver.findElement(By.id("actionButton")).click();
				driver.switchTo().defaultContent();	

	WebElement frame = driver.findElement(By.xpath("//iframe[@id=\"courses-iframe\"]"));
	
	driver.switchTo().frame(frame);
	
	
	driver.findElement(By.xpath("(//a[@href=\"practice-project\"])[1]")).click();
	
	driver.switchTo().defaultContent();
}

}
