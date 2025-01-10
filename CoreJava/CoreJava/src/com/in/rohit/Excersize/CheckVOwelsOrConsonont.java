package com.in.rohit.Excersize;

import java.util.Scanner;

public class CheckVOwelsOrConsonont {
	
	
	 public static void main(String[] args) {
		
		   char ch ; 
		   
		   
		    System.out.println("enter your cherector");
		    
		         Scanner sc =    new Scanner(System.in);
		         
		         
		            ch  =   sc.next().charAt(0);
		            
		            if(ch=='a'||ch=='A'||ch=='e'||ch=='E' || ch=='o'||ch=='O'||ch=='u'|| ch =='U' ||ch=='i' ||ch=='I'){
		            	
		            	System.out.println("Vowels"); //inme se koi bhi cherector 0 par atA H TO  ye message print 
		            	
		            }else {
		            	
		            	System.out.println("consonent");
		            	
		            }
	}

}
