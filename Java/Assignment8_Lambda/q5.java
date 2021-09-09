package Assignment8_Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class q5 {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("New-born");
        list1.add("Trouble");
        list1.add("Of");
        list1.add("New");
        list1.add("York\n");
        Consumer<List<String>> displaylist = list->list.forEach(System.out::println);
        System.out.println("list elements: ");
        displaylist.accept(list1);
        StringBuilder s1 = new StringBuilder();
        Consumer<List<String>> modify = list2->list2.forEach(s ->s1.append(s.charAt(0)));
        modify.accept(list1);

        System.out.println("String with first letter of list elements:");
        System.out.println(s1);


    }
}