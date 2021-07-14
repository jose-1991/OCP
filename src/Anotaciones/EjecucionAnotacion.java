package Anotaciones;

import Anotaciones.modelos.Producto;
import Anotaciones.procesador.JsonSerializador;



import java.time.LocalDate;
import java.util.function.ObjIntConsumer;


public class EjecucionAnotacion {
    public static void main(String[] args) {
        Producto p = new Producto();
        p.setFecha(LocalDate.now());
        p.setNombre("mesa centro roble");
        p.setPrecio(1000L);

       // ObjIntConsumer<Integer> cons = (l,i) -> System.out.println(i+l);




        System.out.println("jason = " + JsonSerializador.convertirJson(p));
    }
}
