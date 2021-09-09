package Assigment1;

import java.util.Scanner;

public class LoginPwd {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String str = "antony";
		String pas = "1234";
		while(count<3) {
			System.out.println("Enter the userID:");
			Scanner sc = new Scanner (System.in);
			String uname= sc.nextLine();
			System.out.println("Enter the pass:");
			String pwd= sc.nextLine();
			if((uname.equalsIgnoreCase(str))&&(pwd.equals(pas)))
			{
				System.out.println("Welcome");
				sc.close();
				return;
			}
			else{
				count++;	
				
				}
			
		}
		 if(count==3) {
			System.out.println("Contact admin");
			}	
	}
}
