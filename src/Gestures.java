import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * Created by nlandeli on 2017-07-31.
 */
public class Gestures extends Base {
    public static void main(String[] args) throws MalformedURLException{

        AndroidDriver<AndroidElement> driver=capabilities();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

            try {
                driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
                //Using Tap instead of click, TouchAction uses more advanced gestures like doubletap etc.
                TouchAction t = new TouchAction(driver);
                t.tap(driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']")).perform();

                driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
                //.waitAction(Duration.ofMillis(3000)).release()
                new TouchAction(driver).press(driver.findElementByXPath("//android.widget.TextView[@text='People Names']")).waitAction(Duration.ofSeconds(3)).release().perform();
                System.out.println(driver.findElementById("android:id/title").getText());
            }
            catch(Exception e){
                driver.quit();
            }

    }
}
