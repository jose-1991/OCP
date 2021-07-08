package apiStream;

import apiStream.modelos.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjecucionStreamDistinctUsuario {
    public static void main(String[] args) {


        Stream<Usuario> nombres = Stream
                .of("Andres Gomez", "Jose Flores", "Javier Gomez", "Soledad Rojas", "Jose Cespedes", "Soledad Rojas", "Soledad Rojas")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct();


        nombres.forEach(System.out::println);




    }
}
