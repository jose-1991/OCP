package java8Optional;

import java.util.Optional;

public class EjecucionOptional {
    public static void main(String[] args) {

        String nombre = "Andres";

        Optional<String> opt = Optional.of(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());

        if (opt.isPresent()){
            System.out.println("Hola "+ opt.get());
        }

        opt.ifPresent( valor -> System.out.println("Hola " + valor));  //reemplaza el if


        nombre = null;
        opt = Optional.ofNullable(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());

        opt.ifPresent( valor -> System.out.println("Hola "+ valor));


        Optional<String> optEmpy = Optional.empty();

        System.out.println("optEmpy = " + optEmpy);
        System.out.println(opt.isPresent());





    }
}
