package java8Date_time;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class EjecucionDuration {
    public static void main(String[] args) {
        LocalDateTime fecha1 = LocalDateTime.now();
        //fecha1 = fecha1.withHour(20);

        LocalDateTime fecha2 = LocalDateTime.now().plusHours(3).plusMinutes(20).plusDays(1);
        Duration lapsus = Duration.between(fecha1, fecha2);
        System.out.println("lapsus = " + lapsus);
        System.out.println("en minutos: " + lapsus.toMinutes());
        System.out.println("en segundos: " + lapsus.getSeconds());


        System.out.println("=============== Instant");


        Instant i1 = Instant.now();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Instant i2 = Instant.now();

        Duration tiempo = Duration.between(i1, i2);
        System.out.println("timepo = " + tiempo);
    }
}
