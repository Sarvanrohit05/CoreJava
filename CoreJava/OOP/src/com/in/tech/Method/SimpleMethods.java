package com.in.tech.Method;

public class SimpleMethods {
	
	
	  void mymethod() {
		  
		  System.out.println("method will be exectued");
		  
	  }
	  //we can multiple method using create a one object   
	    public static void main(String[] args) {
			SimpleMethods simple = new SimpleMethods() ;
			simple.mymethod();
			simple.mymethod();
			simple.mymethod();
		}

}