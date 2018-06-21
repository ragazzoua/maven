package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * created by s.a.miroshnychenko 6/20/2018
 */
public class TestSample {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        /*driver.get("https://mail.google.com");*/
        driver.manage().window().maximize();
        driver.navigate().to("https://mail.google.com");

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



        /*driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
        driver.close();*/


    }
}
