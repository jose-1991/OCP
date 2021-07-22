package java8Date_time.whizlabTest;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.temporal.ChronoUnit;



public class metodos {
    public static void main(String[] args) {
        System.out.println("===========  Duration  ===========");
        Duration due = Duration.ofDays(-3);
        LocalDate ld = LocalDate.of(2016,12,5);
        System.out.println(ld.plus(due.toDays(), ChronoUnit.DAYS));

        System.out.println("===========  atStartOfDay  ===========");
        Year y = Year.of(1991);
        LocalDate loc = y.atDay(32);
        LocalDateTime ldt = loc.atStartOfDay();
        System.out.println(ldt);
    }
}
