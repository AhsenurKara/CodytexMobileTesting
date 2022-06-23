package tests;

import Utilities.DriverAndroid;
import io.appium.java_client.MobileElement;
import org.junit.Test;

public class Homework {

    /*
     1. Open the app;
     2. Go to preferences;
     3. Click preferences from xml
     4. Click on edit text preference
     5. type Azerbaijan and click ok
     */

    @Test
    public void hw1() {

        MobileElement preferences = DriverAndroid.getDriver().findElementByXPath("//android.widget.TextView[@content-desc=\"Preference\"]");
        preferences.click();

        MobileElement xlm = DriverAndroid.getDriver().findElementByXPath("\t\n" + "//android.widget.TextView[@content-desc=\"1. Preferences from XML\"]");
        xlm.click();

        MobileElement editText = DriverAndroid.getDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout\n");
        editText.click();

        MobileElement enterText = DriverAndroid.getDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText");
        enterText.sendKeys("Azerbaijan");

        MobileElement okButton = DriverAndroid.getDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]\n");
        okButton.click();

    }
}
