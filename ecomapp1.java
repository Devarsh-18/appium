package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ecomapp1 extends BaseTest{

	
	@Test
	public void FillForm() throws InterruptedException
	{
		public static void openAPIDemo() throws MalformedURLException, InterruptedException {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", "Njoy's phone!");
			cap.setCapability("udid", "LMG850EMW96e261b4");
			
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "12");
			cap.setCapability("app","D:\\report\\ApiDemos-debug.apk");
			
			URL url = new URL("http:/127.0.0.1:4723/wd/hub");	
	
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		String toastMessage = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		Thread.sleep(2000);
		Assert.assertEquals(toastMessage,"Please enter your name");
		
		
		
		
		

		
		
	}
}
