package com.in.rohit.Excersize;

import java.util.Scanner;

public class CalculatePowerOfNumber { // search square number like 5 ka varg kitna hoga this type 
	
	  public static void main (String [] args ) {
	   int number , power , result = 1 ; 
	   
	   
	   
	    System.out.println("Enter Number");
	            Scanner sc  =  new   Scanner (System.in);
	            			  number =  sc.nextInt();
	            			  
	            			  System.out.println("Enter Power Number");
	            			  
	            		     power = 	  sc.nextInt();
	            		     
	            		     
	            		     for(int i = 1 ;  i <=power ; i ++) { //i = 1 , than increment  i++ so i = 2 check condtions is true 
		            		        result =   number*result ;    // 1*5 = 5 first print than number to value ho gyi 2 to phle print hua tha 5 or humara bhi 5 to 5 * 5 ho 25 this is the answer    
 
	            		     }
	            		     System.out.println("Power Of Number "   + result);
	            		     
}}
