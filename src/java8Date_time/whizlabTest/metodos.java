package java8Date_time.whizlabTest;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class metodos {
    public static void main(String[] args) {
        System.out.println("===========  Duration  ===========");
        Duration due = Duration.ofDays(-3);
        LocalDate ld = LocalDate.of(2016, 12, 5);
        System.out.println(ld.plus(due.toDays(), ChronoUnit.DAYS));

        System.out.println("===========  atStartOfDay  ===========");
        Year y = Year.of(1991);
        LocalDate loc = y.atDay(32);
        LocalDateTime ldt = loc.atStartOfDay();
        System.out.println(ldt);

        System.out.println("============  MonthValue  ============");

        LocalDate date = LocalDate.of(2014, 2, 15);
        System.out.println(date.getMonthValue() + " : " + date.getDayOfWeek());

        System.out.println("============  Period  ============");
        Period p = Period.ofMonths(1);
        p = p.plusYears(2);
        p = p.withYears(1);
        System.out.println(p);

        System.out.println("============  now  ============");

        Year ye = Year.of(2018);
        Year year = ye.now();
        System.out.println(year);

        System.out.println("============  Formatter  ============");

        LocalDate ldt1 = LocalDate.of(2015,3,1);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d/MM/yyyy");
        System.out.println(ldt1.format(format));

        System.out.println("============  Truncated  ============");

        Instant now = Instant.now();
        now = now.truncatedTo(ChronoUnit.MINUTES);
        System.out.println(now);

    }
}
