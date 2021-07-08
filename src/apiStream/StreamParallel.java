package apiStream;

import apiStream.modelos.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class StreamParallel {
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

        long t1 = System.currentTimeMillis();
        String resultado = lista.stream()
                .parallel()     // manda los procesos a Threads paralelos para hacerlos mas rapido
                .map(u -> u.toString().toUpperCase())
                .peek(n -> System.out.println("Nombre Thread: " + Thread.currentThread().getName()+ " - "+ n))
                .flatMap(nombre ->{
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }if (nombre.contains("martha".toUpperCase())) {
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .findAny().orElse("");

        long t2 = System.currentTimeMillis();
        System.out.println("Tiempo total: "+ (t2 - t1));
        System.out.println(resultado);

    }
}
