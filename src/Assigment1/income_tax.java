package Assigment1;
import java.util.Scanner;

public class income_tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the salary");
		int salary= sc.nextInt();
		sc.close();
		int tax;
		if (salary>0 && salary<=180000)
			System.out.println("No tax- NIL");
		else if (salary>181000 && salary<=300000)
			{tax= salary*10/100;
			System.out.println("Tax is:"+tax);
			}
		else if (salary>300000 && salary<=500000)
		{tax= salary*20/100;
		System.out.println("Tax is:"+tax);
		}
		else if (salary>500000 && salary<=1000000)
		{tax= salary*30/100;
		System.out.println("Tax is:"+tax);
		}
		else {
			System.out.println("Enter again");
		}
	}
		
}
