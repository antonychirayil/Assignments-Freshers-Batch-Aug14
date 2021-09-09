package Assignment8_Lambda;

import java.util.HashMap;
import java.util.Set;

public class q7 {

    public static void main(String[] args) {

        HashMap<Integer,String > hm = new HashMap<>();

        hm.put(1,"first");
        hm.put(2,"second");
        hm.put(3,"third");
        hm.put(4,"fourth");
        hm.put(5,"fifth");

        Set s = hm.entrySet();
        StringBuilder str = new StringBuilder();

        s.forEach(str1->str.append(str1));

        System.out.println(str);

    }
}