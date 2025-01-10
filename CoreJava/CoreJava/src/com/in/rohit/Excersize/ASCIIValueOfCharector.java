package com.in.rohit.Excersize;

import java.util.Scanner;

public class ASCIIValueOfCharector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 char ch ;  
		 
		 System.out.println("Enter cheractor ");
		 
		           Scanner sc =   new Scanner(System.in);
		           
		               ch = sc.next().charAt(0);
		               
		               int  a = ch ; //convert String value in to Integer value
		               
		               System.out.println("ASCII Value Of " + ch  +" is  " + a);

	}

}
