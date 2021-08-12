package udemyTest.test1;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ApiTime {
    public static void main(String[] args) {
        LocalTime t1 = LocalTime.now();
        LocalDateTime t2 = LocalDateTime.now();
        System.out.println(Duration.between(t1, t2));
    }
}
