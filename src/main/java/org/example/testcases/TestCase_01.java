package org.example.testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class TestCase_01 {

    @Test
    public void testCase() {
        int a = 1;
        int b = 2;
        int c = a + b;

    }

    ChromeDriver chromeDriver;

    Thread thread=new Thread();


    @Before
    public void startBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\khushboo\\Downloads\\chromedriver_win32\\chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("http://www.google.com");
        chromeDriver.navigate().to("https://thetestingworld.com/testings/");
        chromeDriver.navigate().back();
        Thread.sleep(5000);
        chromeDriver.navigate().forward();

    }
    @After
    public void close(){
        chromeDriver.close();
    }


    @Test
    public void testCases() throws InterruptedException {

        chromeDriver.findElementByName("fld_username").sendKeys("hello");
        chromeDriver.findElementByName("fld_username").sendKeys("abhi");
        Thread.sleep(4000);
        chromeDriver.findElementByName("fld_email").sendKeys("abhi@yahoo.com");
        Thread.sleep(4000);
        chromeDriver.findElementByName("fld_password").sendKeys("abhi@123");
        Thread.sleep(4000);
        chromeDriver.findElementByName("fld_cpassword").sendKeys("abhi@123");
        Thread.sleep(5000);
        chromeDriver.findElementById("datepicker").sendKeys("2000/09/08");
        Thread.sleep(5000);
        chromeDriver.findElementByName("phone").sendKeys("986535789");
        Thread.sleep(5000);
        chromeDriver.findElementByName("address").sendKeys("gopalpura bypass");
        Thread.sleep(5000);
//        chromeDriver.findElementByXPath("//*[@id=\"tab-content1\"]/form/select[1]").click();
        chromeDriver.findElementByXPath("//*[@id=\"tab-content1\"]/form/input[9]").click();
        Thread.sleep(5000);
         Select gender=new Select(chromeDriver.findElementByName("sex"));
        gender.selectByIndex(1);
        Thread.sleep(5000);
//        chromeDriver.findElementByXPath("//*[@id=\"tab-content1\"]/form/input[9]").click();
        Select country=new Select(chromeDriver.findElementById("countryId"));
        country.selectByValue("12");
        Thread.sleep(5000);
        Select state=new Select(chromeDriver.findElementById("stateId"));
        state.selectByValue("244");
        Thread.sleep(5000);
        Select city=new Select(chromeDriver.findElementById("cityId"));
        city.selectByValue("6554");
        Thread.sleep(5000);
        chromeDriver.findElementByName("zip").sendKeys("2020202");
        Thread.sleep(6000);
        chromeDriver.findElementByXPath("//*[@id=\"tab-content1\"]/form/div/em/a").click();
        Thread.sleep(5000);
        chromeDriver.findElementByName("terms").click();
        Thread.sleep(4000);
        chromeDriver.findElementByXPath("//*[@id=\"tab-content1\"]/form/div/input[2]").click();
        String name="User is successfully register,Now you can login";
        if(name.equalsIgnoreCase("//*[@id=\"tab-content1\"]/div")){
            chromeDriver.findElement(By.xpath("//*[@id=\"tab-content1\"]/div"));
        }
        else {
            chromeDriver.findElementByXPath(" //*[@id=\"close\"]");
        }
//        if(name)

//else{
//            //*[@id="close"]
        }

    }

