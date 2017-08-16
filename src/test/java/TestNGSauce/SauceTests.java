package TestNGSauce;

import BaseFile.BaseTestSauce;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.UnexpectedException;
import java.util.Set;

public class SauceTests extends BaseTestSauce{

    @Test(dataProvider = "hardCodedBrowsers")
    public void HybridTest(
            String platformName,
            String deviceName,
            String platformVersion,
            String appiumVersion,
            String deviceOrientation,
            Method method
    ) throws MalformedURLException, InvalidElementStateException, UnexpectedException{
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        AndroidDriver driver = this.getAndroidDriver();

        System.out.println("Current context: "+driver.getContext());
        driver.findElement(By.id("com.example.testapp:id/urlField")).sendKeys("https://www.google.com");
        driver.findElement(By.id("com.example.testapp:id/goButton")).click();

        Set<String> sets = driver.getContextHandles(); //should be 1 native and 1 web
        System.out.println("Existing contexts in app: ");
        for(String handle : sets)
        {
            System.out.println(handle);
        }

        driver.context("WEBVIEW_com.example.testapp");
        driver.findElement(By.name("q")).sendKeys("Handling hybrid apps");



    }
}
