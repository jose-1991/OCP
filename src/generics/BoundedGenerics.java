/**
 * limites a los metodos genericos
 */
package generics;


import generics.modelos.Cliente;
import generics.modelos.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoundedGenerics {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Jhosep", "Martinez"));
        clientes.add(new Cliente("Javier", "Lopez"));


        Cliente[] clientesArreglo = {new Cliente("Oscar", "Alvarado"),
                new Cliente("Luci", "Gomez")};
        Integer[] enterosArreglo = {2, 4, 6, 8};

        List<Cliente> clienteLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);   // implementa el metodo <T> extends Number

        clienteLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Andres", "Pepe", "July"}, clientesArreglo);
        nombres.forEach(System.out::println);

        List <ClientePremium> clientesPremium = fromArrayToList(new ClientePremium[]{new ClientePremium("Paco"," Fernandez"),
                new ClientePremium("Maria","Linera")});

        clientesPremium.forEach(System.out::println);

        imprimirClientes(clientes);
        imprimirClientes(clienteLista);
        imprimirClientes(clientesPremium);

        System.out.println("maximo de 1, 9, 4 es = " + maximo(1,9,4));
        System.out.println("maximo de 2.3, 5.7, 3.5 es = " + maximo(2.3,5.7,3.5));
        System.out.println("maximo de Naranja, Zanahoria, Pera es = " + maximo("Naranja","Zanahoria","Pera"));


    }
    public static <T> List<T> fromArrayToList(T[] c){

        return Arrays.asList(c);
    }

    public static <T extends Number> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T extends Cliente & Comparable <T>> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }


    public static <T,G> List<T> fromArrayToList(T[] c, G[] x){
        for (G elements: x){
            System.out.println(elements);
        }
        return Arrays.asList(c);
    }
    public static void imprimirClientes(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }

    public static <T extends Comparable> T maximo(T a, T b, T c){
        T max = a;
        if (b.compareTo(max)> 0 ){
            max = b;
        }
        if (c.compareTo(max)>0){
            max = c;
        }
        return max;
    }
}
