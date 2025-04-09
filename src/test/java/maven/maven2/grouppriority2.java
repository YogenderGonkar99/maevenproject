package maven.maven2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class grouppriority2 {

	WebDriver driver;
	
	@BeforeMethod (alwaysRun = true)
	public void test1() {
		driver.get("https://www.flipkart.com/");
		
	}
	@Test
	public void cloth() {
		driver.findElement(By.cssSelector("[placeholder=\"Search for Products, Brands and More\"]")).sendKeys("tshirt");
		driver.findElement(By.cssSelector("[viewBox=\"0 0 17 18\"]")).click();
		
		
	}
	@Test (priority = 2, groups = "yogi")
	public void watchs() {
		driver.findElement(By.cssSelector("[placeholder=\"Search for Products, Brands and More\"]")).sendKeys("Rado");
		driver.findElement(By.cssSelector("[viewBox=\"0 0 17 18\"]")).click();
	
	}
  @Test (priority = 1, groups = "yogi")
  public void crocs() {
	  driver.findElement(By.cssSelector("[placeholder=\"Search for Products, Brands and More\"]")).sendKeys("Croce");
		driver.findElement(By.cssSelector("[viewBox=\"0 0 17 18\"]")).click();
	
  }
  @AfterMethod (alwaysRun = true)
  public void close() {
	  driver.close();
  }
}
