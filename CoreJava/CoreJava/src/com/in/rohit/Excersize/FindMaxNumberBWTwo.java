package com.in.rohit.Excersize;

import java.util.Scanner;

public class FindMaxNumberBWTwo {
	
	
	 public static void main(String[] args) {
		int a , b ; 
		
		System.out.println("enter the numbers");
		
		       Scanner sc =   new Scanner(System.in);
		       
		        a =  sc.nextInt();
		        System.out.println();
		             b= sc.nextInt();
		             
		             if( a>b) {
		            	   System.out.println("A big number  "+  a);
		            	 
		             }else {
		             System.out.println("B is big number " + b); 
		             }
	}

}
