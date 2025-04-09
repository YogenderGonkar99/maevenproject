package Demo;

import org.apache.commons.compress.harmony.pack200.NewAttribute;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class Dragg_Drop {

	private static final WebDriverBrowser Chrome = null;

	public static void main(String[] args) throws InterruptedException {
		

WebDriver driver = new ChromeDriver();
	
	driver.get("https://practice.expandtesting.com/drag-and-drop");
	
	     WebElement socurce = driver.findElement(By.xpath("(//div[@draggable=\"true\"][1])"));
   WebElement got = driver.findElement(By.id("column-b"));
   
   Actions Yogi = new Actions (driver);
   Yogi.dragAndDrop(socurce, got).perform();
	   
		
		
		
	
	
		
	}

}
