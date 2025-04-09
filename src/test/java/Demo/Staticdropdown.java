package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
//       WebElement drpdwn = driver.findElement(By.id("dropdown-class-example"));
//	
//	Select se=  new Select(drpdwn);  
//	
//	se.selectByIndex(3);
	
	
//	 WebElement abc  = driver.findElement(By.id("dropdown-class-example"));
//	 
//	 Select sce = new Select(abc);
//	 
//	 sce.selectByIndex(2);

	
	    WebElement sss = driver.findElement(By.cssSelector("[autocomplete]"));
	    Thread.sleep(2000); 
	       
	    sss.sendKeys("india");
	    Thread.sleep(2000);
	    sss.sendKeys(Keys.ARROW_DOWN);
	    Thread.sleep(2000);
	    sss.sendKeys(Keys.ENTER);
	   
	    
	    
	   
	    
	   
	 
	   
	    
	   

	}

}
