package apiStream;

import apiStream.modelos.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjecucionStreamFilter {
    public static void main(String[] args) {


        Stream<Usuario> nombres = Stream
                .of("Andres Gomez", "Jose Flores", "Javier Gomez", "Soledad Rojas", "Jose Cespedes")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(e -> e.getNombre().equals("Jose")) // filtra solo las coincidencias
                .peek(System.out::println);  //inspecciona internamente


        //nombres.forEach(System.out::println);
        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);




    }
}
