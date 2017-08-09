import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class NotARobot extends BaseChrome {
    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = capabilities();

        /*
        testcase for page fantasycricket
         */
        driver.get("https://fantasycricket.dream11.com/in/");
        driver.findElement(By.xpath(".//*[@id='regEmail']")).sendKeys("as");
        //Create a explicit wait to be able to wait for certain elements or events.
        WebDriverWait wd = new WebDriverWait(driver,5);

        wd.equals(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul/li[2]/p"))));
        driver.findElement(By.xpath("\".//*[@id='m_frmRegister']/div[1]/ul/li[2]/p\"")).click();


        /*
        Testcase for recaptcha test site on google
         */

        /*

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Go to webpage
        driver.get("https://www.google.com/recaptcha/api2/demo");
        //Get the frame number that contains the element I want to interact with
        int number = findFrameNumber(driver, By.xpath(".//*[@id='recaptcha-anchor']/div[5]"));
        //Use the number to switch to the correct frame
        driver.switchTo().frame(number);
        //Now use driver to interact with the element
        driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
        //Switch back to defaultContent
        driver.switchTo().defaultContent();

        //Find the next element again in the newly generated frame on the page
        int number1 = findFrameNumber(driver, By.xpath(".//*[@id='recaptcha-verify-button']"));
        //Switch to that frame
        driver.switchTo().frame(number1);
        //Interact with the element
        driver.findElement(By.xpath(".//*[@id='recaptcha-verify-button']")).click();
        //return to defaultContent
        driver.switchTo().defaultContent();
        */


        /*
        This will demonstrate how to identify elements that are within Frames in HTML, such as not a robot buttons.
         EX:  https://www.google.com/recaptcha/api2/demo
         */


    }

    public static int findFrameNumber(AndroidDriver driver, By by)
    {
        int i;
        int frames = driver.findElements(By.tagName("iframe")).size();
        for(i=0;i<frames;i++)
        {
            driver.switchTo().defaultContent();
            driver.switchTo().frame(i);
            int count = driver.findElements(by).size();

            if(count>0)
            {
                System.out.println("Found element: "+ by);
               break;
            }
            else
            {
                System.out.println("Continue looping");
            }
        }
        driver.switchTo().defaultContent();
        System.out.println(i);
        return i;
    }
}
