 import java.util.Scanner ; 


   public class Scan{
    
    public static void main(String[] args){
   int a,b;
  System.out.println("Etnter numbers");

     Scanner sc = new Scanner(System.in);


    a = sc.nextInt();
    b = sc.nextInt();
    

        System.out.println("Addtition" + (a+b));
    System.out.println("Multiplication " + (a*b));
	     System.out.println("Substraction " + (a-b));
	     System.out.println("Division " + (a/b));
	     System.out.println("Remainder " + (a%b));
	    
   


}






   }