package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class TestRelativeLocators {
    public static void main(String[] args)  {


        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));



        WebElement above = driver.findElement(with(By.tagName("input")).above(By.tagName("select")));
        above.sendKeys("trainer@way2automation.com");

        WebElement below = driver.findElement(with(By.tagName("input")).below(By.tagName("select")));
        below.sendKeys("New Delhi");



        //WebElement near = driver.findElement(RelativeLocator.with(By.partialLinkText("THE")).near(By.linkText("Signin")));
        //near.click();


        WebElement rightOf = driver.findElement(with(By.xpath("//input[@type='password']")).toRightOf(By.tagName("label")));
        rightOf.sendKeys("asfddsfsf");


        WebElement leftOf = driver.findElement(with(By.linkText("Signin")).toLeftOf(By.xpath("(//*[@id=\"load_form\"]/div[1]/div[2]/input)[2]")));

        leftOf.click();
        driver.findElement(with(By.tagName("input"))
                        .above(By.linkText("Signin"))
                        .below(By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input")))
                .sendKeys("ksdfksfdsdf");

        List<WebElement> labels = driver.findElements(with(By.tagName("label")).below(By.xpath("//*[@id=\"load_form\"]/h3")));


        for(WebElement label: labels) {

            System.out.println(label.getText());
        }






    }


}
