package whizlabTest;

import java.time.Duration;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Whizlab {
    public static void main(String[] args) {



        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        System.out.println(list.set(3,"3"));

        LocalDateTime ld = LocalDateTime.of(2010,10,10,12,10);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("D");
        System.out.println(ld.format(format));


        Duration due = Duration.of(1, ChronoUnit.HALF_DAYS);
        due = due.plus(60,ChronoUnit.MINUTES);
        System.out.println(due.minus(due));

        Period p = Period.of(1,2,3);
        System.out.println(p.get(ChronoUnit.MONTHS));


    }
}
