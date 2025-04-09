package Demo;

import java.io.ObjectInputStream.GetField;
import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice_selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		
		
		 driver.get("https://v1.training-support.net/selenium/simple-form");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // globally wait
		
		 
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		driver.findElement(By.cssSelector("input[placeholder=\"First Name\"]")).sendKeys("Yogender");
			
		
     driver.findElement(By.cssSelector("input[id=\"lastName\"]")).sendKeys("raajendar");
		
		
		driver.findElement(By.cssSelector("input[id=\"email\"]")).sendKeys("gonkaryogender@gmail.com");
		
		driver.findElement(By.cssSelector("input[id=\'number\']")).sendKeys("6266232328");
		
		driver.findElement(By.cssSelector("input[class=\'ui green button\']")).click();
		
		
		

		
		
				

	}

}
