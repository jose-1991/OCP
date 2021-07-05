package estructuraDeDatos;

import estructuraDeDatos.modelo.Alumno;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

public class MetodosArrayList {
    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>();

        al.add(new Alumno("Pato",5));
        al.add(new Alumno("Cata",6));
        al.add(new Alumno("Luci",4));
        al.add(2, new Alumno("Jano",7));
        al.set(3, new Alumno("Andres",3));

        System.out.println(al + "\nsize = " + al.size());

        al.remove(new Alumno("Jano",7));
        // al.remove(0);
        System.out.println(al+ "\nsize = "+ al.size());

        boolean b = al.contains(new Alumno("Cata", 6));
        System.out.println("La lista contiene Cata = " + b);

        Object a[] = al.toArray();
        for (Object o: a){
            System.out.println(o);
        }



    }
}
