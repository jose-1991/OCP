/**
 * Metodos, Iteracion y anidacion HashMap
 */
package estructuraDeDatos.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ComparatorTreeMap {
    public static void main(String[] args) {
        Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed());  // compara con la longitud de las llaves
        System.out.println("contiene elementos: " + !persona.isEmpty());
        // put => agregar     (key,valor)  TreeMap es ordenado

        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("apellido paterno", "Does");
        persona.put("email", "john.doe@email.com");
        persona.put("edad", 30);


        Map<String, String> direccion = new TreeMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "120");

        persona.put("direccion", direccion);


        System.out.println("persona = " + persona);


    }
}
