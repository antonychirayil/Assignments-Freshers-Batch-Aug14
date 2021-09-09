package Assignment8_Lambda;

import java.util.ArrayList;
import java.util.List;

public class q6 {

    public static void main(String[] args) {
    	//uses replace All 

        List<String> list= new ArrayList<>();
        list.add("This");
        list.add("is ");
        list.add("an example");
        list.add("of lower to upper");
        list.add("case");

        System.out.println("Before using replaceALL:");
        System.out.println(list);

        list.replaceAll(str->str.toUpperCase());
        System.out.println("After using replace all: ");
        System.out.println(list);
    }

}