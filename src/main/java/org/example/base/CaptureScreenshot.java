package org.example.base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CaptureScreenshot extends InitiateDriver{

    static String filename=null;
    public static void takeScreenshot(WebDriver driver) throws IOException {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String file=System.getProperty("user.dir") + "/screenshots/" +  dateName + ".png";
        TakesScreenshot screenshot= (TakesScreenshot) driver;
        File f=screenshot.getScreenshotAs(OutputType.FILE);
        File fd=new File("./screenshots/test.png");
        FileUtils.copyFile(f,fd);
    }
    public static void attachScreenshot(WebDriver driver) throws IOException {
        File file=new File(filename);
        System.getProperty("org.uncommons.reportng.escape-reports","false");
        Reporter.log("<a title = \"snapshots\" href=\"" + file.getAbsolutePath() +"\">"+
                "<img width=\"418\" height=\"240\" alt=\"alternativename\" title=\"title\" src =\"..surfire-reports/html/screenshots/"+filename+"\"</a>");
        System.out.println("added image");
    }
}
