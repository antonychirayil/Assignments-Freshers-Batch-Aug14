package Assigment1;

import java.util.Scanner;
public class SPandCP {

	public static void main(String[] args) {
		double pr, rate, t, SI,CI;
		
	    Scanner sc =new Scanner (System. in);
	    
	    System.out.println("Enter the amount:");
	    pr=sc.nextDouble();
	    
	    System. out. println("Enter the No.of years:");
	    t=sc.nextDouble();
	    
	    System. out. println("Enter the Rate of  interest");
	    rate=sc.nextDouble();
	    sc.close();
	    
	    SI=(pr * t * rate)/100;
	    
	    CI=pr * Math.pow(1.0+rate/100.0,t) - pr;
	    
	    System.out.println("Simple Interest="+SI);
	    
	    System.out. println("Compound Interest="+CI);

	}

}
