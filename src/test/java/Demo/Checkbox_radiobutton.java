package Demo;

import java.util.List;

import org.apache.commons.compress.harmony.pack200.NewAttribute;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class Checkbox_radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
	//	WebDriver driver = new ChromeDriver();// initialize the webdriver.
		
         //  driver.get("https://rahulshettyacademy.com/AutomationPractice/"); // visit the website
  
    //  List<WebElement> yogi = driver.findElements(By.cssSelector("[type=\"checkbox\"]")); // 
         
//         Thread.sleep(4000);;
//		for (WebElement ch : checkbox) {
//			if(!ch.isSelected()) {
//				ch.click();
//         }
        
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> functions = driver.findElements(By.cssSelector("[type=\"checkbox\"]"));
		
		for (WebElement ky : functions) {
			if (!ky.isSelected()) {
				ky.click();
			}
		}
		
		
		
		
		
        	 }
         
     
         }
	
	

     
		
	
		
