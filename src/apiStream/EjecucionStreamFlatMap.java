package apiStream;

import apiStream.modelos.Usuario;

import java.util.stream.Stream;

public class EjecucionStreamFlatMap {
    public static void main(String[] args) {


        Stream<Usuario> nombres = Stream
                .of("Andres Gomez", "Jose Flores", "Javier Gomez", "Soledad Rojas", "Jose Cespedes")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .flatMap(u -> {
                    if (u.getNombre().equalsIgnoreCase("jose")){
                        return Stream.of(u);
                    }
                    return Stream.empty();
                })  // retorna un Stream por cada valor;
                .peek(System.out::println);  //inspecciona internamente


//        nombres.forEach(System.out::println);

        System.out.println(nombres.count());




    }
}
