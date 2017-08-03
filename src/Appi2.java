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

        /*
        This code shows how you can boot up a app on the mobile device/emulator without installing the package from the
        harddrive every time you execute the code. What the capapbility of app package and app activity does is
        tell the computer what package to work with, and then what activity(window) to open up in that app.
        In this case this code is opening the main start page of the app.
         */

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"25");
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"net.one97.paytm");
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "net.one97.paytm.landingpage.activity.AJRMainActivity");

        AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
    }
}
