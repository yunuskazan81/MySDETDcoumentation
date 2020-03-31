package com.class23;

public class Tester extends ScrumTeam{

	String TesterType;
	String TesterDoing;
	
	public void test() {
		System.out.println("Tester can test");
	}
	
	public void ManualTest() {
		
		TesterType= "Manual Tester";
		TesterDoing= "Manually Test";
		System.out.println(TesterType + " can do " +TesterDoing);
		
		
	}
	
	
	public void AutomationTest() {
		
		TesterType= "Automation Tester";
		TesterDoing= "code in Java to Test";
		System.out.println(TesterType + " can do " +TesterDoing);
		
		
	}
	
}