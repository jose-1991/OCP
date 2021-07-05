package estructuraDeDatos.set;

import estructuraDeDatos.modelos.Alumno;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetEqualsHashCodeIteracion {
    public static void main(String[] args) {
        Set<Alumno> sa = new HashSet<>();
        sa.add(new Alumno("Pato",5));
        sa.add(new Alumno("Cata",6));
        sa.add(new Alumno("Luci",4));
        sa.add(new Alumno("Jano",7));
        sa.add(new Alumno("Andres",3));
        sa.add(new Alumno("Zeus",2));
        sa.add(new Alumno("Zeus",2));
        sa.add(new Alumno("Lucas",4));

        //se sobreescribio el metodo equals y el hashcode en la Clase Alumno
        //para que el HashSet no acepte duplicados

        System.out.println(sa);

        //formas de iterar las colecciones

        // el for estandar solo se usa con List, con el metodo Get()

        /*for (int i = 0; i<sa.size(); i++){
            Alumno a = sa.get(i);
            System.out.println(a.getNombre());
        }*/


        System.out.println("=========Iterando con ForEach============");

        for (Alumno a: sa){
            System.out.println(a.getNombre());
        }
        System.out.println("=========Iterando con While y el Iterator============");
        Iterator<Alumno> it = sa.iterator();
        while (it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }
        System.out.println("=========Iterando con Stream ForEach============");
        sa.forEach(System.out::println);
    }
}
