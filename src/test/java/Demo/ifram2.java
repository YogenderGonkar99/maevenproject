package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ifram2 {
	public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Frames.html");
	
	 WebElement fram1 = driver.findElement(By.name("[name=\"SingleFrame\"]"));
	
//	driver.switchTo().frame(0);
//	driver.findElement(By.cssSelector("text")).click();
//	driver.switchTo().defaultContent();
	
	
	
}
}


