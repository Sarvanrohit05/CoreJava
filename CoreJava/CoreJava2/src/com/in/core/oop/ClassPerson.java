package com.in.core.oop;

public class ClassPerson {//class
	
	int age = 21 ;
	int weight = 60 ;
	 String color= "dark" ;

	 
	    void sleep () {
	    	System.out.println("im sleeping");
	    }
	    void eat () {
	    	System.out.println("im eating");
	    }
	    
	    public static void main(String[] args) {
			
	    	
	    	 ClassPerson cp = new ClassPerson();//object
	    	
	    	 System.out.println("properties ");
	    	 System.out.println(cp.age);
	    	 System.out.println(cp.color);
	    	 System.out.println(cp.weight);
	    	 
	    	 System.out.println("methods/behaviour");
	    	 
	    	 cp.eat();
	    	 cp.sleep();
		}
}
