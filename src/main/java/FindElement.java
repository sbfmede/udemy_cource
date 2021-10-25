import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FindElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\otikhanov\\Apps\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        driver.get("https://en.wikipedia.org");

       WebElement link = driver.findElement(By.linkText("Log in"));
       WebElement link2 = driver.findElement(By.partialLinkText("About"));

       WebElement searchField = driver.findElement(By.name("search"));
        WebElement searchButton = driver.findElement(By.className("searchButton"));

        WebElement searchli = driver.findElement(By.id("ca-viewsource"));
        WebElement tagInput = driver.findElement(By.tagName("input"));

        /*WebElement searchCss = driver.findElement(By.cssSelector("div@simpleSearch input#searchButton"));*/
       WebElement history = driver.findElement(By.xpath("//li/a[@title='Portal:History']"));


        driver.quit();

    }
}
