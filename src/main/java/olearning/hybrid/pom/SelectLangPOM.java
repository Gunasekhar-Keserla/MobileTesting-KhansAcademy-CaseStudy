package olearning.hybrid.pom;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SelectLangPOM {

	public static AndroidDriver<AndroidElement> driver = null;

	public SelectLangPOM(AndroidDriver<AndroidElement> driver) throws MalformedURLException {

		this.driver = driver;
	}

	public void selectLangBtn() {

		MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"org.khanacademy.android:id/action_bar_root\")).scrollIntoView(text(\"Select language\").instance(0))"));
		// Perform the action on the element
		element.click();

	}

	public void selectLangRadioBtn() {

		driver.findElement(By.xpath("//*[@text='English']")).click();

	}

	public void selectLangRadioBtn2() {

		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"English\")").click();

	}

	public void backNavigateArrow() {

		driver.findElementByAccessibilityId("Navigate up").click();

	}

}
