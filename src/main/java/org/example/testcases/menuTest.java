package org.example.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class menuTest {
    WebDriver driver;
    List<WebElement> menuItems = driver.findElements(By.xpath("//ul[@id='ListViewInner']/li"));

//  for( WebElement item: menuItems){
//
//        System.out.println(item.getText());
//
//        System.out.println("*********************************************************************");
//    }
}
