package udemyTest.test2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

interface StringConsumer extends Consumer<String> {
    @Override
    public default void accept(String s) {
        System.out.println(s.toUpperCase());
    }
}

public class Lambdas {

    public static void main(String[] args) {

        StringConsumer consumer = new StringConsumer() {
            @Override
            public void accept(String s) {
                System.out.println(s.toLowerCase());
            }
        };
        List<String> list = Arrays.asList("Dr", "Mr", "Miss", "Mrs");
        list.forEach(consumer);
        BiFunction<Integer, Integer, Character> compFunc = (i, j) -> (char) (i + j);
        System.out.println(compFunc.apply(0, 65));

        LocalDate date = LocalDate.of(2018, 11, 4);
        LocalTime time = LocalTime.of(1, 59, 59);
        ZonedDateTime dt = ZonedDateTime.of(date, time, ZoneId.of("America/New_York"));
        dt = dt.plusSeconds(1);
        System.out.println(dt.getHour() + ":" + dt.getMinute() + ":" + dt.getSecond());
    }
}
