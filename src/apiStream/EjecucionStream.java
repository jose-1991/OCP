package apiStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjecucionStream {
    public static void main(String[] args) {

        System.out.println("===================Mediante  Stream.of");
        Stream<String> nombres = Stream.of("Andres", "Jose", "Javier", "Soledad");
        nombres.forEach(System.out::println);

        System.out.println("===================Mediante  un Arreglo");
        String[] arr = {"Andres", "Jose", "Javier", "Soledad"};
        Stream<String> name = Arrays.stream(arr);
        name.forEach(System.out::println);

        System.out.println("===================Mediante  Stream.<>builder");
        Stream<String> nombres2 = Stream.<String>builder()
                .add("Andres")
                .add("Jose")
                .add("Javier")
                .add("Soledad")
                .build();
        nombres2.forEach(System.out::println);

        System.out.println("===================Mediante  una Lista");
        List<String> lista = new ArrayList<>();
        lista.add("Andres");
        lista.add("Jose");
        lista.add("Javier");
        lista.add("Soledad");

        Stream<String> nombres3 = lista.stream();
        nombres3.forEach(System.out::println);




    }
}
