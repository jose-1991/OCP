package apiStream;

import apiStream.modelos.Usuario;

import java.util.stream.Stream;

public class EjecucionStreamAnyMatch {
    public static void main(String[] args) {


        boolean existe = Stream
                .of("Andres Gomez", "Jose Flores", "Javier Gomez", "Soledad Rojas", "Jose Cespedes")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .anyMatch(e -> e.getId().equals(4));


        System.out.println(existe);


    }
}
