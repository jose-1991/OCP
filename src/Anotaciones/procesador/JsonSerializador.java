package Anotaciones.procesador;

import Anotaciones.Init;
import Anotaciones.JsonAtributo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

public class JsonSerializador {

    public static void inicializarObjeto(Object object){

        if (object == null){
            throw new JsonSerializadorException("El objeto a serializar no puede ser Null!!");
        }
        Method[] metodos = object.getClass().getDeclaredMethods();
        Arrays.stream(metodos).filter( m -> m.isAnnotationPresent(Init.class))
                .forEach(m -> {
                    m.setAccessible(true);
                    try {
                        m.invoke(object);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                       throw new JsonSerializadorException("error al serializar, no se puede iniciar el objeto");
                    }
                });
    }

    public static String convertirJson(Object object){

        if (object == null){
            throw new JsonSerializadorException("El objeto a serializar no puede ser Null!!");
        }
        inicializarObjeto(object);
        Field[] atributos = object.getClass().getDeclaredFields();

       return Arrays.stream(atributos)
                .filter(f -> f.isAnnotationPresent(JsonAtributo.class))
                .map(f -> {
                    f.setAccessible(true);
                    String nombre = f.getAnnotation(JsonAtributo.class).nombre().equals("")
                            ? f.getName()
                            : f.getAnnotation(JsonAtributo.class).nombre();
                    try {
                        Object valor = f.get(object);

                        if (f.getAnnotation(JsonAtributo.class).capitalizar() &&
                        valor instanceof String){
                            String nuevoValor = (String) valor;
                            nuevoValor = Arrays.stream(nuevoValor.split(" "))
                                    .map(palabra -> palabra.substring(0,1).toUpperCase()+
                                            palabra.substring(1).toLowerCase())
                                    .collect(Collectors.joining(" "));
                            f.set(object,nuevoValor);
                        }
                        return "\"" + nombre + "\":\"" + f.get(object) + "\"";
                    } catch (IllegalAccessException e) {
                        throw new JsonSerializadorException("Error al serializar a json: " + e.getMessage());
                    }
                })
                .reduce("{", (a, b) -> {
                    if ("{".equals(a)) {
                        return a + b;
                    }
                    return a + ", " + b;
                }).concat("}");
    }
}
