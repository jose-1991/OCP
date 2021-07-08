package apiStream;

import java.util.stream.Stream;

public class EjecucionStreamDistinct {
    public static void main(String[] args) {


        Stream<String> nombres = Stream
                .of("Andres Gomez", "Jose Flores", "Javier Gomez", "Soledad Rojas", "Jose Cespedes", "Soledad Rojas", "Soledad Rojas", "Soledad Rojas")

                .distinct(); // no permite duplicados

        nombres.forEach(System.out::println);


    }
}
