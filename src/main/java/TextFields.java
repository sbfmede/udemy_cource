import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TextFields {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\otikhanov\\Apps\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://en.wikipedia.org");
        WebElement link = driver.findElement(By.xpath("//li[@id='n-aboutsite']/a"));
        System.out.println(link.getText());
        link.click();




       //driver.get("https://github.com");
       //driver.findElement(By.xpath("//div/button[@class='btn-mktg width-full width-sm-auto btn-primary-mktg']")).submit();
       //driver.findElement(By.xpath("//input[@name='user[email]']")).sendKeys("a.....@gmail.com");
       //driver.findElement(By.xpath("//button[@data-optimizely-event='click.signup_continue.email']")).submit();

        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();


        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //System.out.println("Mail is:"+ driver.findElement(By.xpath("//div/input[@id='email']")).getAttribute("value"));
        //driver.findElement(By.xpath("//div/button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).submit();

        //driver.quit();


    }
}
