package com.class28;

public class testBrowser {

	public static void main(String[] args) {
		
		WebDriver test= new ChromeDriver();
		
		test.openBrowser();
		test.closeBrowser();
		test.maximizeWindow();
		test.findElement();
		
	System.out.println();	
	
WebDriver test2= new FirefoxDriver();
		
		test2.openBrowser();
		test2.closeBrowser();
		test2.maximizeWindow();
		test2.findElement();
	}
	
	
	
}
