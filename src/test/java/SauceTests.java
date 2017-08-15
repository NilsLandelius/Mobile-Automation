import BaseFile.BaseTestSauce;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.UnexpectedException;

public class SauceTests extends BaseTestSauce{

    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest(
            String platformName,
            String deviceName,
            String platformVersion,
            String appiumVersion,
            String deviceOrientation,
            Method method
    ) throws MalformedURLException, InvalidElementStateException, UnexpectedException{
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        System.out.println("Current context: "+this.getAndroidDriver().getContext());


    }
}
