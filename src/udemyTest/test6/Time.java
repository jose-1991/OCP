package udemyTest.test6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) {
        System.out.println(LocalDate.of(2018, 6, 6)
                .plus(Period.parse("P9M")));

        LocalDate valDay = LocalDate.of(2018, 2, 14);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD-MM-uuuu");
        System.out.println(valDay.format(formatter));

        LocalDateTime dt = LocalDateTime.parse("2018-03-16t10:15:30.22");
        System.out.println(dt);
    }
}
