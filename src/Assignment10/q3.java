package Assignment10;

import java.util.ArrayList;
import java.util.Arrays;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			  
	        String str = "A quick brown fox jumps over the lazy dog";
	  
	        // split string by no space
	        String[] strSplit = str.split("");
	  
	        // Now convert string into ArrayList
	        ArrayList<String> strList = new ArrayList<String>(
	            Arrays.asList(strSplit));
	  
	        // Now print the ArrayList
	        for (String s : strList)
	            System.out.println(s);
	                   
			/*
			 * // Java 11 List<String> list = Arrays.asList("foo","bar","baz"); String[]
			 * array = list.toArray(String[]::new);
			 * 
			 * // The above is equivalent to: String[] array2 = list.toArray(new String[0]);
			 * System.out.println("List to Array example in Java 11:");
			 */
	            	            
	            // new method
	            String[] array2 = strList.toArray(String[]::new);
	            System.out.println(Arrays.toString(array2));
	        }
	    

	}


