package com.in.rohit.Arrays;

import java.util.Scanner;

public class DynamicArrays {
   public static void main(String[] args) {
	  int size   , i ;
	  
	  
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter Size of array ");
	  
	    size =  sc.nextInt();
	    
	     int[] a =  new int [size] ;
	     
	     for( i =0 ; i <size ; i++) {

	    	  a [i]   =  sc.nextInt();
	     
	     System.out.println("elements print ");
	     
	     
	     for( i = 0 ;  i <size ; i++ ) {
	    	 System.out.println(a[i]);

	     }
	     
	     System.out.println("end ");
	    	 

	     sc.close();
	     }
   
}}
