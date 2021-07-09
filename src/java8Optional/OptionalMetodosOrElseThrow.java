package java8Optional;

import java8Optional.modelos.Computador;
import java8Optional.repositorio.ComputadorRepositorio;
import java8Optional.repositorio.Repositorio;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalMetodosOrElseThrow {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        Computador pc = repositorio.filtrar("rog").orElseThrow(IllegalStateException::new);
        System.out.println(pc);

        String archivo = "documento.pdf";
        String extension = Optional.ofNullable(archivo)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".")+1))
                .orElseThrow(NoSuchElementException::new);

        System.out.println(extension);
    }
}