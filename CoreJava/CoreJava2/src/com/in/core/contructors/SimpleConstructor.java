package com.in.core.contructors;

public class SimpleConstructor {
	
	 int a ; 
	 String name ;
	 
	
	  SimpleConstructor() { // TODO Auto-generated constructor stub
	  
	  a = 0 ; name = null ; }
	  
	 void show(){
		 System.out.println(a + " " + name);
	 }
	  
	 
	 public static void main(String[] args) {
		    
		 
		    SimpleConstructor sc =   new SimpleConstructor();
		    
		    sc.show();
	}
}
