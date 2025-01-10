package com.in.tech.Method;

public class ReturnmultipleTest {
	
	  public static ReturnMultipleValue dispaly(int x ,String fname) {
		return   new  ReturnMultipleValue(x +10 , fname  + "rajput");
		  
	  }
	  
	  public static void main(String[] args) {
		
		  ReturnMultipleValue  mtest = dispaly(10, "ROHIT") ;
		  
		  
		  System.out.println(mtest.age);
		  System.out.println(mtest.name);
	}

}
