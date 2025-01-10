package com.in.rohit.Excersize;

import java.util.Scanner;

public class CheractorPrint {

	
	 public static void main(String[] args) {
		  char ch ; 
		  
		  System.out.println("Enter cherector ");
	                  Scanner sc = new Scanner(System.in);
	                  
	                    ch = sc.next().charAt(0) ;//vo cherector  print  of 0 postion par ho ya ek kar dete hai to jo ek par hoga vo print hoga
	                    System.out.println(ch);
	 
	 }
}
