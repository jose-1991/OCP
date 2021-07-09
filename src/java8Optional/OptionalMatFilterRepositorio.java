package java8Optional;

import java8Optional.modelos.Computador;
import java8Optional.modelos.Fabricante;
import java8Optional.modelos.Procesador;
import java8Optional.repositorio.ComputadorRepositorio;
import java8Optional.repositorio.Repositorio;

import java.util.NoSuchElementException;

public class OptionalMatFilterRepositorio {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        String f = repositorio.filtrar("asus")
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(fab -> "intel".equalsIgnoreCase(fab.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("desconocido");

        System.out.println(f);


    }


}