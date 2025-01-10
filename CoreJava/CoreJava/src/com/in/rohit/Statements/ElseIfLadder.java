package com.in.rohit.Statements;

import java.util.Scanner;

public class ElseIfLadder {
	//else if ladder 
	 public static void main(String[] args) {
		 int marks ; 
		 
		 System.out.println("enter your marks");
		 
		    Scanner  sc =  new Scanner(System.in);
		    
		      marks =   sc.nextInt();
		      
		      
		      if(marks> 85){
		    	 System.out.println("your are topper"); 
		      }else if (marks <=85 && marks >=65){
		    	  System.out.println("your  are in first divsion");
		      }else if(marks <=65 && marks >=45) {
		    	  System.out.println("your are in second divsion");
		      }else if(marks <=45 && marks >=33) {
		    	  System.out.println("your are in third division");
		      }else {
		    	  System.out.println("sorry your are failed better luck next time");
		      }
	}

}
