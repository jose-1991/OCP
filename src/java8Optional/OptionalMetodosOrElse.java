package java8Optional;

import java8Optional.modelos.Computador;
import java8Optional.repositorio.ComputadorRepositorio;
import java8Optional.repositorio.Repositorio;

import java.util.Optional;

public class OptionalMetodosOrElse {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        Computador defecto = new Computador("HP Omen", "LA0001");

        Computador pc = repositorio.filtrar("rog").orElse(valorDefecto());  // orElse se ejecuta si o si
        System.out.println(pc);

        pc= repositorio.filtrar("mackbook pro").orElseGet(OptionalMetodosOrElse::valorDefecto);  // orElseGet no se ejecuta si se encuentra presente
        System.out.println(pc);


    }

    public static Computador valorDefecto() {
        System.out.println("Oteniendo valor por defecto!..");
        return new Computador("HP Omen", "LA0001");
    }
}