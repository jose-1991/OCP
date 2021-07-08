package apiStream;

import apiStream.modelos.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjecucionStreamFilterEmpy {
    public static void main(String[] args) {


        long count = Stream
                .of("Andres Gomez", "Jose Flores", "Javier Gomez", "Soledad Rojas", "Jose Cespedes", "", "")
                .filter(String::isEmpty) // e -> e.isEmpty
                .peek(System.out::println)
                .count(); // cuenta los objetos vacios

        System.out.println("count = " + count);


    }
}
