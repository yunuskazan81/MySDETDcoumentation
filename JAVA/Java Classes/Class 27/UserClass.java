package com.class27;

public class UserClass {

	 String name;
	 long mobileNumber;
	
//	public UserClass() {
//
//	}
	public UserClass(String name, long mobileNumber) {
		this.name=name;
		this.mobileNumber=mobileNumber;
	}
}
class UserInfo extends UserClass {
	
	public String address;
	//public String name;
	
	public UserInfo(String name, long mobileNumber, String address) {
		super(name,mobileNumber );
		this.address=address;
	}
	
	public void userDetails() {
		System.out.println("User name is "+name+" and phone number is "+mobileNumber
				+" and addrees is "+address);
	}
public static void main(String[] args) {
		
	}
}
