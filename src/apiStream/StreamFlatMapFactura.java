package apiStream;

import apiStream.modelos.Factura;
import apiStream.modelos.Usuario;

import java.util.Arrays;
import java.util.List;

public class StreamFlatMapFactura {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("John", "Doe");
        Usuario u2 = new Usuario("Jose", "Flores");

        u1.addFactura(new Factura("Compras tecnologicas"));
        u1.addFactura(new Factura("Compras muebles"));

        u2.addFactura(new Factura("Bicicleta"));
        u2.addFactura(new Factura("Notebook Gamer"));

        List<Usuario> usuarios = Arrays.asList(u1,u2);

        usuarios.stream()
                .flatMap(u -> u.getFacturas().stream())
                .forEach(f -> System.out.println(f.getDescripcion().concat(" : cliente ")
                .concat(f.getUsuario().toString())));


//        for (Usuario u : usuarios){
//            for (Factura f: u.getFacturas()){
//                System.out.println(f.getDescripcion());
//            }
//        }
    }
}
