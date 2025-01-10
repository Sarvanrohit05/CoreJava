package com.in.tech.Method;

import java.util.Scanner;

public class StatementTest {
	
	
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("plaese insert the year of birth ");
		 sc.nextInt();
		    StatementMethod test = new StatementMethod() ; 
		    
		    test.age(2030);
		    
		    sc.close();
	}

}
