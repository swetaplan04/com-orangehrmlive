package browsertesting2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;


public class ChromeBrowserTest {

    public static void main(String[] args) {

        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println("Current URL = " + driver.getCurrentUrl());
        String loginUrl ="https://opensource-demo.orangehrmlive.com/";

        driver.navigate().to(loginUrl);
        System.out.println("Current URL = " +driver.getCurrentUrl());


        System.out.println(driver.getPageSource());
        WebElement emailField = driver.findElement(By.id("txtUsername"));
        emailField.sendKeys("Admin");

        WebElement passwordlField = driver.findElement(By.id("txtPassword"));
        passwordlField.sendKeys("admin123");
        driver.close();
    }

}
