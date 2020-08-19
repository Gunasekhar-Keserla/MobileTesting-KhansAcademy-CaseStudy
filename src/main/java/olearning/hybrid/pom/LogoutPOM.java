package olearning.hybrid.pom;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LogoutPOM {
	
	public static AndroidDriver<AndroidElement> driver = null;

	public LogoutPOM(AndroidDriver<AndroidElement> driver) throws MalformedURLException {

		this.driver = driver;
	}

	public void clickSettingsIcon() {

		driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Settings\"]").click();

	}
	
	public void clickSignOut() {

		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Sign out\"))").click();

	}

}
