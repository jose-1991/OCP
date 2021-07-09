package java8Optional;

import java8Optional.modelos.Computador;
import java8Optional.repositorio.ComputadorRepositorio;
import java8Optional.repositorio.Repositorio;

import java.util.Optional;

public class OptionalRepositorio {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

       // repositorio.filtrar("rog").ifPresent(System.out::println);   // ifPresentOrElse desde java 9

        Optional<Computador> pc = repositorio.filtrar("asus  rog");

       if (pc.isPresent()) {
            System.out.println(pc.get());
        }else {
            System.out.println("No se encontro");
        }
    }
}