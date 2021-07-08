package apiStream;

import apiStream.modelos.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjecucionStreamFilterSingleOptional {
    public static void main(String[] args) {


        Stream<Usuario> nombres = Stream
                .of("Andres Gomez", "Jose Flores", "Javier Gomez", "Soledad Rojas", "Jose Cespedes")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(e -> e.getNombre().equals("Jose")); // filtra solo las coincidencias


        Optional<Usuario> usuario = nombres.findFirst();
//        System.out.println(usuario.orElse(new Usuario("Raul", "Chambi")));
//        System.out.println(usuario.orElseGet(() -> new Usuario("Jhonny", "Diaz")));

        if (usuario.isPresent()){
            System.out.println(usuario.get());
        }else {
            System.out.println("no se encontro el objeto!");
        }


    }
}
