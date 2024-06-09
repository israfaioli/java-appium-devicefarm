package com.test.screen;

import com.test.Hooks;
import io.appium.java_client.android.AndroidDriver;
import java.util.HashMap;
import java.util.NoSuchElementException;
import org.openqa.selenium.remote.RemoteWebElement;

import static com.test.Hooks.getDriver;

public class Utils {
    public static String device = "";

    public void validateText(RemoteWebElement element, String text) {
        String expectedText = element.getText();
        assert expectedText.equals(text);
    }

    public void scrollToText(String text) {
        try {
            ((AndroidDriver) getDriver())
                    .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"" + text + "\").instance(0))");
        } catch (Exception exception) {
            throw  new NoSuchElementException("Não encontrado" + exception);
        }
    }

    public void scrollToElementIos(RemoteWebElement element) {
        HashMap scrollObjects = new HashMap();
        scrollObjects.put("element", element);
        scrollObjects.put("direction", "up");
        Hooks.getDriver().executeScript("mobile: swipe", scrollObjects);
    }

    public void scroll(String text, RemoteWebElement element) {
        device = System.getProperty("dispositivo").toLowerCase();

        if(device.equals("android")) {
            scrollToText(text);
        } else {
            scrollToElementIos(element);
        }
    }
}
