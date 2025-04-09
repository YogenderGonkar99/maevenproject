package maven.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class groupspriority {
	
	WebDriver driver;

	
	@BeforeMethod (alwaysRun = true)
	public void test1() {
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
	}
	@Test (priority = 1,groups = "smoke")
	public void searchmobile() {
		driver.findElement(By.cssSelector("[id=\"gh-ac\"]")).sendKeys("Iphone");
		
		driver.findElement(By.cssSelector("[class=\"gh-search-button__label\"]")).click();
		
		
	}
	@Test
	public void searchshoes() {
		
driver.findElement(By.cssSelector("[id=\"gh-ac\"]")).sendKeys("Shoes");
		
		driver.findElement(By.cssSelector("[class=\"gh-search-button__label\"]")).click();
		
		
	}
	@Test 
	public void powerbank() {
driver.findElement(By.cssSelector("[id=\"gh-ac\"]")).sendKeys("powerbank");
		
		driver.findElement(By.cssSelector("[class=\"gh-search-button__label\"]")).click();
		
	}
	@Test (priority = 2,groups = "smoke")
	public void jeans() {
driver.findElement(By.cssSelector("[id=\"gh-ac\"]")).sendKeys("Jeans");
		
		driver.findElement(By.cssSelector("[class=\"gh-search-button__label\"]")).click();
	}
	@AfterMethod (alwaysRun = true)
	public void close() {
		driver.close();
	}
}
