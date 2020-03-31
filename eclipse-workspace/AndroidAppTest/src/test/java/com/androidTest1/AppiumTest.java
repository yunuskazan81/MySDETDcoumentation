package com.androidTest1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumTest {

	// WebDriver driver1;
	public static AppiumDriver<MobileElement> driver;
	
	// AndroidDriver<MobileElement> driver2;
	
	@Test(enabled= false)
	public static void openCalculator() throws Exception {
		
		
		DesiredCapabilities cap= new DesiredCapabilities();
		
		
		cap.setCapability("deviceName", "Android SDK built for x86");
		cap.setCapability("uid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("appPackage", "com.android2.calculator3");
		cap.setCapability("appActivity", "com.xlythe.calculator.material.Calculator");
		
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
		
		
		driver = new AppiumDriver<MobileElement>(url, cap);
		
		System.out.println("Application started...");
		
		
		MobileElement nine= driver.findElement(By.id("com.android2.calculator3:id/digit_9"));
		MobileElement five= driver.findElement(By.id("com.android2.calculator3:id/digit_5"));
		MobileElement multi= driver.findElement(By.id("com.android2.calculator3:id/op_mul"));
		MobileElement equals= driver.findElement(By.id("com.android2.calculator3:id/eq"));
		MobileElement result= driver.findElement(By.id("com.android2.calculator3:id/formula"));
		nine.click();
		multi.click();
		five.click();
		equals.click();
		
		String resultText= result.getText();
		
		System.out.println("the result is: "+resultText);
		
		System.out.println("Test is done succesfully");
		
	}
	
	
	
	@Test(enabled=true)
	public void googlePlaySearchBox() throws Exception {
		
		DesiredCapabilities cap= new DesiredCapabilities();
		
		
		cap.setCapability("deviceName", "Android SDK built for x86");
		cap.setCapability("uid", "emulator-5556");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("appPackage", "com.android.vending");
		cap.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");
		
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
		
		
		driver = new AppiumDriver<MobileElement>(url, cap);
		
		System.out.println("Application started...");
		
		
		
		
		
	}
	
}
