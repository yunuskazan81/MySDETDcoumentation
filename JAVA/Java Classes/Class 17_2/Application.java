package com.class17_2;

import com.class17.Calculator;

public class Application {

	public static void main(String[] args) {
		ScannerMethod scnMthd = new ScannerMethod();
		
		
		Calculator operations = new Calculator();
		
		int x = 10, y = 100;
		
		int d = operations.sum(x, y);
		
		System.out.println(d);
		
		
		

	}

}
