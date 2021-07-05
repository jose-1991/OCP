package estructuraDeDatos;

import java.util.HashSet;
import java.util.Set;

public class HashSetAdd {
    public static void main(String[] args) {
        Set <String> hs = new HashSet<>();
        System.out.println(hs.add("uno"));
        System.out.println(hs.add("dos"));
        System.out.println(hs.add("tres"));
        System.out.println(hs.add("cuatro"));
        System.out.println(hs.add("cinco"));

        boolean duplicado = hs.add("tres");

        System.out.println("permite elementos duplicados?: "+ duplicado);
        System.out.println(hs);
    }
}
