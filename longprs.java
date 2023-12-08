package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class longprs extends BaseTest{

	@Test
	public void LongPressGesture() throws MalformedURLException, InterruptedException
	{
		public static void openAPIDemo() throws MalformedURLException, InterruptedException {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", "Njoy's phone!");
			cap.setCapability("udid", "LMG850EMW96e261b4");
			
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "12");
			cap.setCapability("app","D:\\report\\ApiDemos-debug.apk");
			
			URL url = new URL("http:/127.0.0.1:4723/wd/hub");
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
	WebElement ele=	driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		longPressAction(ele);
	String menuText =	driver.findElement(By.id("android:id/title")).getText();
	Assert.assertEquals(menuText, "Sample menu");
	Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());
	
		
			
	}
	
	
}
