import BaseFile.BaseChrome;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


import java.net.MalformedURLException;

/**
 * Created by nlandeli on 2017-08-04.
 */
public class ChromeBrowser extends BaseChrome {
    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver=capabilities();
        /*
        driver.get("http://www.facebook.com");
        driver.findElementByCssSelector("#u_0_1 > div._56be._5sob > div > div:nth-child(1) > input").sendKeys("qwerty");
        driver.findElementByName("pass").sendKeys("whatever");
        driver.findElementByName("login").click();
        */

        driver.get("http://www.cricbuzz.com");
        driver.findElementByXPath("//a[@href='#menu']").click();
        driver.findElementByCssSelector("a[title='Cricbuzz Home']").click();
        System.out.println(driver.getCurrentUrl());

        //JavascriptExecutor is used to scroll down the mobile page. Assert is used to check that
        //that the text in Top Stories is a header.
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        //This code scrolls 480 pixels down in y-axis. Make the numbers negative to scroll up.
        jse.executeScript("window.scrollBy(0,480)","");

        //This code also scrolls on the page but scrolls down until it finds a given webelement
        /*
        WebElement ts= driver.findElementByXPath("//h4[text()='Top Stories']");
        jse.executeScript("arguments[0].scrollIntoView();", ts);
        */

        Assert.assertTrue(driver.findElement(By.xpath("//h4[text()='Top Stories']")).getAttribute("class").contains("header"));
    }
}
