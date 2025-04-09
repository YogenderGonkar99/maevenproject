package Demo;

import org.apache.commons.compress.harmony.pack200.NewAttribute;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class Dragg_Drop3 {
	
	WebDriver driver;
	
	WebElement source ;
	 WebElement drop; 
	 WebElement AA ;
	 WebElement BB ;
	 WebElement CC;
	 WebElement DD;

	@BeforeTest
	public void setup() {
		
		  driver = new EdgeDriver();
		 
	 	 driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");

		
	}
	
		// TODO Auto-generated method stub
      
	@Test
	public void dragdrop() {
	 WebElement source = driver.findElement(By.id("box5"));
	 WebElement drop = driver.findElement(By.id("box106"));
	 WebElement AA = driver.findElement(By.id("box6"));
	 WebElement BB = driver.findElement(By.id("box107"));
	 WebElement CC = driver.findElement(By.id("box1"));
	 WebElement DD = driver.findElement(By.id("box104"));
	 
	
	 
	 
	 
	 Actions Abc = new Actions(driver);
	 Abc.dragAndDrop(source, drop).perform();
	 Abc.dragAndDrop(AA, BB).perform();
	 Abc.dragAndDrop(CC, DD).perform();
	}
	
	 @AfterTest
	 public void teardown() {
		 driver.quit();
		 
	 }
	
		
	}


