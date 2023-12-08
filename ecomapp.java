package appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ecomapp extends BaseTest{

	
	@Test
	public void FillForm() throws InterruptedException
	public static void openAPIDemo() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Njoy's phone!");
		cap.setCapability("udid", "LMG850EMW96e261b4");
		
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "12");
		cap.setCapability("app","D:\\report\\ApiDemos-debug.apk");
		
		URL url = new URL("http:/127.0.0.1:4723/wd/hub");
	{
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("devarsh");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));
		
	int productCount =	driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
	
	for(int i =0;i<productCount;i++)
	{
		String productName =driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
		
		if(productName.equalsIgnoreCase("Jordan 6 Rings"))
		{
			driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
		}
	}
	driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	
	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")),"text" , "Cart"));
	
	String lastPageProduct =driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
	Assert.assertEquals(lastPageProduct, "Jordan 6 Rings");
	
		
		
		
		
		
		
		

		
		
	}
}
