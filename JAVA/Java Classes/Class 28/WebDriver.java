package com.class28;

public interface WebDriver {

	/*
	
	Create a WebDriver Interface that will have the following unimplemented behaviour: 
	openBrowser(), closeBrowser(), maximizeWindow(), findElement(). 
	Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
	
	*/
	
	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
}

class ChromeDriver implements WebDriver {

	@Override
	public void openBrowser() {
		// TODO Auto-generated method stub
		
		System.out.println("ChromeDriver can open browser by google chrome webDriver ");
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		System.out.println("ChromeDriver can close browser by clicking X button on google chrome driver main page ");
	}

	@Override
	public void maximizeWindow() {
		// TODO Auto-generated method stub
		System.out.println("ChromeDriver can wide web page window with rectangular icon on google chrome driver ");
	}

	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		System.out.println("ChromeDriver can search any element by search button ");
	}
	
	
}

class FirefoxDriver implements WebDriver {

	@Override
	public void openBrowser() {
		// TODO Auto-generated method stub
		System.out.println("FirefoxDriver can open browser by Firefox webDriver");	
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		System.out.println("FirefoxDriver can close browser by clicking X button on FirefoxDriver web page ");
	}

	@Override
	public void maximizeWindow() {
		// TODO Auto-generated method stub
		System.out.println("FirefoxDriver can wide web page window with rectangular icon on google chrome driver ");
	}

	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		System.out.println("FirefoxDriver can search any element on fire fox in the search box ");
	}
	
	
}