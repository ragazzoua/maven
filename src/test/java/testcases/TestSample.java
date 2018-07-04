package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * created by s.a.miroshnychenko 6/20/2018
 */
public class TestSample {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com.ua/");
        WebElement search = driver.findElement(By.id("lst-ib"));
        search.click();
        search.sendKeys("hello");
        search.sendKeys(Keys.ENTER);
        driver.quit();




    }
}
