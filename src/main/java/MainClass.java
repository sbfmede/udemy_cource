import com.google.common.collect.Table;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class MainClass {

    public static void main(String [] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\otikhanov\\Apps\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();


        driver.get("https://www.ebay.com");
        WebElement link = driver.findElement(By.xpath("//div[@role='main']//li[@data-currenttabindex='0']/a[text()='Electronics']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(link).build().perform();

        driver.findElement(By.xpath("//a[text()='Apple']")).click();

        JavascriptExecutor jse = (JavascriptExecutor)driver;

        jse.executeScript("window.scrollBy(0, 10000)","");
        jse.executeScript("window.scrollBy(0, -10000)","");
        jse.executeScript("alert('Hello World!!');");



        //driver.quit();
         }
}
