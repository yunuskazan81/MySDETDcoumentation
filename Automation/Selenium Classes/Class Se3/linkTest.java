package com.clasSe3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/yunuskazan/Selenium/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("http://facebook.com/");
		
//		driver.findElement(By.name("firstname")).sendKeys("John");
//		Thread.sleep(3000);
//		driver.findElement(By.name("lastname")).sendKeys("Mckeinze");
//		Thread.sleep(3000);
//		driver.findElement(By.id("u_0_h")).sendKeys("swapsoftware.tech@gmail.com");
//		Thread.sleep(3000);
//		driver.findElement(By.id("u_0_k")).sendKeys("swapsoftware.tech@gmail.com");
//		Thread.sleep(3000);
//		driver.findElement(By.id("u_0_o")).sendKeys("yunkaz81.");
//		Thread.sleep(3000);
//		driver.findElement(By.id("month")).sendKeys("Jun");
//		Thread.sleep(3000);
//		driver.findElement(By.id("day")).sendKeys("26");
//		Thread.sleep(3000);
//		driver.findElement(By.id("year")).sendKeys("1987");
//		Thread.sleep(3000);
//		driver.findElement(By.id("u_0_a")).click(); 
//		Thread.sleep(3000);
//		driver.findElement(By.id("u_0_u")).click();
		
		
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("swapsoftware.tech@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("yunkaz81.");
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(3000);
		

	}

}
