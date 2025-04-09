package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload_file {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		 WebDriver driver = new ChromeDriver();
//		 
//		 driver.get("https://practice.expandtesting.com/upload");
//		 
//		WebElement uplodefile = driver.findElement(By.id("fileInput"));
//		uplodefile.sendKeys("C:\\Users\\gonka\\OneDrive\\Desktop\\Yogi123.txt");
//		
//		driver.findElement(By.id("fileSubmit")).click();
//		
//		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/upload");
		
		 WebElement upload = driver.findElement(By.id("fileInput"));
		 
      upload.sendKeys("C:\\Users\\gonka\\OneDrive\\Desktop\\Yogi123.txt");
      
      driver.findElement(By.id("fileSubmit")).click();
		
		
	}

}
