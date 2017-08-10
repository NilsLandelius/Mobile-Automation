import BaseFile.HybridBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.Set;

public class HybridTest extends HybridBase {
    public static void main(String[] args) throws MalformedURLException
    {
        AndroidDriver<AndroidElement> driver=capabilities("emulator", "testApp.apk");

        //get the context we are in Native, Web
        System.out.println("Current context: "+driver.getContext());
        driver.findElement(By.id("com.example.testapp:id/urlField")).sendKeys("https://www.google.com");
        driver.findElement(By.id("com.example.testapp:id/goButton")).click();

       Set<String> sets = driver.getContextHandles(); //should be 1 native and 1 web
        for(String handle : sets)
        {
            System.out.println(handle);
        }
        driver.context("WEBVIEW_com.example.testapp");
        driver.findElement(By.name("q")).sendKeys("Handling hybrid apps");


    }
}
