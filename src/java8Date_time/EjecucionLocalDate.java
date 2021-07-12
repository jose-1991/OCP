package java8Date_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EjecucionLocalDate {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        System.out.println("fechaActual = " + fechaActual);
        System.out.println("Dia: " + fechaActual.getDayOfMonth());
        Month mes = fechaActual.getMonth();
        System.out.println("mes = " + mes);
        System.out.println("Numero del mes = " + mes.getValue());
        System.out.println("Mes spanish = " + mes.getDisplayName(TextStyle.FULL, new Locale("es","ES")));
        System.out.println("Mes: " + fechaActual.getMonth());

        System.out.println("Año: " + fechaActual.getYear());
        System.out.println("Dia del año: " + fechaActual.getDayOfYear());
        System.out.println("Era: " + fechaActual.getEra());

        fechaActual = LocalDate.of(2020, 12, 25);
        System.out.println("fechaActual = " + fechaActual);

        fechaActual = LocalDate.of(2020, Month.DECEMBER, 25);
        System.out.println("fechaActual = " + fechaActual);

        fechaActual = LocalDate.parse("2020-02-01");
        System.out.println("fechaActual = " + fechaActual);

        LocalDate diaDeManiana = LocalDate.now().plusDays(1);
        System.out.println("diaDeManiana = " + diaDeManiana);

        LocalDate mesAnterior = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("mesAnterior = " + mesAnterior);

        DayOfWeek diaSemana= LocalDate.parse("2021-07-12").getDayOfWeek();
        System.out.println("diaSemana = " + diaSemana);
        System.out.println("Numero del dia: " + diaSemana.getValue());

        int diaMes = LocalDate.of(2021,7,12).getDayOfMonth();
        System.out.println("diaMes = " + diaMes);

        boolean esBisiesto = LocalDate.now().isLeapYear();
        System.out.println("esBisiesto = " + esBisiesto);

        boolean esAntes = LocalDate.of(2020,7,13).isBefore(LocalDate.parse("2020-07-10"));
        System.out.println("esAntes = " + esAntes);

        boolean esDespues = LocalDate.now().isAfter(LocalDate.now().minus(3,ChronoUnit.DAYS));
        System.out.println("esDespues = " + esDespues);






    }
}
