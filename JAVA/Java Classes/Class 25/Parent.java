package com.class25;



public class Parent {

	String str;
	
	public static void main(String[] args) {
		Child obj= new Child();
		
	}
	
	Parent (){
		System.out.println("I am a parent constructor");
	
	}
	
}
class Child extends Parent {
	
	int num;
	
	// constructors can not be inherited so that they are not able to be overridden;
	//constructors can not be static or void; 
	// void Child (){ --> this is no longer constructor so this is converted a void (non-return type ) method anymore; 
	
	Child (){
		System.out.println("I am a child constructor");
	}
}