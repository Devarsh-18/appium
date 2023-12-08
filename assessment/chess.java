package com.mobile.MyFirstTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class chess {
	static AppiumDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		try {
			opencalculator();
		} catch (MalformedURLException e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void opencalculator() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("appium:deviceName", "Njoy's Phone!");
		cap.setCapability("appium:udid", "LMG850EMW96e261b4");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appium:platformVersion", "12");
		cap.setCapability("appium:appPackage",	 "uk.co.aifactory.chessfree");
		cap.setCapability("appium:appActivity", "uk.co.aifactory.chessfree.ChessFreeActivity");
		cap.setCapability("automationName", "UiAutomator2");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Thread.sleep(2000);
		driver.findElement(By.id("uk.co.aifactory.chessfree:id/YesButton")).click();
		 Thread.sleep(1000);
		driver.findElement(By.id("uk.co.aifactory.chessfree:id/ButtonPlay")).click();
		 Thread.sleep(1000);
		driver.findElement(By.id("uk.co.aifactory.chessfree:id/CrossProm_ExitButton")).click();
		 Thread.sleep(1000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.Button")).click();
		// Thread.sleep(1000);
	WebElement play = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[10]/android.widget.Button[1]"));
		play.click();
	//Thread.sleep(1000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")).click();
        // Thread.sleep(1000);
//
		WebElement ok = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button"));
		ok.click();
		WebElement menu = driver.findElement(By.id("uk.co.aifactory.chessfree:id/ButtonMenu"));
		menu.click();
		//Thread.sleep(1000);
//		String value = driver.findElement(By.id("com.google.android.calculator:id/formula")).getText();
//		System.out.println("My Output is... " + value);

	}
}
