package com.in.rohit.Statements;

import java.util.Scanner;

public class SwtichCase {
   public static void main(String[] args) {
	
	   
	   int a=10 , b= 45, ch ;
	   
	     System.out.println("enter your choice");
	   
	     Scanner  sc=    new Scanner(System.in);
	     
	             ch =  sc.nextInt();
	             
	              switch(ch){
	              case 1 :System.out.println("sum " + (a +b));
	              break ; 
	              case 2 :System.out.println("substriction " + (a-b));
                 break ;
	              
	              case 3 :System.out.println("multiply " + (a*b));
	                 break ;
	              case 4 :System.out.println("division " + (a/b));
	                 break ;
		              
	              default :System.out.println("invalid");
		              
	              }
	     
}
}
