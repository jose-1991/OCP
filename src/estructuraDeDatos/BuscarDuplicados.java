package estructuraDeDatos;

import java.util.HashSet;
import java.util.Set;

public class BuscarDuplicados  {
    public static void main(String[] args) {
        String[] peces = {"Corvina", "Atun", "Sabalo", "Sardina", "Pejerrey", "Atun", "Sardina"};
        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();

        for (String pez: peces){
            if (!unicos.add(pez)){
                duplicados.add(pez);

            }
        }
        unicos.removeAll(duplicados);
        System.out.println("Elementos unicos: " + unicos);
        System.out.println("Elementos duplicados: " + duplicados);
    }
}
