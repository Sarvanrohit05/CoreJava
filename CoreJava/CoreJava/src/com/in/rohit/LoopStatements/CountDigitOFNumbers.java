package com.in.rohit.LoopStatements;

public class CountDigitOFNumbers {
	
	public static void main(String[] args) {
		  int  n = 635794346 ; 
		  int res = 0 ;
		   while(n>0) {
			   n =  n/10 ;
			   res ++;
		   }
		   System.out.println(res);
	}

}
