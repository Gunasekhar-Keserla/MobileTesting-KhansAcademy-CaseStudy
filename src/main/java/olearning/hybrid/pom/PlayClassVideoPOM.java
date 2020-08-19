package olearning.hybrid.pom;

import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class PlayClassVideoPOM {
	
	
	public static AndroidDriver<AndroidElement> driver = null;

	public PlayClassVideoPOM(AndroidDriver<AndroidElement> driver) throws MalformedURLException {

		this.driver = driver;
	}

	public void selectClass() {

		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Class 3 math (India)\")").click();
	}
	
	public void selectTopic() {

		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Numbers from 1 to 1000\")").click();
	}
	
	public void selectVideo() {

		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Comparing whole numbers\")").click();
	}
	
	public void backToHome() {

		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Home\")").click();	
	}

}
