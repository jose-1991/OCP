package apiStream;

import apiStream.modelos.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjecucionStreamDistinctUsuarioSum {
    public static void main(String[] args) {


        IntStream nombres = Stream
                .of("Andres Gomez", "Jose Flores", "Javier Gomez", "Soledad Rojas", "Jose Cespedes", "Soledad Rojas", "Soledad Rojas")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct()
                .mapToInt(u -> u.toString().length())
                .peek(System.out::println);


        IntSummaryStatistics stats = nombres.summaryStatistics();
        System.out.println("total: " + stats.getCount());
        System.out.println("maximo: " + stats.getMax());
        System.out.println("minimo: " + stats.getMin());
        System.out.println("promedio: " + stats.getAverage());


    }
}
