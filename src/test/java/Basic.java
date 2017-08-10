import BaseFile.HybridBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/**
 * Created by nlandeli on 2017-07-06.
 */
public class Basic extends HybridBase {
    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = capabilities("real", "ApiDemos-debug.apk");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //xpath id className, androidUIAutomator
        /*xpath Syntax
            tagName[@attribute='value']

         */
        //Xpath
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();

        driver.findElementById("android:id/checkbox").click();
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        driver.findElementByClassName("android.widget.EditText").sendKeys("Hello");
        //using findElements for cases with multiple classes, then selecting the index I want with get.
        driver.findElementsByClassName("android.widget.Button").get(1).click();


    }

}
