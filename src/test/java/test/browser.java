package test;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class browser {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.get("https://google.com");


		driver.navigate().to("https://www.saucedemo.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle()); 
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		String originalWindow = driver.getWindowHandle();
		driver.switchTo().window(originalWindow);
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(3000);

		driver.close();




	}

}
