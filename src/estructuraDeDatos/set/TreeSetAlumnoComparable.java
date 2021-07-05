package estructuraDeDatos.set;

import estructuraDeDatos.modelos.Alumno;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetAlumnoComparable {
    public static void main(String[] args) {
        //Set<Alumno> sa = new TreeSet<>((a,b) -> b.getNota().compareTo(a.getNota())); // orden descendente
        Set<Alumno> sa = new TreeSet<>(Comparator.comparing(Alumno::getNota).reversed());
        sa.add(new Alumno("Pato",5));
        sa.add(new Alumno("Cata",6));
        sa.add(new Alumno("Luci",4));
        sa.add(new Alumno("Jano",7));
        sa.add(new Alumno("Andres",3));
        sa.add(new Alumno("Zeus",2));

        System.out.println(sa);
        sa.forEach(System.out::println);
    }
}
