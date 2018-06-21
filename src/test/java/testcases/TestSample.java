package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * created by s.a.miroshnychenko 6/20/2018
 */
public class TestSample {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com.ua/");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Gmail";


        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test passes");
            System.out.println(driver.getTitle());
        } else {
            System.out.println("Test fails");
            System.out.println(driver.getTitle());
        }
        driver.quit();
    }
}
