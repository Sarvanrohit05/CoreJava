package com.in.rohit.Excersize;

import java.util.Scanner;

public class PrintMultiplecationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int table ; 
		
		System.out.println("Enter Your Table Number");

		Scanner sc = new Scanner(System.in);
		    table = sc.nextInt();
		
		    
		    for( int i = 1; i<=10 ; i++) {
		    	
		    	   table = table*1;
		    	   System.out.println("TableOf  " + table  + " * " +  i + "=" + table*i);
		    	//i naatural number hoga jo ki 10 tk jaywga or table vo digit jiska table mikalna hai or table*i h vo multiply karta jayega ek ek karke 
		    }
	}

}
