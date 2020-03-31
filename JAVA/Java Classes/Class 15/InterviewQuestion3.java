package com.class15;

public class InterviewQuestion3 {
	
	public static void main(String[] args) {
	
	// 3. Find out how many alpha characters present in a string?
	
	
	String str= "hello yunus kazan, how are you doing12989375043 !@#$#$%^&^&**";
	
	
	String replace= str.replaceAll("[^A-Z a-z]", "");
	
	System.out.println("Replaced string length is  "+replace.length());
	
	System.out.println("task 4................................................");

}
}