package Assigment1;


import java.util.Scanner;

public class resultdeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int subj1,subj2,subj3;
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the marks of sub1:");
		subj1= sc.nextInt();
		
		System.out.println("Enter the marks of sub2:");
		subj2 = sc.nextInt();
		
		System.out.println("Enter the marks of sub3:");
		subj3=sc.nextInt();
		
		sc.close();
			if(subj1>=60 && subj2>=60 && subj3>=60)
				System.out.println("Passed");
					
			else if ((subj1>60 && subj2>60)||(subj2>60 && subj3>60)||(subj3>60 && subj1>60))
				System.out.println("Promoted");
			else
			{
				System.out.println("Failed");
			}
	}

}
