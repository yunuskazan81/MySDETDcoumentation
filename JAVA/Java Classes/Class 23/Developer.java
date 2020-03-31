package com.class23;

public class Developer extends ScrumTeam{

	String devType;
	String doing;
	
	public void code() {
		System.out.println("Developer can code");
	}
		
		public void doHtml() {
			
			devType= "FrontEnd";
			doing= "Html and Css or user interface and UI desing";
			System.out.println(devType+" developers can do "+doing);
			
			
		}
		
		
		public void doSql() {
			
			devType= "BackEnd";
			doing= "Sql and Database";
			System.out.println(devType+" developers can do "+doing);
			
			
		}
	
}
