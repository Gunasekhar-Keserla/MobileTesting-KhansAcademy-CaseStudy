package olearning.hybrid.pom;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginPOM {

	public static AndroidDriver<AndroidElement> driver = null;

	public LoginPOM(AndroidDriver<AndroidElement> driver) throws MalformedURLException {

		this.driver = driver;
	}

	public void newPageDismiss() {

		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Dismiss\")").click();

	}

	public void covidMsgDismiss() {

		driver.findElementByXPath("//android.widget.Button[@content-desc=\"Dismiss\"]/android.widget.TextView").click();

	}

	public void clickSignInBtn() {

		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Sign in\")").click();

	}

	public void googleActSignInBtn() {

		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Continue with Google\")").click();

	}

	public void clickGoogleEmailId() {

		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"gunasekhar.ksrl@gmail.com\")").click();

	}

}
