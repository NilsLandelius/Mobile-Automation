import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
    public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
    {


        AndroidDriver<AndroidElement>  driver;

        // TODO Auto-generated method stub
        File appDir = new File("src");
        File app = new File(appDir, "ApiDemos-debug.apk");
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
        //cap.setCapability("--session-override",true);
        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

        return driver;
    }



}