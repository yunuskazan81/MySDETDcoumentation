package com.class15;

public class InterviewQuestion2 {

	/*
	 * 2.Write a java program to find the second largest number in the array? 
	 * Maximum and minimum number in the array?
	 */
		public static void main(String[] args) {
			int arr[] = { 1000, 46, 1, 86, 292, 2 };
			
			int min = arr[0];//0
			int secondLargest = 0;//0
			int largest = 0;//0
			
			for(int a: arr) {
				if(a>largest) {
					largest =a;
				}
				if(a < min) {
					min = a;
				}
			}
			for(int a : arr) {
				
				if(a> secondLargest && a <largest) {
					
					secondLargest = a;
				}
			}
			System.out.println("min = " + min);
			System.out.println("Second Largest = " + secondLargest);

			System.out.println("Largest = " + largest);


	}

}
