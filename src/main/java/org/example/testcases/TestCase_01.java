package org.example.testcases;

import org.example.base.CaptureScreenshot;
import org.example.base.ConfigurationFile;
import org.example.base.InitiateDriver;
import org.example.pages.RegisterPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;


public class TestCase_01 extends InitiateDriver {

    @Test
    public void testCase() {
        int a = 1;
        int b = 2;
        int c = a + b;

    }

    @Test

    public void testCases() throws InterruptedException, IOException {
        RegisterPage registerPage = PageFactory.initElements(driver, RegisterPage.class);
//        RegisterPage registerPage1=new RegisterPage();
//        PageFactory.initElements(driver,registerPage1);
        registerPage.enterName();
        Thread.sleep(5000);
        registerPage.enterEmail();
        Thread.sleep(5000);
        registerPage.enterPassword();
        Thread.sleep(5000);
        registerPage.enterConfirmPassword();
        Thread.sleep(5000);
        registerPage.enterDate();
        Thread.sleep(4000);
        registerPage.enterPhone();
        Thread.sleep(5000);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,200)", " ");
        registerPage.enterAddress();
        Thread.sleep(2000);
        CaptureScreenshot.takeScreenshot(driver);
        Thread.sleep(4000);
        registerPage.signIn();
//        driver.findElement(By.name("fld_username")).sendKeys(ConfigurationFile.getProperty("Application_username"));
//        Thread.sleep(4000);
//        driver.findElement(By.name("fld_email")).sendKeys("abhi@yahoo.com");
//        Thread.sleep(4000);
//        driver.findElement(By.name("fld_password")).sendKeys(ConfigurationFile.getProperty("Application_password"));
//        Thread.sleep(4000);
//        driver.findElement(By.name("fld_cpassword")).sendKeys(ConfigurationFile.getProperty("Application_password"));
//        Thread.sleep(5000);
//
//        driver.findElement(By.id("datepicker")).sendKeys("2000/09/08");
//        Thread.sleep(5000);
//        driver.findElement(By.name("phone")).sendKeys("986535789");
//        Thread.sleep(5000);
//        driver.findElement(By.name("address")).sendKeys("gopalpura bypass");
//        Thread.sleep(5000);
////        chromeDriver.findElementByXPath("//*[@id=\"tab-content1\"]/form/select[1]").click();
////        WebDriverWait(chromeDriver, 10).until(expected_conditions.visibility_of_element_located((By.xpath(), topics_xpath)))
//
//        driver.findElement(By.xpath("//*[@id=\"tab-content1\"]/form/input[9]")).click();
//        Thread.sleep(5000);
//        Select gender = new Select(driver.findElement(By.name("sex")));
//        gender.selectByIndex(1);
//        Thread.sleep(5000);
////        chromeDriver.findElementByXPath("//*[@id=\"tab-content1\"]/form/input[9]").click();
//        Select country = new Select(driver.findElement(By.id("countryId")));
//        country.selectByValue("12");
//        Thread.sleep(5000);
//        Select state = new Select(driver.findElement(By.id("stateId")));
//        state.selectByValue("244");
//        Thread.sleep(5000);
//        Select city = new Select(driver.findElement(By.id("cityId")));
//        city.selectByValue("6554");
//        Thread.sleep(5000);
//        driver.findElement(By.name("zip")).sendKeys("2020202");
//        Thread.sleep(6000);
//        driver.findElement(By.xpath("//*[@id=\"tab-content1\"]/form/div/em/a")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.name("terms")).click();
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("//*[@id=\"tab-content1\"]/form/div/input[2]")).click();
//        String name = "User is successfully register,Now you can login";
//        if (name.equalsIgnoreCase("//*[@id=\"tab-content1\"]/div")) {
//            driver.findElement(By.xpath("//*[@id=\"tab-content1\"]/div"));
//        } else {
//            driver.findElement(By.xpath(" //*[@id=\"close\"]"));
//        }
//        if(name)

//else{
//            //*[@id="close"]
    }

}

