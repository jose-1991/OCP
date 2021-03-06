package java8Date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class EjecucionPeriod {
    public static void main(String[] args) {
        LocalDate fecha1 = LocalDate.of(2011,9,23);
        LocalDate fecha2 = LocalDate.of(2020,11,25);

        LocalDateTime lunes = fecha1.atStartOfDay();
        System.out.println("lunes = " + lunes);

        LocalDate fecha3 = fecha2.withMonth(12);

        Period periodo = Period.between(fecha1,fecha3);

        System.out.println(periodo);

        System.out.printf("Periodo entre %s y %s hay %d años, %d meses y %d dias"
                ,fecha1,fecha3,periodo.getYears(),periodo.getMonths(),periodo.getDays());

    }
}
