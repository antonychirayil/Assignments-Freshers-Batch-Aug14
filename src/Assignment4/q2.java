package Assignment4;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		try {
		 int a = 0, b = 0 ;
	      System.out.println("Get a:");
	      Scanner s= new Scanner(System.in);
	      a = s.nextInt();
	      System.out.println("Get b:");
	      b = s.nextInt();
	      	      
	      int c = 0;
	      
	         
	         if(a==0) {
					throw new UnsupportedOperationException("0 Cannot be used here. Change value");
				}
	         c = b/a;
	         System.out.println("Value of c :"+ c);
		}
	       catch (ArithmeticException e) {
	         e.printStackTrace();
	         System.out.println("ArithmeticException is handled.");
	      }
	      catch (UnsupportedOperationException f) {
	    	  	System.out.println("Error: "+f.getMessage());
		         f.printStackTrace();
		         System.out.println("Exception handled");
	      
	      
	}

}
}
