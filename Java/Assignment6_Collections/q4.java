package Assignment6_Collections;
import java.time.LocalDate;
import java.util.LinkedList;

public class q4 {
    public static void main(String[] args) {
        LinkedList<LocalDate> Date = new LinkedList<>();
        Date.add(LocalDate.of(2011,6,13));
        Date.add(LocalDate.of(2015,10,05));
        Date.add(LocalDate.of(2023,12,23));
        Date.add(LocalDate.of(2024,1,04));
        Date.add(LocalDate.of(2000,02,17));
        //System.out.println(BirthDates);
        for (LocalDate d:Date)
        {
            if(d.isLeapYear())
                System.out.println(d+" is a leap year...! \n");
            else
                System.out.println(d+" is not a leap year...!");

        }
    }
}