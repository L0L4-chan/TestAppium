package TestAppium;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Test{

    // drivers
    //WebDriver drWb;
    static AppiumDriver<MobileElement> driver;
    //AndroidDriver drAn;

    public static void main (String[] args){
        try {
            
            
            openDevice();
        }catch(Exception e){
            System.out.println(e);

        }
    }

    //establecemos el dispositivo 
    public static void openDevice() throws Exception{

        DesiredCapabilities cap =  new DesiredCapabilities();
        cap.setCapability("deviceName" , "emu");
        cap.setCapability("platformName", "Android");
        cap.setCapability("app", "/home/lola-chan/Downloads/app-release.apk");
        cap.setCapability("noReset", "true");

        URL url = new URL("http://127.0.0.1:4723");
        driver = new AppiumDriver<MobileElement>(url, cap);
        System.out.println("Success");
    }


    public void tested(){
        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]");
        el6.sendKeys("Test create armoury");
        MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]");
        el7.sendKeys("Test create armoury");
        MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("Back");
        el8.click();
        MobileElement el9 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]");
        el9.click();
        MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("test\ntest");
        el10.click();
        MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId("Delete");
        el11.click();
        MobileElement el15 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");
        el15.click();
        MobileElement el16 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]");
        el16.click();
        MobileElement el17 = (MobileElement) driver.findElementByAccessibilityId("Bow\nS2-24\"");
        el17.click();
        MobileElement el18 = (MobileElement) driver.findElementByAccessibilityId("Close");
        el18.click();
        MobileElement el19 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");
        el19.click();
        MobileElement el20 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]");
        el20.click();
        el20.sendKeys("Test create armoury");
        MobileElement el21 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]");
        el21.click();
        el21.sendKeys("for testing");
        MobileElement el22 = (MobileElement) driver.findElementByAccessibilityId("Save");
        el22.click();
        MobileElement el23 = (MobileElement) driver.findElementByAccessibilityId("Test create armoury\nfor testing");
        el23.click();
        MobileElement el24 = (MobileElement) driver.findElementByAccessibilityId("Close");
        el24.click();
        MobileElement el25 = (MobileElement) driver.findElementByAccessibilityId("Back");
        el25.click();
        MobileElement el26 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]");
        el26.click();
        MobileElement el27 = (MobileElement) driver.findElementByAccessibilityId("Merry");
        el27.click();
        MobileElement el28 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");
        el28.click();
        MobileElement el29 = (MobileElement) driver.findElementByAccessibilityId("Select Armoury");
        el29.click();
        MobileElement el30 = (MobileElement) driver.findElementByAccessibilityId("Title 1");
        el30.click();
        MobileElement el31 = (MobileElement) driver.findElementByAccessibilityId("Title 3");
        el31.click();
        MobileElement el32 = (MobileElement) driver.findElementByAccessibilityId("Test create armoury");
        el32.click();
        MobileElement el33 = (MobileElement) driver.findElementByAccessibilityId("OK");
        el33.click();
        MobileElement el34 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");
        el34.click();
        MobileElement el35 = (MobileElement) driver.findElementByAccessibilityId("Test create armoury");
        el35.click();
        MobileElement el36 = (MobileElement) driver.findElementByAccessibilityId("Close");
        el36.click();
        MobileElement el37 = (MobileElement) driver.findElementByAccessibilityId("Back");
        el37.click();
        MobileElement el38 = (MobileElement) driver.findElementByAccessibilityId("Back");
        el38.click();
        MobileElement el39 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");
        el39.click();
        MobileElement el40 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");
        el40.click();
        MobileElement el41 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]");
        el41.click();
        el41.sendKeys("My army");
        MobileElement el42 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]");
        el42.click();
        el42.sendKeys("Created for testing");
        MobileElement el43 = (MobileElement) driver.findElementByAccessibilityId("Pick your warriors");
        el43.click();
        MobileElement el44 = (MobileElement) driver.findElementByAccessibilityId("Baldo");
        el44.click();
        MobileElement el45 = (MobileElement) driver.findElementByAccessibilityId("Gandalf");
        el45.click();
        MobileElement el46 = (MobileElement) driver.findElementByAccessibilityId("Merry");
        el46.click();
        MobileElement el47 = (MobileElement) driver.findElementByAccessibilityId("OK");
        el47.click();
        MobileElement el48 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");
        el48.click();
        MobileElement el49 = (MobileElement) driver.findElementByAccessibilityId("My army");
        el49.click();
        MobileElement el50 = (MobileElement) driver.findElementByAccessibilityId("Gandalf");
        el50.click();
        MobileElement el51 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[2]");
        el51.click();
        MobileElement el52 = (MobileElement) driver.findElementByAccessibilityId("1");
        el52.click();
        MobileElement el53 = (MobileElement) driver.findElementByAccessibilityId("2");
        el53.click();
        MobileElement el54 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");
        el54.click();
        MobileElement el55 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[2]");
        el55.click();
        MobileElement el56 = (MobileElement) driver.findElementByAccessibilityId("Back");
        el56.click();
        MobileElement el57 = (MobileElement) driver.findElementByAccessibilityId("Back");
        el57.click();
        MobileElement el58 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Switch");
        el58.click();
        MobileElement el59 = (MobileElement) driver.findElementByAccessibilityId("OK");
        el59.click();
        MobileElement el60 = (MobileElement) driver.findElementByAccessibilityId("Gandalf");
        el60.click();
        MobileElement el61 = (MobileElement) driver.findElementByXPath("//android.view.View[@content-desc=\"Wounds\nWounds\n2\"]/android.widget.Button[1]");
        el61.click();
        MobileElement el62 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[2]");
        el62.click();
        MobileElement el63 = (MobileElement) driver.findElementByXPath("//android.view.View[@content-desc=\"Wounds\nWounds\n1\"]/android.widget.Button[1]");
        el63.click();
        MobileElement el64 = (MobileElement) driver.findElementByAccessibilityId("OK");
        el64.click();
        MobileElement el65 = (MobileElement) driver.findElementByAccessibilityId("Baldo");
        el65.click();
        MobileElement el66 = (MobileElement) driver.findElementByXPath("//android.view.View[@content-desc=\"Wounds\nWounds\n1\"]/android.widget.Button[1]");
        el66.click();
        MobileElement el67 = (MobileElement) driver.findElementByAccessibilityId("OK");
        el67.click();
        MobileElement el68 = (MobileElement) driver.findElementByAccessibilityId("Gandalf");
        el68.click();
        MobileElement el69 = (MobileElement) driver.findElementByXPath("//android.view.View[@content-desc=\"Wounds\nWounds\n1\"]/android.widget.Button[1]");
        el69.click();
        MobileElement el70 = (MobileElement) driver.findElementByAccessibilityId("OK");
        el70.click();
        MobileElement el71 = (MobileElement) driver.findElementByAccessibilityId("OK");
        el71.click();
        MobileElement el72 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Switch");
        el72.click();
        MobileElement el73 = (MobileElement) driver.findElementByAccessibilityId("OK");
        el73.click();
        MobileElement el74 = (MobileElement) driver.findElementByAccessibilityId("OK");
        el74.click();
        MobileElement el75 = (MobileElement) driver.findElementByAccessibilityId("Back");
        el75.click();
        MobileElement el76 = (MobileElement) driver.findElementByXPath("//android.view.View[@content-desc=\"My army\"]/android.widget.Button");
        el76.click();
        MobileElement el77 = (MobileElement) driver.findElementByAccessibilityId("Back");
        el77.click();
        MobileElement el78 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]");
        el78.click();
        MobileElement el79 = (MobileElement) driver.findElementByAccessibilityId("Test create armoury\nfor testing");
        el79.click();
        MobileElement el80 = (MobileElement) driver.findElementByAccessibilityId("Delete");
        el80.click();
        MobileElement el81 = (MobileElement) driver.findElementByAccessibilityId("Back");
        el81.click();
        MobileElement el82 = (MobileElement) driver.findElementByAccessibilityId("Back");
        el82.click();
        MobileElement el83 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
        el83.click();
        MobileElement el84 = (MobileElement) driver.findElementByAccessibilityId("Close");
        el84.click();

    }
}
