package com.class26;

public class ThiKeywordTest {

	public static void main(String[] args) {
		System.out.println("----------");
		ThisKeyword obj = new ThisKeyword(10, 20);
		obj.sum(100, 200);
		
		System.out.println("----------");
		ThisKeyword obj1=new ThisKeyword();
		//ThisKeyword obj1=new ThisKeyword("yunus ",31);
		obj1.sum(12, 13);

	}
}
