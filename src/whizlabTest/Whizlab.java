package whizlabTest;

import java.time.*;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

public class Whizlab {
    private AtomicInteger value = new AtomicInteger(10);

    public static void main(String[] args) {
        System.out.println("========== AtomicInteger ==========");
        Whizlab wh = new Whizlab();
        System.out.println(wh.value.addAndGet(5));
        wh.value.weakCompareAndSet(10,15);
        System.out.println(wh.value.intValue());

        System.out.println("========== List ==========");
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("2");
       // list.add("4");
       // System.out.println(list.set(3,"3"));
        list.parallelStream().distinct().peek(System.out::println).count();

        System.out.println("========== DateTimeFormatter ==========");
        LocalDateTime ld = LocalDateTime.of(2010,10,10,12,10);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("D");
        System.out.println(ld.format(format));

        System.out.println("========== Duration ==========");
        Duration due = Duration.of(1, ChronoUnit.HALF_DAYS);
        due = due.plus(60,ChronoUnit.MINUTES);
        System.out.println(due.minus(due));

        System.out.println("========== Period ==========");
        Period p = Period.of(1,2,3);
        System.out.println(p.get(ChronoUnit.MONTHS));

        System.out.println("========== ZoneId ==========");
        Map zid = ZoneId.SHORT_IDS;
        zid.put("AET", "Australia/Sydney");
        ZoneId z = ZoneId.of("AET",zid);
        System.out.println(z);




    }
}
