package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class logintest {

    WebDriver driver = new FirefoxDriver();

    @Test(priority = 0)
    public void logintestvalidation(){
        driver.manage().window().maximize();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
                        .pollingEvery(Duration.ofSeconds(5))
                                .ignoring(NoSuchElementException.class);
        driver.get("https://kaceuat.kbzms.com/auth/login?redirectTo=%2F");
        WebElement name = driver.findElement(By.cssSelector("input[placeholder='User ID']"));
        name.sendKeys("kaungsuv");
        driver.findElement(By.xpath("//input[@id='password-field']")).sendKeys("kaungsuv");
//        wait.until(ExpectedConditions.elementToBeClickable())
        wait.until(ExpectedConditions.elementToBeClickable(By.id("kt_login_signin_submit"))).click();
//        driver.findElement(By.id("kt_login_signin_submit")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement claimmenu = driver.findElement(By.className("menu-arrow"));
        claimmenu.click();

        WebElement listmenu = driver.findElement(By.xpath("//span[normalize-space()='Claim List']"));
        listmenu.click();

        WebElement editbutton = driver.findElement(By.xpath("//app-claim-list-item[1]//div[1]//div[2]//section[1]//div[2]//img[1]"));
        editbutton.click();


        Actions actions = new Actions(driver);
        actions.scrollToElement(driver.findElement(By.xpath("//div[@class='card-header']//h3[@class='card-label left-border-image'][normalize-space()='Accident Information']")));



    }

//    @Test(priority = 1)
//    public void KaceClaim(){
//
//
//    }

}
