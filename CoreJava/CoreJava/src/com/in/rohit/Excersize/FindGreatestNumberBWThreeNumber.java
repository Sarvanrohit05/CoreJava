package com.in.rohit.Excersize;

import java.util.Scanner;

public class FindGreatestNumberBWThreeNumber {
	
	  public static void main(String[] args) {
		   int a = 10 , b = 20 , c = 30 ; 
		      System.out.println("enter the numbers");
		      
		     Scanner sc   =  new Scanner(System.in);
		     
		    a=  sc.nextInt();
		    System.out.println("enter  the second number ");
		    b=  sc.nextInt();
		    System.out.println("enter  the third number ");
		    c=  sc.nextInt();
		    System.out.println("enter  the third number ");
		   
		   if(a >b)
		   {
			  if(a>c)
				  System.out.println("A is greater  " +a );
			  else
				  System.out.println(  " c is greater " + c);
		   }
		   else {
			   if(b>c)
				   System.out.println("B is greater" + b);
					  else
						  System.out.println("c is greater " + c );
				   
			   
		   }
		   }

}
