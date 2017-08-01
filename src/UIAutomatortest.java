import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/**
 * Created by nlandeli on 2017-07-31.
 */
public class UIAutomatortest extends Base {
    public static void main(String[] args)throws MalformedURLException{

        AndroidDriver<AndroidElement> driver=capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElementByAndroidUIAutomator("attribute(\"value\")"). Slash around value is for allowing doublequotes in java
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

        //Validate clickable option for all objects, note that clickable is a property and not an attritube therefore it needs new UiSelector.
        System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(false)").size());
    }
}
