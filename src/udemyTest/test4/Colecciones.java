package udemyTest.test4;

import java.util.*;
import java.util.stream.Stream;
class Base {
    public void m1() throws NullPointerException {
        System.out.println("Base: m1()");
    }
}

class Derived extends Base {
    public void m1() throws RuntimeException {
        System.out.println("Derived: m1()");
    }
}
public class Colecciones {
    public static void main(String[] args) {
        Base obj = new Derived();
        obj.m1();

        System.out.println("=============  ArrayList  ==============");
        List<String> list = new ArrayList<>(Arrays.asList("Z", "Y", "X"));
        list.stream().sorted().findFirst().get();
        System.out.println(list.get(2));

        System.out.println("=============  Optional  ==============");
        Optional<String> optional = Stream.of("red", "green", "blue", "yellow")
                .sorted().findFirst();
        System.out.println(optional.get());


    }
}
