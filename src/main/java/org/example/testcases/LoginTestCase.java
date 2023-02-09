package org.example.testcases;

import org.example.base.CaptureScreenshot;
import org.example.base.ConfigurationFile;
import org.example.base.InitiateDriver;
import org.example.base.PageAction;
import org.example.pages.LoginPage;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import java.io.IOException;
public class LoginTestCase extends InitiateDriver {

    PageAction pageAction = new PageAction(driver);

    @Test
    public void getLogin() throws IOException, InterruptedException {
//        driver.findElement(By.xpath(ConfigurationFile.elementLocators("Application_login_tab"))).click();
//        Thread.sleep(4000);

    driver.findElement(By.xpath(ConfigurationFile.elementLocators("Application_login_tab"))).click();
    LoginPage loginPage = new LoginPage(driver);
    loginPage.EnterUserName();
    loginPage.enterPassword();
    loginPage.clickCheckbox();
    loginPage.loggedIn();
    CaptureScreenshot.takeScreenshot(driver);

//catch (Exception e){
//    e.printStackTrace();
//    fail();
//}


//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.EnterUserName("abhi");
//        Thread.sleep(5000);
//        loginPage.enterPassword("abhi@123");
//        Thread.sleep(5000);
//        loginPage.clickCheckbox();
//        Thread.sleep(5000);
//        loginPage.loggedIn();

//        loginPage=PageFactory.initElements(driver, LoginPage.class);
//        loginPage.enterName("abhi");
//        Thread.sleep(5000);
//       loginPage.enterPassword("abhi@123");
//       Thread.sleep(5000);

//        driver.findElement(By.name(ConfigurationFile.elementLocators("Application_login_username"))).sendKeys("test");
//        Thread.sleep(5000);
//        driver.findElement(By.name(ConfigurationFile.elementLocators("Application_login_password"))).sendKeys("test");
//        Thread.sleep(4000);
//        driver.findElement(By.xpath(ConfigurationFile.elementLocators("Application_login_click"))).click();


    }
}