package com.class4;

public class Loops {

	/**
	 * Write a program that prints "I am feeling happy today" 10 times using for
	 * loop and while loop
	 *
	 *
	 *
	 *
	 * Wtire a program that prints starting at 18 decreasing in multiples of 3; 18
	 * 15
	 * 
	 * 12
	 *
	 * 0
	 * 
	 * Write a program that prints the String "the time is 07:min and then all the
	 * mins till 7:30
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean happy = true;
		int number = 0;

//		while (happy) {
//
//			System.out.println("I am happy today");
//
//			number++;
////			happy = false;
//			if (number == 9) {
//				break;
//			}
//
//			for (int i = 0; i <= 10; ++i) {
//
//				System.out.println(i);
//
//			}

		for (int i = 0; i <= 30; i++) {
			if (i < 10) {
				System.out.println("The time is 7:0" + i);

			} else {
				System.out.println("The time is 7:" + i);

			}

		}

		int min = 0;

		while (min <= 30) {
			if (min < 10) {
				System.out.println("The time is 7:0" + min);

			} else {
				System.out.println("The time is 7:" + min);

			}
			
			min++;

		}

	}

}
