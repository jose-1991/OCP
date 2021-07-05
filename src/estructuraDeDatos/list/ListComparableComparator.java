package estructuraDeDatos.list;

import estructuraDeDatos.modelos.Alumno;

import java.util.*;

public class ListComparableComparator {
    public static void main(String[] args) {

        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Pato",5));
        sa.add(new Alumno("Cata",6));
        sa.add(new Alumno("Luci",4));
        sa.add(new Alumno("Jano",7));
        sa.add(new Alumno("Andres",3));
        sa.add(new Alumno("Zeus",2));
        sa.add(new Alumno("Luci",4));
        sa.add(new Alumno("Lucas",2));

        //Collections.sort(sa,(a,b) -> b.getNombre().compareTo(a.getNombre()));
        //sa.sort((a,b) -> b.getNombre().compareTo(a.getNombre()));
        sa.sort(Comparator.comparing(Alumno::getNombre). reversed());
        sa.forEach(System.out::println);
    }
}
