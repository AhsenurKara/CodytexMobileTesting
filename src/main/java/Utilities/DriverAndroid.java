package Utilities;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverAndroid {



    static MobileDriver<MobileElement> driver;

    public static MobileDriver<MobileElement> getDriver()  {
        if (driver == null) {
            if ("android".equals(Config.getProperty("browser"))) {
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "CodytexMobilePhone");
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
                capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\ahsen\\Downloads\\ApiDemos-debug.apk");
                try {
                    driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);  // when you open appium server you can see "0.0.0.0:4723" that
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }


                driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
            }
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }






}
