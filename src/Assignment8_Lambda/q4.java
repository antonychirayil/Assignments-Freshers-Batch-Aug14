package Assignment8_Lambda;

import java.util.ArrayList;
import java.util.List;

public class q4 {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>();

        list1.add("hi");
        list1.add("this is ");
        list1.add("a");
        list1.add("beautiful world");
        list1.add("Lets ");
        list1.add("Preserve the world");
        list1.add("today or there will be no tomorrow");
        list1.removeIf(s->s.length()%2!=0);

        list1.forEach(System.out::println);

    }

}