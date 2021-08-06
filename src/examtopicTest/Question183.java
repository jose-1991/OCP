package examtopicTest;

import java.time.LocalDate;
import java.time.Month;

public class Question183 {

    public static void main(String[] args) {
        LocalDate valentinesDay =LocalDate.of(2015, Month.FEBRUARY, 14);
        LocalDate next15days = valentinesDay.plusDays (15);
        LocalDate nextYear = next15days.plusYears(1); // line n1
        System.out.println(nextYear);
    }
}
