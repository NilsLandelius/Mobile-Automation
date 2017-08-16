import BaseFile.BaseChrome;
import BaseFile.BaseSauceLabs;
import BaseFile.BaseTestSauce;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

public class HybridTestSauceLab extends BaseChrome {
    public static void main(String[] args) throws MalformedURLException
    {
        AndroidDriver driver= capabilities();






        //get the context we are in Native, Web
        System.out.println("Current context: "+driver.getContext());
        driver.findElement(By.id("com.example.testapp:id/urlField")).sendKeys("https://www.google.com");
        driver.findElement(By.id("com.example.testapp:id/goButton")).click();


       /*
       The following segement of code collects the different contexts present in the app
       and saves them in a Set. A for-loop then goes through them and prints their names
       This way the name of the WEBVIEW context is displayed and can then be used to change
       the drivers context.
        */

       Set<String> sets = driver.getContextHandles(); //should be 1 native and 1 web
        System.out.println("Existing contexts in app: ");
        for(String handle : sets)
        {
            System.out.println(handle);
        }

        /*
           Some hybrid apps can have the option to switch a driver to webview via driver.context() function disabled.
           If that is the case then the developers need to call the static method setWebContentsDebuggingEnabled
           on the Webview class.
         */

        driver.context("WEBVIEW_com.example.testapp");
        driver.findElement(By.name("q")).sendKeys("Handling hybrid apps");



    }
}

