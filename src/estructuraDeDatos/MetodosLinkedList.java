package estructuraDeDatos;

import estructuraDeDatos.modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MetodosLinkedList {
    public static void main(String[] args) {

        LinkedList<Alumno> enlazada = new LinkedList<>();

        enlazada.add(new Alumno("Pato",5));
        enlazada.add(new Alumno("Cata",6));
        enlazada.add(new Alumno("Luci",4));
        enlazada.add(new Alumno("Jano",7));
        enlazada.add(new Alumno("Andres",3));

        System.out.println(enlazada + "\nsize = " + enlazada.size());

        enlazada.addFirst(new Alumno("Zeus",5));
        enlazada.addLast(new Alumno("Atenea",6));
        System.out.println(enlazada + "\nsize = "+enlazada.size());


        System.out.println("primero = "+ enlazada.getFirst());   //peekFirst sin lanzar excepcion
        System.out.println("ultimo = "+ enlazada.getLast());     // peekLast sin lanzar excepcion
        System.out.println("indice 2 = "+ enlazada.get(2));      //

        //Alumno zeus = enlazada.pop();  => extrae y elimina el primer elemento
        //enlazada.pollLast();   => extrae y elimina el ultimo elemento

        enlazada.removeFirst();  // metodos get y remove lanan excepcion si la lista esta vacia
        enlazada.removeLast();

        System.out.println(enlazada + "\nsize = " + enlazada.size());

        enlazada.remove(new Alumno("Jano", 7));
        System.out.println(enlazada + "\nsize = "+enlazada.size());

        Alumno a = new Alumno("Jose", 8);
        enlazada.addLast(a);
        System.out.println(enlazada + "\nsize = "+enlazada.size());
        System.out.println("indice de Jose = "+ enlazada.indexOf(a));


        System.out.println("========Iterator Next");
        ListIterator <Alumno> li = enlazada.listIterator();
        while(li.hasNext()){
            Alumno alumno = li.next();
            System.out.println(alumno);
        }
        System.out.println("===========Iterator Previus========");
        while (li.hasPrevious()){
            Alumno alumno = li.previous();
            System.out.println(alumno);
        }




    }
}
