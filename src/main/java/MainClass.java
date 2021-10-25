import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MainClass {

    public static void main(String [] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\otikhanov\\Apps\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        driver.get("https://en.wikipedia.org/wiki/Main_Page");

        driver.findElement(By.xpath("//div/input[@id=\"searchButton\"]")).click();

        driver.get("https://github.com/");

        WebElement button = driver.findElement(By.xpath("//div/button[@class=\"btn-mktg width-full width-sm-auto btn-primary-mktg\"]"));
        if (button.getText().equals("Sign up for GitHub")) {
            System.out.println("Success!");
        }
        else System.out.println("Fail!");


        System.out.println();

        button.submit();





        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        //driver.quit();
         }
}
