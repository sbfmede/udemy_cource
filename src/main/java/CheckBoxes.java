import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CheckBoxes {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\otikhanov\\Apps\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://rozetka.com.ua/");
        driver.findElement(By.xpath("//ul[@class='menu-categories menu-categories_type_main']//li[1]")).click();
        driver.findElement(By.xpath("//a[@title=\"Ноутбуки\"]//following-sibling::a")).click();

        selectCheckBox("Acer");
        selectCheckBox("Apple");
        selectCheckBox("Asus");
    }

    public static void selectCheckBox (String name) {
        String rbXpath = "//label[@for='%s']//parent::a";
        //if (!driver.findElement(By.xpath(String.format(rbXpath,name)+"/input")).isSelected())
            driver.findElement(By.xpath(String.format(rbXpath,name))).click();
    }

}
