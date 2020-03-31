package com.class26;

public class ThisKeyword {

	int num1, num2;
	//String name;
	//int num0;
	
	public ThisKeyword() {
		System.out.println("No parameters here");
		}
	
	
//	public ThisKeyword(String name, int num0) {
//		// System.out.println("No parameters here");
//		
//		this.name=name;
//		this.num0=num0; }
	
	
	public ThisKeyword(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	public void sum(int num1, int num2) {
		System.out.println("The sum of local variables="+(num1+num2));
		System.out.println("The sum of instance variables="+(this.num1+this.num2));
		// System.out.println("The sum of instance variables="+(this.name+", age is "+this.num0));
	}
}
