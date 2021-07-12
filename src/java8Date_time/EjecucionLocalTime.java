package java8Date_time;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EjecucionLocalTime {
    public static void main(String[] args) {

        LocalTime ahora = LocalTime.now();
        System.out.println(ahora);

        System.out.println("Hora: "+ ahora.getHour());
        System.out.println("Minutos: "+ ahora.getMinute());
        System.out.println("Segundos: "+ ahora.getSecond());

        LocalTime seistreinta = LocalTime.of(6,30,59);
        System.out.println(seistreinta);

        seistreinta = LocalTime.parse("06:30");
        System.out.println("seistreinta = " + seistreinta);

        LocalTime sieteTreinta = LocalTime.of(6,30).plus(1, ChronoUnit.HOURS);
        System.out.println("sieteTreinta = " + sieteTreinta);

        boolean esAnterior = LocalTime.of(6,30,59).isBefore(LocalTime.parse("07:30"));
        System.out.println("esAnterior = " + esAnterior);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String ahoraFormateado = seistreinta.format(df);
        System.out.println(ahoraFormateado);

        ahoraFormateado = df.format(ahora);
        System.out.println("ahoraFormateado = " + ahoraFormateado);

        LocalTime max = LocalTime.MAX;
        LocalTime min = LocalTime.MIN;

        System.out.println("max = " + max);
        System.out.println("min = " + min);




    }
}
