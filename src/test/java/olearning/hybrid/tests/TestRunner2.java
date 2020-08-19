package olearning.hybrid.tests;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import olearning.hybrid.pom.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import olearning.hybrid.actions.Capabilities;

public class TestRunner2 extends Capabilities {

	// private AndroidDriver <AndroidElement> driver=null;
	private LoginPOM loginPOM = null;
	private SelectLangPOM selectLangPOM = null;
	private SelectCoursesPOM selectCoursesPOM = null;
	private PlayClassVideoPOM playClassVideoPOM = null;
	private LogoutPOM logoutPOM = null;

	@BeforeMethod
	public void BeforeMethod() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("**************** In Before Method ***************");
	}

	@AfterMethod
	public void AfterMethod() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("**************** In After Method ***************");
	}

	@BeforeSuite
	public void loginTest() throws InterruptedException, IOException {
		System.out.println("*****************  In BeforeSuite/Log In Test *************");
		AndroidDriver<AndroidElement> driver = Capability(appActivity, appPackage, deviceName, chromeDriver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		loginPOM = new LoginPOM(driver);
		selectLangPOM = new SelectLangPOM(driver);
		selectCoursesPOM = new SelectCoursesPOM(driver);
		logoutPOM = new LogoutPOM(driver);
		playClassVideoPOM = new PlayClassVideoPOM(driver);

		Thread.sleep(10000);
		loginPOM.newPageDismiss();
		loginPOM.covidMsgDismiss();
		loginPOM.clickSignInBtn();
		Thread.sleep(3000);
		loginPOM.googleActSignInBtn();
		Thread.sleep(4000);
		loginPOM.clickGoogleEmailId();

	}

	@Test(priority = 0, enabled = true)
	public void selectLanguageTest() throws InterruptedException {
		System.out.println("******  selectLanguageTest is in progress *************");
		Thread.sleep(4000);
		selectLangPOM.selectLangBtn();
		selectLangPOM.selectLangRadioBtn();
		Thread.sleep(4000);
		selectLangPOM.selectLangRadioBtn2();
		Thread.sleep(4000);
		selectLangPOM.backNavigateArrow();

	}

	@Test(priority = 1, enabled = true)
	public void selectCoursesTest() throws InterruptedException {
		System.out.println("******  selectCoursesTest is in progress *************");
		Thread.sleep(4000);

		selectCoursesPOM.clickEditLink();
		selectCoursesPOM.toggleClassSubject();
		Thread.sleep(5000);
		selectCoursesPOM.toggleClassSubject1();
		Thread.sleep(5000);
		selectCoursesPOM.clickDoneBtn();
		Thread.sleep(5000);

	}

	@Test(priority = 2, enabled = true)
	public void playClassVideoTest() throws InterruptedException {
		System.out.println("*****  playClassVideoTest is in progress *************");
		Thread.sleep(4000);

		playClassVideoPOM.selectClass();
		Thread.sleep(5000);
		playClassVideoPOM.selectTopic();
		Thread.sleep(5000);
		playClassVideoPOM.selectVideo();
		Thread.sleep(2000);
		playClassVideoPOM.backToHome();

	}

	@AfterSuite
	public void logoutTest() throws InterruptedException {

		System.out.println("*****************  In AfterSuite/Log Out Test *************");
		Thread.sleep(5000);
		logoutPOM.clickSettingsIcon();
		logoutPOM.clickSignOut();
	}

}
