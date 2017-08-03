import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;

/**
 * Created by nlandeli on 2017-08-02.
 */
public class Appi2 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, MalformedURLException {

        File appDir=new File("src");

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"25");
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"net.one97.paytm");
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "net.one97.paytm.landingpage.activity.AJRMainActivity");

        AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
    }
}
