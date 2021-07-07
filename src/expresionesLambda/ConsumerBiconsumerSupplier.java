package expresionesLambda;

import expresionesLambda.modelos.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerBiconsumerSupplier {
    public static void main(String[] args) {

        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };

        consumidor.accept(new Date());

        BiConsumer<String, Integer> biconsumidor = (nombre, edad) -> {
            System.out.println(nombre + ", tiene " + edad + " años!");
        };

        biconsumidor.accept("Jose", 29);

        Consumer<String> consumidor2 = System.out::println;
        consumidor2.accept("Hola Mundo Lambda");

        List<String> nombres = Arrays.asList("Andres","Pepe","Luz", "Paco");
        nombres.forEach(consumidor2);

        Supplier<Usuario> crearUsuario =  Usuario::new; // () -> new Usuario();
        Usuario usuario = crearUsuario.get();

        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre; // (a,b) -> a.setNombre(b);

        asignarNombre.accept(usuario,"Andres");
        System.out.println("Nombre de usuario: "+ usuario.getNombre());

        Supplier<String> proveedor= () -> "Hola mundo";     // suplier retorna un el tipo de valor definido

        System.out.println(proveedor.get());

    }
}
