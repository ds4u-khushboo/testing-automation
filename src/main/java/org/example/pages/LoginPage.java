package org.example.pages;

import org.example.base.ConfigurationFile;
import org.example.base.PageAction;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

public class LoginPage {
    WebDriver driver = null;

    PageAction pageAction;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        pageAction = new PageAction(driver);
    }

    public void EnterUserName() throws IOException {
        try {
            pageAction.sendText(driver.findElement(By.name(ConfigurationFile.elementLocators("Application_login_username"))),
                    ConfigurationFile.getProperty("Application_username"));
//        driver.findElement(By.name(ConfigurationFile.elementLocators("Application_login_username"))).sendKeys(name);
        }
        catch (Exception e){
            System.out.println("**************Exception*********");
            e.printStackTrace();
            Assert.fail();
        }
    }

    public void enterPassword() throws IOException {
        try {
            pageAction.sendText(driver.findElement(By.name(ConfigurationFile.elementLocators("Application_login_password"))),
                    ConfigurationFile.getProperty("Application_password"));
//        driver.findElement(By.name(ConfigurationFile.elementLocators("Application_login_password"))).sendKeys(password);
        }
        catch(Exception e){
            System.out.println("***********Exception**********");
            e.printStackTrace();
            Assert.fail();
        }
    }

    public void clickCheckbox() throws IOException {
        try {
            pageAction.clickAction(driver.findElement(By.xpath(ConfigurationFile.elementLocators("Application_login_checkbox"))));
//        driver.findElement(By.xpath(ConfigurationFile.elementLocators("Application_login_checkbox"))).click();
        }
        catch (Exception e){
            System.out.println("***********Exception**********");
            e.printStackTrace();
            Assert.fail();
        }
    }

    public void loggedIn() throws IOException {
        try {
            pageAction.clickAction(driver.findElement(By.xpath(ConfigurationFile.elementLocators("Application_login_click"))));
//        driver.findElement(By.xpath(ConfigurationFile.elementLocators("Application_login_click"))).click();
        } catch (Exception e) {
            System.out.println("***********Exception**********");
            e.printStackTrace();
            Assert.fail();
        }
    }
}
