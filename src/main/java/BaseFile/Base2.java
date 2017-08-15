package BaseFile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by nlandeli on 2017-08-03.
 */
public class Base2 {

    public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
    {


        AndroidDriver<AndroidElement>  driver;

        // TODO Auto-generated method stub
        /*
        File appDir = new File("src");
        File app = new File(appDir, "Raaga.apk");
        DesiredCapabilities cap = new DesiredCapabilities();
        */
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
        //cap.setCapability("--session-override",true);
        //cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.airbnb.android" );
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.airbnb.android.activities.MainActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);

        return driver;
    }
}