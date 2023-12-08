package appium;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class projcalc {
	static AppiumDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		try {
			opencalculator();
		} catch (MalformedURLException e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void opencalculator() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability("deviceName", "Njoy's phone!");
		cap.setCapability("udid", "LMG850EMW96e261b4");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "12");
		cap.setCapability("appPackage", "com.android.bbkcalculator");
		cap.setCapability("appActivity", "com.android.bbkcalculator.Calculator");
	 	driver = new AppiumDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		// Addition
		driver.findElement(By.id("com.calculator:id/digit_4")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.calculator:id/op_add")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.calculator:id/digit_2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.calculator:id/img_eq")).click();
		Thread.sleep(1000);
		String value = driver.findElement(By.id("com.calculator:id/result")).getText();
		System.out.println("Addition : ");
		System.out.println("My Output is : " +value);
		driver.findElement(By.id("com.calculator:id/img_clr")).click();
		
		// Substraction
		driver.findElement(By.id("com.calculator:id/digit_5\")).click();
				
				//Thread.sleep(1000);
				driver.findElement(By.id("com.calculator:id/img_op_sub")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("com.calculator:id/digit_3")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("com.calculator:id/img_eq")).click();
				Thread.sleep(1000);
				String value2 = driver.findElement(By.id("com.calculator:id/result")).getText();
				System.out.println("Substraction : ");
				System.out.println("Output is : " +value2);
				driver.findElement(By.id("com.calculator:id/img_clr")).click();
				
				// Multiplication
				driver.findElement(By.id("com.calculator:id/digit_8")).click();
				Thread.sleep(1000);digit_5")).click();

				driver.findElement(By.id("com.calculator:id/img_op_mul")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("com.calculator:id/img_eq")).click();
				Thread.sleep(1000);
				String value3 = driver.findElement(By.id("com.calculator:id/result")).getText();
				System.out.println("Multiplication : ");
				System.out.println("My Output is : " +value3);
				driver.findElement(By.id("com.calculator:id/img_clr")).click();
				
				// Division
				driver.findElement(By.id("com.calculator:id/digit_9")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("com.calculator:id/img_op_div")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("com.calculator:id/digit_3")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("com.calculator:id/img_eq")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("com.calculator:id/img_eq")).click();
				Thread.sleep(1000);
				String value4 = driver.findElement(By.id("com.calculator:id/result")).getText();
				System.out.println("Division : ");
				System.out.println("total is : " +value);
				driver.findElement(By.id("com.calculator:id/img_clr")).click();
}




}
