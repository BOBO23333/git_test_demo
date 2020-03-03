package testcases;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * The type Hello world.
 */
public class EditTextTest {
    private AppiumDriver appiumDriver;

    @BeforeMethod
    public void setUp() throws Exception {
        File app = new File(System.getProperty("user.dir"), "AUT/osc.apk");

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "Nox_Emulator");
        desiredCapabilities.setCapability("app",app.getAbsolutePath());
        desiredCapabilities.setCapability("appPackage","net.oschina.app");
        desiredCapabilities.setCapability("appActivity","net.oschina.app.improve.main.splash.SplashActivity");
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("noReset",true);
        desiredCapabilities.setCapability("unicodeKeyboard", true);
        appiumDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testName() throws Exception {
        appiumDriver.findElement(By.id("net.oschina.app:id/nav_item_me")).click();
        appiumDriver.findElementById("net.oschina.app:id/iv_portrait").click();
        WebElement editLoginUsername = appiumDriver.findElementById("net.oschina.app:id/et_login_username");
        editLoginUsername.sendKeys("世界你好！");
        Thread.sleep(1000);
        editLoginUsername.clear();
        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown() {
        appiumDriver.quit();
    }
}
