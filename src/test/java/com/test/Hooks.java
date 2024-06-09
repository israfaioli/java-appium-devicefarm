package com.test;

import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Hooks {
    private static AppiumDriver<?> driver;
    public static String execution = "";
    public static String device = "";
    public static String browserstackKey = System.getenv("BROWSERSTACK_KEY");


    public static AppiumDriver<?> validateDriver() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        execution = System.getProperty("execucao").toLowerCase();
        device = System.getProperty("dispositivo").toLowerCase();

        if (execution.equals("local") && device.equals("android")) {
            System.out.println("ANDROID LOCAL");
            desiredCapabilities.setCapability("app", "C:\\projetos\\java-appium-devicefarm\\apps\\app-debug.apk");
            desiredCapabilities.setCapability("deviceName", "emulator-5554");
            desiredCapabilities.setCapability("platformaName", "Android");
            desiredCapabilities.setCapability("unicodeKeyboard", true);
            driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
        } else if (execution.equals("local") && device.equals("ios")) {
            System.out.println("iOS LOCAL");
            desiredCapabilities.setCapability("app", "C:\\projetos\\java-appium-devicefarm\\apps\\LoginExample.app");
            desiredCapabilities.setCapability("deviceName", "iPhone 13");
            desiredCapabilities.setCapability("platformaName", "iOS");
            desiredCapabilities.setCapability("platformaVersion", "15.0");
            desiredCapabilities.setCapability("automationName", "XCUITest");
            driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
        } else if (execution.equals("devicefarm") && device.equals("android")) {
            System.out.println("ANDROID DEVICEFARM");
            desiredCapabilities.setCapability("browserstack.user", "israelfaiolipint_OY3o57");
            desiredCapabilities.setCapability("browserstack.key", browserstackKey);
            desiredCapabilities.setCapability("app", "bs://857cc0a6cb90401473c404ff1e3a52512172916b");
            desiredCapabilities.setCapability("device", "Google Pixel 3");
            desiredCapabilities.setCapability("os_version", "9.0");
            driver = new AndroidDriver<>(new URL("http://hub.browserstack.com/wd/hub"), desiredCapabilities);
        } else if (execution.equals("devicefarm") && device.equals("ios")) {
            System.out.println("iOS DEVICEFARM");
            desiredCapabilities.setCapability("browserstack.user", "israelfaiolipint_OY3o57");
            desiredCapabilities.setCapability("browserstack.key", "N5vYzsVZCrLx7xqNhmdi");
            desiredCapabilities.setCapability("app", "bs://url_browserstack");
            desiredCapabilities.setCapability("deviceName", "iPhone 13");
            desiredCapabilities.setCapability("os_version", "16");
            driver = new IOSDriver<>(new URL("http://hub.browserstack.com/wd/hub"), desiredCapabilities);
        }

        return driver;
    }

    public static AppiumDriver<?> getDriver() {
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Before
    public static void startProject() throws MalformedURLException {
        if (driver != null) {
            getDriver().launchApp();
        } else {
            validateDriver();
        }
    }
}