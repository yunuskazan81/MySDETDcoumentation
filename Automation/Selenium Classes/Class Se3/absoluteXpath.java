package com.clasSe3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class absoluteXpath {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "/Users/yunuskazan/Selenium/chromedriver");
WebDriver driver = new ChromeDriver();
driver.get("https://www.toolsqa.com/automation-practice-form/");
//driver.findElement(By.xpath("html/body/div/div[5]/div/div/div/div/div/div/div/div[2]/div/form/fieldset/div[8]/input[@name='firstname']")).sendKeys("name");
//driver.close();


// command+f to open xpath search box on web driver; 
	}
}
