package java8Optional.repositorio;

import java8Optional.modelos.Computador;

import java.util.Optional;

public interface Repositorio<T> {
    Optional<Computador> filtrar(String nombre);

}
