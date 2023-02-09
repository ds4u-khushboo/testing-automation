package org.example.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageAction {

    WebDriver driver = null;

    public PageAction(WebDriver driver){
        this.driver=driver;
    }

    public void clickAction(WebElement element) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void sendText(WebElement element, String text) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 20);
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text);
    }

    public void clickVisibleByDropdown(WebElement element, String text) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 20);
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(element, text));
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
}
