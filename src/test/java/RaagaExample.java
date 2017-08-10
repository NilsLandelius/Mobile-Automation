import BaseFile.Base2;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.Point;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/**
 * Created by nlandeli on 2017-08-03.
 */
public class RaagaExample extends Base2 {
    public static void main(String[] args) throws MalformedURLException {
        // TODO Auto-generated method stub

        /*
        ********************************
        This is example code from course, not working on current version of the Raaga app. It demonstrates how you can take
        the coordinates of an object, store it in a point variable, then retrieve those points to use in a TouchAction event
        ********************************
         */

        AndroidDriver<AndroidElement> driver=capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text='Done']").click();
        driver.findElementById("com.raaga.android:id/landing_skip_to_raaga").click();
        driver.findElementByXPath("//android.widget.TextView[@text='World Music']").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(resourceId(\"com.raaga.android:id/music_home_raaga_live\"));");
        driver.findElementById("com.raaga.android:id/music_home_raaga_live").click();
        driver.findElementById("com.raaga.android:id/toolbar_logo").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Settings']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Push Notification']").click();

        Point point= driver.findElementById("com.raaga.android:id/toggle_notifyrecommend").getLocation();
        TouchAction t= new TouchAction(driver);
        //toggle on
        t.tap(point.x+20, point.y+30).perform();
        //toggle off
        t.tap(point.x+100, point.y+30).perform();

        //Previous//appium version older- scrollTo()






    }
}
