package udemyTest.test5;

import java.text.NumberFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Locale;

public class ApiTime {
    public static void main(String[] args) {
        Locale loc = new Locale("en", "US");
        NumberFormat nf = NumberFormat.getCurrencyInstance(loc);
        System.out.printf("Amount %s is in %s" , nf.format(10), nf.getCurrency());


        System.out.println("=========  Duration  =========");
        LocalDate date1 = LocalDate.of(2019, 1, 1);
        Duration d = Duration.ofDays(1);
        System.out.println(date1.plus(d));
    }
}
