import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/**
 * Created by nlandeli on 2017-08-02.
 */
public class Miscellaneous extends Base {
    public static void main(String[] args) throws MalformedURLException{

        AndroidDriver<AndroidElement> driver=capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Mobile specific Methods
        //------------------------------------
        //what is the driver doing
        System.out.println("Current driver activity: \n"+driver.currentActivity());
        //Views - Native, Hybrid, Webview
        System.out.println("The driver context: \n"+driver.getContext());
        //What is the current orientation
        System.out.println("Orientation: \n"+driver.getOrientation());
        //Is the mobile locked?
        System.out.println("Is the mobile system locked?: \n"+driver.isLocked());
        //Hide the keyboard using
        //driver.hideKeyboard();  !Caution, a error will be produced if you try to hide the keyboard where the keyboard is not otherwise displayed use try/catch.
        //How to click on back button
        //Firstly need to enter into the app menu
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        //AndroidKeyCode gives access to all the standard Android buttons
        driver.pressKeyCode(AndroidKeyCode.BACK);
        //------------------------------------


    }
}
