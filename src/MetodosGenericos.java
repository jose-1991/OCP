import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MetodosGenericos {
    public static void main(String[] args) {
        List <Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Jhosep","Martinez"));
        clientes.add(new Cliente("Javier", "Lopez"));
        clientes.forEach(System.out::println);

        Cliente[] clientesArreglo = {new Cliente("Oscar", "Alvarado"),
                                     new Cliente("Luci","Gomez") };
        Integer[] enterosArreglo = {2,4,6,8};

        List<Cliente> clienteLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        clienteLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Andres","Pepe","July"},clientesArreglo);
        nombres.forEach(System.out::println);


    }

    public static <T> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }
    public static <T,G> List<T> fromArrayToList(T[] c, G[] x){
        for (G elements: x){
            System.out.println(elements);
        }
        return Arrays.asList(c);
    }
}
class Cliente{
    static int id;
    String nombre;
    String apellido;
    Cliente(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    Cliente(){}

    public String toString(){
        return ++id + ") " + nombre +" " + apellido;
    }
}
