package threadsConcurrencia.whizlabTest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Metodos {
    int val = 10;
    int x;

    public Metodos(int val) {
        this.val = val;
    }

    private AtomicInteger value = new AtomicInteger(val);

    public static void main(String[] args) {

        System.out.println("===========  Parallel  ===========");
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);

        list.stream().peek(System.out::print).parallel().forEach(System.out::print);
        System.out.println();

        System.out.println("===========  AtomicInteger  ===========");

        Metodos met = new Metodos(5);
        System.out.println(met.value.decrementAndGet());
    }
}
