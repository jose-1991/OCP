package javamockExams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + age;
    }
    public static Comparator<Person> COMPARATOR = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return (o1.age - o2.age);
        }
    };
}
public class Comparador {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Jhon",50));
        list.add(new Person("Frank",15));
        list.add(new Person("Adam",20));

        Collections.sort(list,Person.COMPARATOR);
        list.forEach(a -> System.out.print(a.toString()+" "));
    }
}
