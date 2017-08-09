import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by nlandeli on 2017-08-04.
 */
public class HybridBase {
    public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException
    {


        AndroidDriver<AndroidElement>  driver;

        // TODO Auto-generated method stub
        File appDir = new File("src");
        File app = new File(appDir, "ApiDemos-debug.apk");
        DesiredCapabilities cap = new DesiredCapabilities();

        if(device.equals("emulator")){
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "NexusA711");
        }
        else if (device.equals("real"))
        {
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
        }

        //cap.setCapability("--session-override",true);
        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

        return driver;
    }



}
