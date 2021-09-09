package Assignment6_Collections;

import java.util.TreeSet;
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<employee> obj=new TreeSet<>(new FirstComparator());
		obj.add(new employee(1,"milan",41000.0,"Com"));
		obj.add(new employee(2,"vila",63000.0,"Spain"));
		obj.add(new employee(3,"archerr",77000.0,"TVm"));
		obj.add(new employee(4,"mane",8222.0,"Liverpool"));
		obj.add(new employee(5,"messi",56666.0,"Psg"));
		obj.add(new employee(6,"CR7",200000.0,"Portugal"));
		obj.add(new employee(7,"sancho",22000.0,"England"));
		obj.add(new employee(8,"Neymer",9000.0,"Brazil"));
		obj.add(new employee(9,"Kane",6000.0,"Tottenham"));
		obj.add(new employee(10,"Greize",30000.0,"France"));
		
		for(employee e :obj) {
			System.out.println(e);
		}
		
		//System.out.println("select the options:\n");
	
		//System.out.println("a) id: " );
	}

}




