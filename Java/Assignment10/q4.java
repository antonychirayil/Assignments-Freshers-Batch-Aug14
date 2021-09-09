package Assignment10;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;


public class q4 {

    public static void main(String[] args) throws IOException {
        var path = "C:\\Users\\DELL\\Downloads\\Java11Assignments_StudentList";
        try {
            String names=Files.readString(Path.of(path));
            //names.split("\\r?\\n");
            ArrayList<String > namelist = new ArrayList<>(Arrays.asList(names));

            System.out.println(namelist);

            namelist.forEach(p->p.trim());

            System.out.println("-----------------------------");
            System.out.println(namelist.get(1));

            /*for (String s:names1
                 ) {
                s.replace("\s+","");
            }
*/
            //System.out.println(str2[3]);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}