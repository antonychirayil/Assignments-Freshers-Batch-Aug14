package Assignment6_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class q2 {

	public static void main(String[] args) {
		ArrayList<String> o=new ArrayList<>();
		o.add("Hurry");
		o.add("Worry");
		o.add("Curry");
		o.add("Sorry");
		o.add("Lorry");
		o.add("Blurry");
		o.add("Starry");
		o.add("Flurry");
		
		HashSet<String> set=new HashSet<String>(o);
		set.add("Hurry");
		set.add("Furry");
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}