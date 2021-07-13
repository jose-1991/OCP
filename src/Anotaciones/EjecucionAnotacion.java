package Anotaciones;

import Anotaciones.modelos.Producto;


import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Arrays;

public class EjecucionAnotacion {
    public static void main(String[] args) {
        Producto p = new Producto();
        p.setFecha(LocalDate.now());
        p.setNombre("Mesa centro roble");
        p.setPrecio(1000L);

        Field[] atributos = p.getClass().getDeclaredFields();

        String jason = Arrays.stream(atributos)
                .filter(f -> f.isAnnotationPresent(JsonAtributo.class))
                .map(f -> {
                    f.setAccessible(true);
                    String nombre = f.getAnnotation(JsonAtributo.class).nombre().equals("")
                            ? f.getName()
                            : f.getAnnotation(JsonAtributo.class).nombre();
                    try {
                        return "\"" + nombre + "\":\"" + f.get(p) + "\"";
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException("Error al serializar a json: " + e.getMessage());
                    }
                })
                .reduce("{", (a, b) -> {
                    if ("{".equals(a)) {
                        return a + b;
                    }
                    return a + ", " + b;
                }).concat("}");

        System.out.println("jason = " + jason);
    }
}
