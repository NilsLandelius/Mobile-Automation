import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.Dimension;

import java.awt.*;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/**
 * Created by nlandeli on 2017-08-01.
 */
public class ScrollingDemo extends Base {
    public static void main(String[] args) throws MalformedURLException{

        AndroidDriver<AndroidElement> driver=capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        /**********************************
         *   The followin segement of code is for scrolling on the page first page without
         *   searching for a specifik element. The code gets the middle of the screen width / 2,
         *   it then take the Height and saves 2 coordinates as int. The swipe command works by taking
         *   4 coordinates and a duration in milliseconds.
         *
         *   swipe (diagonal coordinate for start, start coordiante for height, diagonal end coordinate, end coordinate for height, Duration).
         **********************************/
        Dimension size = driver.manage().window().getSize();
        int x = size.getWidth() / 2;
        int starty = (int) (size.getHeight() * 0.60);
        int endy = (int) (size.getHeight() * 0.10);
        driver.swipe(x, starty, x,endy,2000);


        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

        TouchAction t=new TouchAction(driver);
        //using the Android API(not appium code) through AndroidUIAutomator you can scroll until you find the desired object.
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Radio Group\"));").click();
    }
}
