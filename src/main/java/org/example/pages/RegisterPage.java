package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
    WebDriver driver = null;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(name = "fld_username")
    WebElement nameElement;

    @FindBy(how = How.NAME, using = "fld_email")
    WebElement emailElement;

    @FindBy(name = "fld_password")
    WebElement passwordElement;

    @FindBy(how = How.NAME, using = "fld_cpassword")
    WebElement cpasswordElement;

    @FindBy(how = How.ID, using = "datepicker")
    WebElement dateElement;

    public void enterName() {
        nameElement.sendKeys("antara");
    }

    public void enterEmail() {
        emailElement.sendKeys("antara123@gmail.com");
    }

    public void enterPassword() {
        passwordElement.sendKeys("antara@13");
    }

    public void enterConfirmPassword() {
        cpasswordElement.sendKeys("antara@123");
    }

    public void enterDate() {
        dateElement.sendKeys("2022-09-08");
    }

    public void enterPhone() {
        driver.findElement(By.name("phone")).sendKeys("986535789");
    }

    public void enterAddress() {
//        WebDriverWait webDriverWait=
        driver.findElement(By.name("address")).sendKeys("gopalpura bypass");
    }
    public void signIn() {
//        WebDriverWait webDriverWait=
        driver.findElement(By.xpath("//*[@id=\"tab-content1\"]/form/div/input[2]")).click();
    }
}
