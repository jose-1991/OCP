package java8Date_time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class EjecucionZonedDateTime {
    public static void main(String[] args) {

        LocalDateTime fechaLocal = LocalDateTime.parse("2021/09/23 12:45"
        , DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));

        ZoneId newYork = ZoneId.of("America/New_York");
//        ZonedDateTime zonaNY = ZonedDateTime.of(fechaLocal, ZoneOffset.of("-04:00"));
        ZonedDateTime zonaNY = fechaLocal.atZone(ZoneOffset.of("-04:00"));
        System.out.println("Horario de partida en New York: "+ zonaNY);

//        ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime zonaMadrid = zonaNY.withZoneSameInstant(ZoneOffset.of("+02:00")).plusHours(8);
        System.out.println("Hora de llegada en Madrid: "+ zonaMadrid);

        DateTimeFormatter f =  DateTimeFormatter.ofPattern("HH:mm dd MMM yyyy");
        System.out.println("Detalles del viaje a España: ");
        System.out.println("partida NY: " + f.format(zonaNY));
        System.out.println("Llegada a Madrid: "+ f.format(zonaMadrid));

        ZoneId.getAvailableZoneIds().forEach(System.out::println);
    }
}
