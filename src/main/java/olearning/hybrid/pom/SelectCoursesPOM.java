package olearning.hybrid.pom;

import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SelectCoursesPOM {

	public static AndroidDriver<AndroidElement> driver = null;

	public SelectCoursesPOM(AndroidDriver<AndroidElement> driver) throws MalformedURLException {

		this.driver = driver;
	}

	public void clickEditLink() {

		MobileElement element1 = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"org.khanacademy.android:id/action_bar_root\")).scrollIntoView(text(\"Edit\"))"));

		// Perform the action on the element
		element1.click();
	}

	public void toggleClassSubject() {

		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Class 2 math (India)\")").click();
	}

	public void toggleClassSubject1() {
		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Class 2 math (India)\")").click();

	}

	public void clickDoneBtn() {
		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Done\")").click();

	}

}
