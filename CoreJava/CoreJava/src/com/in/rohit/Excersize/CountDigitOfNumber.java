package com.in.rohit.Excersize;

import java.util.Scanner;

public class CountDigitOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
		
		  int n  , count= 0;
		  
		  System.out.println("enter Any Number");
		  
		  Scanner sc = new Scanner(System.in);
		  n        = sc.nextInt();
		  
		  while(n>0) {
			   n =  n/10;
			    count++;
		  }
		  System.out.println("digits " +  count);
	}

}
