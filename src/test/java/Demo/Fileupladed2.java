package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupladed2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
	WebDriver driver = new ChromeDriver();
//		
	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
	
	
		 WebElement sou = driver.findElement(By.cssSelector("[class=\"form-control\"]"));
		 sou.sendKeys("C:\\Users\\gonka\\OneDrive\\Desktop\\Yogi123.txt");
	 
	 driver.findElement(By.id("fileSubmit")).click();
	 
	 driver.close();
		
		
		
		
		
	}

}
