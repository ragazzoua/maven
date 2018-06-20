package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * created by s.a.miroshnychenko 6/20/2018
 */
public class TestSample {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.google.com");
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
        driver.close();


    }
}
