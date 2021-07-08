package apiStream;

import apiStream.modelos.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjecucionStreamFilterSingle {
    public static void main(String[] args) {


        Usuario usuario = Stream
                .of("Andres Gomez", "Jose Flores", "Javier Gomez", "Soledad Rojas", "Jose Cespedes")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(e -> e.getId().equals(4)) // filtra solo las coincidencias
                .findFirst().get();

        System.out.println(usuario);


    }
}
