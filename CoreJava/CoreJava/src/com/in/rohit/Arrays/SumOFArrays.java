package com.in.rohit.Arrays;

public class SumOFArrays {
	
	public static void main(String[] args) {
		 int [] arr = {-2 , 4 , 56 , -4 , 11 , -55 , -11};
		  int sum = 0 ; 
		  //for loop 
		/*
		 * for (int i = 0 ; i <arr.length ; i ++) {
		 * 
		 * sum += arr[i];
		 * 
		 * }
		 * 
		 * System.out.println(sum);
		 * 
		 */		  
		  for(int i : arr) {
			  sum += i;
			  
		  }
		  System.out.println(sum);
	}

	
}
