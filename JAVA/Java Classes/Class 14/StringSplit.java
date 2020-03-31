package com.class14;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome Syntax Students";
		String[] array=str.split("Syntax");
		System.out.println("The length of the array is "+array.length);
		for(String substring: array) {
			System.out.println(substring);
		}
		System.out.println("-----------");
		for(int i=0;i<array.length; i++ ) {
			System.out.println(array[i]);
		}
		//("\\?")//[!?]
		int num=37;
		boolean isPrime=true;
		for (int i=2; i<num/2; i++) {
			if (num%i==0) {
				isPrime=false;
			}
		}
		if (isPrime) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is NOT a prime number");
		}

	}

}
