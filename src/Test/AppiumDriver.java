package Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumDriver {

	@Test()

	public void myTest() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android");// or

		// caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability("chromedriverExecutable", "C:\\Users\\rami\\Desktop\\chromedriver.win32\\chromedriver.exe");

		// caps.setCapability("browserName", "chrome");
		// caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");

		caps.setCapability("deviceName", "AbuRashid");
		// caps.setCapability(MobileCapabilityType.DEVICE_NAME, "AbuRashid");

		caps.setCapability("chromedriverExecutable", "C:\\Users\\rami\\Desktop\\chromedriver.win32\\chromedriver.exe");

		File app = new File("src/Test/Calculator_8.4 (503542421)_Apkpure.apk");
		caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);

//		driver.get("https://web.facebook.com/");

	}
}