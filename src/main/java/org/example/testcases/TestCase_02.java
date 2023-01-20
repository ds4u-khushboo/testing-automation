package org.example.testcases;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_02 {
    ChromeDriver chromeDriver;
    @Test
    public void testing() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\khushboo\\Downloads\\chromedriver_win32\\chromedriver.exe");

        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("http://www.google.com");
        chromeDriver.navigate().to("https://mail.google.com/mail");
    }
}
