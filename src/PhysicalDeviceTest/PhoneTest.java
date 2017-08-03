package PhysicalDeviceTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * Created by nlandeli on 2017-08-02.
 */
public class PhoneTest {
    public void test() throws MalformedURLException {
        File appDir = new File("src");
        //This test won't run because the apk-package is not present. This is just an example of what
        //code can look like when trying to communicate with a hard device rather then an emulator
        //using the command adb devices in cmd from platform-tools folder you can see detected devices.
        File app = new File(appDir, "bookMyShow-ucb.apk");

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");

        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        //driver.findElementById("com.bt.bms:id/btnLogin").click();
        driver.findElementById("com.bt.bms:id/btnSignUp").click();
        int s = driver.findElements(By.className("android.widget.EditText")).size();
        System.out.println(s);
        List<WebElement> a = driver.findElements(By.className("android.widget.EditText"));
        a.get(0).sendKeys("Appium");
        a.get(1).sendKeys("Mobile");
        a.get(2).sendKeys("appium@training");
        a.get(3).sendKeys("password");
        driver.findElementById("com.bt.bms:id/action_icon").click();
    }
}