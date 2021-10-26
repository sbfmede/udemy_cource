import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DropDownList {

    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\otikhanov\\Apps\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com/");
        driver.findElement(By.xpath("//div//a[@class='_yb_5q38n']")).click();
        driver.findElement(By.xpath("//p//a[@id='createacc']")).click();
        driver.findElement(By.xpath("//div//select[@id='usernamereg-month']")).click();
        driver.findElement(By.xpath("//div//select[@id='usernamereg-month']//option[text()='May']")).click();
        driver.findElement(By.xpath("//div//button[@id='reg-submit-button']")).click();



    }

}
