package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2_selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		// driver.findElement(By.cssSelector("[aria-expanded=\"true\"]")).click();
		
		
		  driver.findElement(By.cssSelector("[class=\"btn btn-danger\"]")).click();
		  
		Alert ele = driver.switchTo().alert();
		
		String text = ele.getText();
		
		System.out.println(text);
		
		ele.accept();

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		driver.findElement(By.cssSelector("[onclick=\"confirmbox()\"]")).click();
		
		
Alert eles = driver.switchTo().alert();
		
		String texts = ele.getText();
		
		System.out.println(texts);
		
		eles.accept();

		
		// driver.quit();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[3]")).click();
		driver.findElement(By.cssSelector("[onclick=\"promptbox()\"]")).click();
		
		Alert abc = driver.switchTo().alert();
		abc.sendKeys("yogi love muskan");
		 abc.accept();
		
		
		
	}

}
