package com.mobile.MyFirstTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class pasted {
	static AppiumDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		try {
			openAPIDemo();

		} catch (MalformedURLException e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void openAPIDemo() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Njoy's phone!");
		cap.setCapability("udid", "LMG850EMW96e261b4");
		
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "12");
		cap.setCapability("app", "\"D:\\report\\ApiDemos-debug.apk\"");
		

		URL url = new URL("http:/127.0.0.1:4723/wd/hub");

		driver = new AppiumDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"uk.co.aifactory.chessfree:id/YesButton]")).click();
				// Thread.sleep(1000);
	}



}
