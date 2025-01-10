package com.in.rohit.Excersize;

import java.util.Scanner;

public class FindFactorialNumber {

	
	 public static void main(String[] args) {
		    
		 
		    int n   ,fact = 1  ; 
		    
		      System.out.println("Enter your number ");
		        Scanner sc = new Scanner(System.in);
		        
		              n  =   sc.nextInt();
		              
		              for (int i = 1 ; i <= n ; i ++)
{
		            fact	=  fact*i ;
		            
		            		 	  
		              }
			            System.out.println("factorial number " + fact);

	}
}
