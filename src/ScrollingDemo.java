import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/**
 * Created by nlandeli on 2017-08-01.
 */
public class ScrollingDemo extends Base {
    public static void main(String[] args) throws MalformedURLException{

        AndroidDriver<AndroidElement> driver=capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

        TouchAction t=new TouchAction(driver);
        //using the Android API(not appium code) through AndroidUIAutomator you can scroll until you find the desired object.
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Radio Group\"));").click();
    }
}
