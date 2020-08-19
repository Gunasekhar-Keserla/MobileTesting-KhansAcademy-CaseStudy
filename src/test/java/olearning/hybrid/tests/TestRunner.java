package olearning.hybrid.tests;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import olearning.hybrid.actions.Capabilities;

public class TestRunner extends Capabilities {

	@Test
	public void hybridTest() throws IOException, InterruptedException {

		AndroidDriver<AndroidElement> driver = Capability(appActivity, appPackage, deviceName, chromeDriver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// #TC01 - LOGIN TEST:

		// To click on dismiss button over What's New page

		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Dismiss\")").click();

		// To Dismiss COVID message

		driver.findElementByXPath("//android.widget.Button[@content-desc=\"Dismiss\"]/android.widget.TextView").click();

		// To click on Sign In button

		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Sign in\")").click();

		// To click on Google Sign up button

		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Continue with Google\")").click();

		// To click on google account by name

		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"gunasekhar.ksrl@gmail.com\")").click();


		// TC02 -> select language for the app -> Select language -> english -> english

		MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"org.khanacademy.android:id/action_bar_root\")).scrollIntoView(text(\"Select language\").instance(0))"));

		// Perform the action on the element
		element.click();

		driver.findElement(By.xpath("//*[@text='English']")).click();
		Thread.sleep(3000);

		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"English\")").click();
		Thread.sleep(3000);

		driver.findElementByAccessibilityId("Navigate up").click();

		// TC03 -> Editing My courses -> click on Edit -> add/delete i.e check or
		// uncheck an additional class -> click on Done

		MobileElement element1 = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"org.khanacademy.android:id/action_bar_root\")).scrollIntoView(text(\"Edit\"))"));

		// Perform the action on the element
		element1.click();

		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Class 2 math (India)\")").click();

		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Class 2 math (India)\")").click();

		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Done\")").click();

		//TC04 -> select class4 -> select Multiplication -> play video -> tap the
			//screen while playing to display back arrow button -> click on the back
			//arrow button thrice -> click on settings button at the top -> then sign out

		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Class 3 math (India)\")").click();

		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Numbers from 1 to 1000\")").click();

		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Comparing whole numbers\")").click();

		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Home\")").click();

		// TC05 -> Logout..

		driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Settings\"]").click();

		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Sign out\"))")
				.click();

	}
}
