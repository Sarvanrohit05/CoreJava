package com.in.tech.Method;

public class StatementMethod {
	
	public static void  age (int gen) {
		
		if(gen>=1996 &&gen<=2009) {
			System.out.println("your are in a generation Z ");
		}
		if(gen>=2010 &&gen<=2025) {
			System.out.println("your are in genration alpha");
		}
		
		if (gen>=2026 && gen <=2039) {
			System.out.println("your are in a generation beta");
		}
		else	 if  (gen> 2039) {
			System.out.println("your are in a coming genration");
		}
		 else {
			 System.out.println("your are in old genration");
		 }
		 
		
	}

}
