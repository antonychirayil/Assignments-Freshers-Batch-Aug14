package Assignment10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class q4 {

    public static void main(String[] args) {

    	    
    	    	int count=0;
    	        try {
    	            Scanner scanner = new Scanner(new File("C:\\Users\\DELL\\eclipse-workspace\\Java Assignments\\Java\\Assignment10\\Java11Assignments_StudentList.txt"));


    	            while(scanner.hasNext())
    	            {
    	                String line = scanner.next();

    	                String Trim = line.trim();
    	             
    	                System.out.println(Trim);
    	   
    	                count=count+1;
    	            }
    	            System.out.println("No of students are:"+count);


    	        } 

    	        catch (FileNotFoundException e) {

    	            e.printStackTrace();
    	        }

    	    }

    	}