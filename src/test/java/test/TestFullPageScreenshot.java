package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TestFullPageScreenshot {

    @Test
    public void testss() throws IOException {
    WebDriverManager.firefoxdriver().setup();
    WebDriver driver = new FirefoxDriver();
		driver.get("https://way2automation.com");
		driver.manage().window().maximize();

		if(driver instanceof FirefoxDriver) {

        //Full Page
        File fullPage = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(fullPage, new File("./screenshot/fullpage.jpg"));


    }else if(driver instanceof ChromeDriver) {


        File pageScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(pageScreenshot, new File("./screenshot/page.jpg"));


    }








}
}
