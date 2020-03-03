package common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTestCase {
    private AppiumDriver appiumDriver;
    private Helper helper;
    private String deviceName = "Nox_Emulator";
    private String pkgName = "net.oschina.app";
    private String appActivity = "net.oschina.app.improve.main.splash.SplashActivity";
    private String platformName = "Android";
    private File app = new File(System.getProperty("user.dir"), "AUT/osc.apk");

    public PageHelper pageHelper;

    @BeforeMethod
    public void setUp() throws Exception {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", deviceName);
        desiredCapabilities.setCapability("app",app.getAbsolutePath());
        desiredCapabilities.setCapability("appPackage",pkgName);
        desiredCapabilities.setCapability("appActivity",appActivity);
        desiredCapabilities.setCapability("platformName",platformName);
        desiredCapabilities.setCapability("noReset",true);
        desiredCapabilities.setCapability("unicodeKeyboard", true);
        appiumDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        helper = new Helper(appiumDriver);
        pageHelper = new PageHelper(helper);
    }

    @AfterMethod
    public void tearDown() {
        this.appiumDriver.quit();
    }
}
