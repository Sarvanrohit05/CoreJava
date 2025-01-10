package com.in.rohit.Statements;

import java.util.Scanner;

public class IfOrElse {
   public static void main(String[] args) {
	
	    int marks; 
	       System.out.println("enter your marks ");
	       
	        Scanner sc =   new Scanner(System.in);
	        
	         marks =   sc.nextInt();
	         
	          if(marks>=33){
	        	  System.out.println("congratulations you pass ");
	          }else {
	        	  
	        	  System.out.println("you failed better luck next time ");
	          }
}
}
