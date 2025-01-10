package com.in.rohit.Excersize;

import java.util.Scanner;

public class EligbleForVote {
	
	
	 public static void main(String[] args) {
		int age ;
		
		System.out.println("Enter Your Age");
		
		Scanner sc = new Scanner(System.in);
		
		   age = sc.nextInt();
		   
		   if(age>=18) {
			   System.out.println("your Eligble For Vote");
		   }else {
			  System.out.println("you can not vote Because Your are under age 18");   
		   }
	}

}
