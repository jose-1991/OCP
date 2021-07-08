package apiStream;

import apiStream.modelos.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamListToStream {
    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Andres", "Guzman"));
        lista.add(new Usuario("Diego", "Martinez"));
        lista.add(new Usuario("Martha", "Martinez"));
        lista.add(new Usuario("Jorge", "Taboada"));
        lista.add(new Usuario("Miguel", "Perez"));
        lista.add(new Usuario("Jairo", "Rojas"));
        lista.add(new Usuario("Martha", "Campos"));
        lista.add(new Usuario("Martha", "Romero"));


        Stream<String> nombres = lista.stream()
                .map(u -> u.getNombre().toUpperCase()
                        .concat(" ")
                        .concat(u.getApellido().toUpperCase()))
                .flatMap(nombre -> {
                    if (nombre.contains("martha".toUpperCase())){
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .map(String::toLowerCase)
                .peek(System.out::println);
        System.out.println(nombres.count());
    }
}
