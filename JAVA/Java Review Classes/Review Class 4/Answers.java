package com.class4;

public class Answers {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {

            System.out.println("I am feeling happy today");

        }
        int i = 0;
        boolean happy = true;

        while (i<10) {
            if (i == 10) {
//                break;

                happy = false;
            }
            System.out.println("I am feeling happy today");

            i++;
        }

        do {

            if (i == 10) {
//                break;
                happy = false;
            }
            System.out.println("I am feeling happy today");
            i++;
        } while (happy);
        
        
        for (int j = 18; j >=0; j-=3) {
            System.out.println(j);
        }
        
        int k = 18;
        
        while(k>=0) {
            
            System.out.println(k);
            
            k-=3;
        }
        int s = 18;
        do {
            System.out.println(s);
            s-=3;
        }while(s>=0);

    }
	}

//}
