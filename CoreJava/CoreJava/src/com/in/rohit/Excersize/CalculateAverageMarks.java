package com.in.rohit.Excersize;

import java.util.Scanner;

public class CalculateAverageMarks {
	
	 public static void main (String [] args) {
		 
		 int a ,b,c,d,e ; 
		 
		 System.out.println("Enter marks of subject");
		 
		 Scanner sc = new Scanner(System.in ) ;
		 
		 System.out.print("enter chemistry marks");
		 a =sc.nextInt();
		 System.out.print("enter physics marks");
		   b= sc.nextInt();
		 System.out.print("enter maths marks");
		 c=sc.nextInt();
		 System.out.print("enter English marks");
		 d= sc.nextInt();
		 System.out.print("enter Hindi marks");
         e = sc.nextInt();
           
           int sum = a+b+c+d+e ;
           
           System.out.println("total marks " + sum);
           
           double average = sum/5.0 ; 
		   System.out.println(   "Total marks " +average);
	 }

}

