package apiStream;

import apiStream.modelos.Usuario;

import java.util.stream.Stream;

public class EjecucionStreamFilterCount {
    public static void main(String[] args) {


        long count = Stream
                .of("Andres Gomez", "Jose Flores", "Javier Gomez", "Soledad Rojas", "Jose Cespedes")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .count();


        System.out.println(count);




    }
}
