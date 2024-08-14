package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elements {
	

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
//		WebElement Searchbox = driver.findElement(By.name("q"));
//		
//		Searchbox.sendKeys("AuomationStepbyStep",Keys.ENTER);
		
		WebElement loginButton = driver.findElement(By.name("btnK"));

		
		WebElement SearchBox = driver.findElement(RelativeLocator.with(By.tagName("input")).above(loginButton));
		SearchBox.sendKeys("kaung");
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}

}
