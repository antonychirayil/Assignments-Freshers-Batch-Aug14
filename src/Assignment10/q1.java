package Assignment10;
interface SimpleInterest{  
    int si(int p,int r, int t);  
}  
  
public class q1 {
	 public static void main(String[] args) {  
         
	        // Multiple parameters in lambda expression  
	        SimpleInterest ad1=(int p, int r,int t)-> (p*r*t/100);  
	        System.out.println(ad1.si(1000,10,(int) 2.4));  
	          
}
}
