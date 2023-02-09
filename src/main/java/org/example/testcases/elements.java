package org.example.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

@Test
public class elements {

    public void getElements() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\khushboo\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("http://facebook.com");
        Thread.sleep(4000);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;
        javascriptExecutor.executeScript("window.scrollBy(0,200)", " ");
        Thread.sleep(4000);

        List<WebElement> elements = webDriver.findElements(By.className("inputtext"));
        for (WebElement e : elements) {
            e.sendKeys("hello");

            System.out.println(webDriver.getWindowHandles());

        }
    }
}