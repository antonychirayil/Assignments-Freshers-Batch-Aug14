package Assigment1;

public class armstrongcheck {

	public static void main(String[] args) {
		//Find out if the given number is an Armstrong number.
		//Logic: -if 153is the Supplied value, then 1**3+5**3+3**3=1+125+27=153 
		//This is the same as supplied value hence it is an Armstrong number.
        int num = 153, temp, rem, result = 0;

        temp = num;

        while (temp != 0)
        {
            rem = temp % 10;
            result += Math.pow(rem, 3);
            temp /= 10;
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
		
	}

}
