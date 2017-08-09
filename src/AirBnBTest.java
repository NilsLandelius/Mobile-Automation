import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/**
 * Created by nlandeli on 2017-08-03.
 */
public class AirBnBTest extends Base2 {
    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = capabilities();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            WebElement el = driver.findElementById("com.airbnb.android:id/section_header_title");
            System.out.println(el.getText());


    }
}
