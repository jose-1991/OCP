package exception.personalizada;

import generics.modelos.Producto;
import generics.repositorio.Direccion;
import generics.repositorio.OrdenablePaginableCrudRepositorio;
import generics.repositorio.excepciones.AccesoDatoException;
import generics.repositorio.excepciones.EscrituraAccesoDatoException;
import generics.repositorio.excepciones.LecturaAccesoDatoException;
import generics.repositorio.excepciones.RegistroDuplicadoAccesoDatoException;
import generics.repositorio.listas.ProductoListRepositorio;

import java.util.List;

public class RepositorioProductoExc {
    public static void main(String[] args) {

        try {
            OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListRepositorio();
            repo.crear(new Producto("mesa", 50.52));
            repo.crear(new Producto("silla", 18));
            repo.crear(new Producto("lampara", 15.5));
            repo.crear(new Producto("notebook", 400.89));

            List<Producto> productos = repo.listar();
            productos.forEach(System.out::println);
            System.out.println("===== paginable =====");
            List<Producto> paginable = repo.listar(1, 4);
            paginable.forEach(System.out::println);

            System.out.println("===== ordenar =====");
            List<Producto> productosOrdenAsc = repo.listar("descripcion", Direccion.ASC);
            for (Producto c : productosOrdenAsc) {
                System.out.println(c);
            }

            System.out.println("===== editar =====");
            Producto lamparaActualizar = new Producto("lampara escritorio", 23);
            lamparaActualizar.setId(3);
            repo.editar(lamparaActualizar);
            Producto lampara = repo.porId(3);
            System.out.println(lampara);
            System.out.println(" ============= ");
            repo.listar("precio", Direccion.ASC).forEach(System.out::println);
            System.out.println("===== eliminar ======");
            repo.eliminar(2);
            repo.listar().forEach(System.out::println);
            System.out.println("===== total ===== ");
            System.out.println("Total registros: " + repo.total());

        } catch (RegistroDuplicadoAccesoDatoException e) {
            System.out.println(e.getMessage());
        }
        catch (EscrituraAccesoDatoException e){
            System.out.println(e.getMessage());
        } catch(LecturaAccesoDatoException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (AccesoDatoException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
