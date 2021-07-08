package apiStream;

import apiStream.modelos.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjecucionStreamMap {
    public static void main(String[] args) {


        Stream<Usuario> nombres = Stream
                .of("Andres Gomez", "Jose Flores", "Javier Gomez", "Soledad Rojas")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)  //inspecciona internamente
                .map(usuario -> {
                    String nombre = usuario.getNombre().toUpperCase();
                    usuario.setNombre(nombre);
                    return usuario;
                });

        //nombres.forEach(System.out::println);
        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);




    }
}
