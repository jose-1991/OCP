package apiStream;

import apiStream.modelos.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjecucionStreamReduce {
    public static void main(String[] args) {


        Stream<String> nombres = Stream
                .of("Andres Gomez", "Jose Flores", "Javier Gomez", "Soledad Rojas", "Jose Cespedes");


       String resultado = nombres.reduce("resultado es", (a,b) -> a+" : "+b);
        System.out.println(resultado);




    }
}
