package com.class15;

public class InterviewQuestion4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 4.How to find out the part of the string from a string? What is substring? Find number of words in string?
		
		String str1= "How123456 to 12&**(&*(find out the part of $#%^%^^%the string from a string? What is substring? Find number of words in string?";
		
		String [] array2= str1.split(" ");
		
		for(int i=0; i<array2.length; i++) {
		
			
		//System.out.println(array2[i]);
		String replacedArray= array2[i].replaceAll("[^A-Za-z\\?]","");
		
		System.out.print(replacedArray+" ");
		
		}
	
		
		 System.out.println("\n");
		
		String [] array1= str1.split(" ");
		String stra= "";
		
		for (String substring : array1) {
			
			// System.out.println(substring);
			
			String replacedArray1= substring.replaceAll("[^A-Za-z\\?]","");
			
			System.out.println(replacedArray1+" ");
			
			stra=stra+replacedArray1+ " ";
		}
		
		System.out.println("\nElement of the splitted new array ----> "+stra);
		
		System.out.println("\nTotal number word of the new array is "+array1.length);

	}

}
