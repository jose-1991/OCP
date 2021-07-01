package generics.repositorio;

import generics.repositorio.excepciones.AccesoDatoException;
import generics.repositorio.excepciones.LecturaAccesoDatoException;

import java.util.List;

public interface CrudRepositorio <T> {
    List<T> listar();
    T porId(Integer id) throws AccesoDatoException, LecturaAccesoDatoException;
    void crear(T t) throws AccesoDatoException;
    void editar(T t) throws AccesoDatoException, AccesoDatoException;
    void eliminar(Integer id) throws AccesoDatoException;
}
