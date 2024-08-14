package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class claimcreateonmgmt {

    WebDriver driver = new FirefoxDriver();

    @Test (priority = 0)
    public void login() throws IOException {

        driver.manage().window().maximize();
        driver.get("https://mgmtdfeuat.kbzms.com");
        WebElement username = driver.findElement(By.xpath("//input[@id='j_username']"));
        username.sendKeys("admin");
       File usernameSS = username.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(usernameSS, new File("./ScreenShot/username.jpg"));

        WebElement password = driver.findElement(By.xpath("//input[@id='j_password']"));
        password.sendKeys("bs123456");
        WebElement button = driver.findElement(By.xpath("//button[@id='login']"));
        button.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement mainmenu = driver.findElement(By.xpath("//span[normalize-space()='Claim']"));
        Actions action = new Actions(driver);
        action.moveToElement(mainmenu).perform();

        driver.findElement(By.xpath("//a[normalize-space()='Claim Management']")).click();
//        WebElement below = driver.findElement(with(By.tagName("Claim Management"))
//                .below(By.tagName("Claim")));
//        below.click();
//        WebElement menuone = driver.findElement(By.xpath("//span[normalize-space()='Claim']"));
//        menuone.

//        WebElement mainmenu = driver.findElement(By.xpath("//a[normalize-space()='Claim Management']"));
//        mainmenu.click();

//        WebElement title = driver.findElement(By.xpath("//h3[@class='caption']"));
//        String display = title.getText();
//        if(display.equals("Claim Management")){
//            System.out.println("It is Display");
//        }
//        else {
//            System.out.println("It is not Display");
//        }

    }


}
