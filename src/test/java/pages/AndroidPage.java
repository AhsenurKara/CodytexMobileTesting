package pages;

import Utilities.DriverAndroid;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AndroidPage {


    public AndroidPage()  {
        PageFactory.initElements(new AppiumFieldDecorator(DriverAndroid.getDriver()),this);
    }
}
