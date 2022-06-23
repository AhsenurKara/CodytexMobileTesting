package tests;

import Utilities.DriverAndroid;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class AndroidTest {

    @Test
    public void test1(){
        MobileElement animation = DriverAndroid.getDriver().findElementByXPath("//android.widget.TextView[@content-desc=\"Animation\"]");

        animation.click();

        MobileElement events =DriverAndroid.getDriver().findElementByXPath("//android.widget.TextView[@content-desc=\"Events\"]");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String wordToCheck = events.getText();

        Assert.assertEquals("Events",wordToCheck);

    }
}

