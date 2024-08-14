package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class assignment1 {

    @Test
    public static void assignmenttest(){



        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");
        driver.findElement(By.id("APjFqb")).sendKeys("way2automation");
        WebElement element = driver.findElement(By.id("APjFqb"));
        element.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



        WebElement block = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div"));

        List<WebElement> links = block.findElements(By.tagName("a"));
        links.get(0).click();
        System.out.println("----Printing links----");

        System.out.println("Total links are: "+links.size());





    }
}
