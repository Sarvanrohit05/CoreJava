package com.in.rohit.Excersize;

import java.util.Scanner;

public class CalculateSalleryTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  int salary  ; double tax  ; 
		  
		  System.out.println("Enter Your Sallery ");
		   Scanner sc = new Scanner( System.in);
		     salary = sc.nextInt();
		     
		/*  //simple ways 
		 * if(salary> 40000 && salary <=70000) {
		 * System.out.println("pay 10% tax of your salary"); }if(salary >70000 &&
		 * salary<=150000) { System.err.println("pay 20% tax of your salary"); }else
		 * if(salary>150000 &&salary<=300000) {
		 * System.out.println("pay 28% tax of your salary"); }else {
		 * System.out.println("your salary is very low you dont pay any taxes"); }
		 */
	  
		     //second way with percentage 
		     
		     if(salary<=20000) {
		    	System.out.println(  salary +"you dont pay have any taxes"); 
		     }else if (salary>= 20000 && salary <=100000) {
		    	            tax =salary*0.10;
		    	            System.out.println(  salary + " is your and salary and you pay: " + tax + "  you pay 10% tax");
		     }else {
		    	 
		    	 tax =salary*0.20;
 	            System.out.println(  salary + " is your and salary : " + tax + " and you pay 10% tax");
 
		     }
		     
	}

}
