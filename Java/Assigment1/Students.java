package Assigment1;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] st1 = new int[] {55,92,54};
		int[] st2 = new int[] {65,72,84};
		int[] st3 = new int[] {75,62,44};
		
		int tot1=0,tot2=0,tot3=0;
		int avg1 =0;
		
		for(int i =0; i<3;i++)
		{
			
			tot1 += st1[i];
			
			
			tot2 += st2[i];
			
			
			tot3 += st3[i];
			
			
		}
		System.out.println("For the first student:"+tot1);
		System.out.println("Forthe secondstudent:"+tot2);
		System.out.println("For the Third stud:"+tot3);
		avg1=tot1/3;
		int avg2=tot2/3;
		int avg3=tot3/3;
		System.out.println("student 1 avg :"+avg1);
		System.out.println("student 2 avg :"+avg2);
		System.out.println("student 2 avg :"+avg3);
		
	}

}
