package org.example.base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class InitiateDriver {
    public WebDriver driver;

    @Before
    public void startBrowser() throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\khushboo\\Downloads\\chromedriver_win32\\chromedriver.exe");
        if (ConfigurationFile.getProperty("BrowserName").equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\khushboo\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (ConfigurationFile.getProperty("BrowserName").equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\khushboo\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
            driver = new ChromeDriver();
        } else {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\khushboo\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        driver.navigate().to(ConfigurationFile.getProperty("Application_URL"));
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();

    }

    @After
    public void close() {
        driver.close();
    }
}
