import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/**
 * Created by nlandeli on 2017-08-02.
 */
public class DragDropDemo extends Base {
    public static void main(String[] args) throws MalformedURLException{

        AndroidDriver<AndroidElement> driver=capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();

        TouchAction t=new TouchAction(driver);
        //klick on dot 1 with longpress to grab it, then move it to another dot, lastly release it.
        //---------------------------------
        t.longPress(driver.findElementById("io.appium.android.apis:id/drag_dot_1"))
                .moveTo(driver.findElementById("io.appium.android.apis:id/drag_dot_3"))
                .release()
                .perform();
        //---------------------------------

    }
}
