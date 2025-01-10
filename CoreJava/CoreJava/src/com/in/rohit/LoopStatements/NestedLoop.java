package com.in.rohit.LoopStatements;

public class NestedLoop {
	
	  public static void main(String[] args) {
		  
		   int res = 0 ; // isliye ki pata chale loop kitni bar chala 
		  for(int i = 0 ;  i < 10 ; i ++) {
			  
			  for(int j = 0 ;  j<10; j++) {
				  res++;
			  }

		  }
		  System.out.println(res);


	}

}
