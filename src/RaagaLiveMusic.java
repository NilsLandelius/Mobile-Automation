import com.gargoylesoftware.htmlunit.javascript.host.Touch;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * Created by nlandeli on 2017-08-03.
 */
public class RaagaLiveMusic extends Base2 {
    public static void main(String[] args ) throws MalformedURLException{

        AndroidDriver<AndroidElement> driver=capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //press the done button
        driver.findElementById("com.raaga.android:id/skip_text").click();
        //press the skip text
        driver.findElementByAndroidUIAutomator("text(\"or Skip to Raaga\")").click();
        //press the Got It button
        driver.findElementById("com.raaga.android:id/gotit_btn").click();
        //Select Hindi channel
        driver.runAppInBackground(Duration.ofSeconds(1));
        driver.findElementByAndroidUIAutomator("text(\"Hindi\")").click();
        //scroll down to find Live music button
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(resourceId(\"com.raaga.android:id/music_home_raaga_live\"))").click();

    }
}
