package com.in.rohit.Arrays;

public class FindMaxElement {
	
	 public static void main(String[] args) {
		 int [] arr = new  int [6];
		 arr [0] = 2;
		 arr [1] = 21;
		 arr [2] = 5662;
		 arr [3] = -32;
		 arr [4] = 24;
		 arr [5] = -2;
		 
		 int res = Integer.MIN_VALUE ; //its called negative infinty
		 
		 for (int i = 0 ; i < arr.length ; i++)
		 {
			 if(arr[i] >res) {
				 res = arr[i]; 
			 }
		 }
		 System.out.println(res);

		 
	}

}