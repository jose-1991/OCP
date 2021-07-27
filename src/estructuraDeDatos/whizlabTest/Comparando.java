package estructuraDeDatos.whizlabTest;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

class Dog{
    String name;
    int age;
    String owner;

    Dog(String n, String o, int a){
        name = n;  owner = o;  age = a;
    }

    public String toString(){
        return owner;
    }
}
public class Comparando {
    public static void main(String[] args) {

        ArrayList<Dog> doglist = new ArrayList<>();
        doglist.add(new Dog("Lazy","Jhon",3));
        doglist.add(new Dog("White","Henry",2));
        doglist.add(new Dog("Blaky","Bert",5));
        doglist.add(new Dog("Tazan","Jack",1));

        Sort1 s1 = new Sort1();
        Collections.sort(doglist,s1);
        System.out.println(doglist);

        Sort2 s2 = new Sort2();
        Collections.sort(doglist,s2);
        System.out.println(doglist);
    }
    static class Sort1 implements Comparator<Dog>{

        @Override
        public int compare(Dog first, Dog second) {
            return first.name.compareTo(second.name);
        }
    }
    static class Sort2 implements Comparator<Dog>{

        @Override
        public int compare(Dog first, Dog second) {
            return first.owner.compareTo(second.owner);
        }
    }


}
