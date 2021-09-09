package Assignment4;


import java.util.Scanner;
public class q1 {
		   public static void main(String[] args) {
		      int a = 0, b = 0 ;
		      System.out.println("Get a:");
		      Scanner s= new Scanner(System.in);
		      a = s.nextInt();
		      System.out.println("Get b:");
		      b = s.nextInt();
		      	      
		      int c = 0;
		      try {
		         c = b/a;
		      } catch (ArithmeticException e) {
		         e.printStackTrace();
		         System.out.println("ArithmeticException is handled. But take care of the variable \"c\"");
		      }
		      System.out.println("Value of c :"+ c);
		      s.close();
		   }
		}

