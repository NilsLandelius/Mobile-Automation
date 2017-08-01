import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * Created by nlandeli on 2017-08-01.
 */
public class swipedemo extends Base {
    public static void main(String[] args) throws MalformedURLException{

        AndroidDriver<AndroidElement> driver=capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
        driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();

        driver.findElementByXPath("//*[@content-desc='9']").click();
        try {
            TouchAction t = new TouchAction(driver);
            // A Swipe: click on number 15, hold for 2 sec, move to 45 then release.
            //'''''''''''''''''''''''''''''''''''
            t.press(driver.findElementByXPath("//*[@content-desc='15']"))
                    .waitAction(Duration.ofMillis(2000))
                    .moveTo(driver.findElementByXPath("//*[@content-desc='45']"))
                    .release()
                    .perform();
            //'''''''''''''''''''''''''''''''''''
        }
        catch(Exception e){
            driver.quit();


        }
    }
}
