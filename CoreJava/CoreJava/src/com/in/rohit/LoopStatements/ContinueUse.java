package com.in.rohit.LoopStatements;

public class ContinueUse {
	public static void main(String[] args) {
		
	//while 
	
	 int i = 0 ;
	   while(i<=10) {
	    if(i==5) {
   i++ ;
   continue  ;
	    
	    }
	    System.out.println(i);
	    i++;
	   }
	   //forloop
	   for(int a =0 ;a<10;a++) {
		   if(a==5) {
			   continue ;
		   }
		   System.out.print(a);
	   }
}
}