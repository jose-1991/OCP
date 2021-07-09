package java8Optional.repositorio;

import java8Optional.modelos.Computador;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

public class ComputadorRepositorio  implements Repositorio<Computador> {

    private List<Computador> dataSource;

    public ComputadorRepositorio(){
        dataSource = new ArrayList<>();
        dataSource.add(new Computador("Asus ROG", "Strix G512"));
        dataSource.add(new Computador("MackBook Pro", "MVVK2CI"));
    }
    @Override
    public Optional<Computador> filtrar(String nombre) {
        return dataSource.stream().filter(c -> c.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .findFirst();
        /*for (Computador c : dataSource){
            if (c.getNombre().equalsIgnoreCase(nombre)){
                return Optional.of(c);
            }
        }
        return Optional.empty();*/
    }
}
