package threadsConcurrencia.whizlabTest;

import expresionesLambda.whizlabTest.MetodosLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MetodosConcurrencia implements Runnable {
    int val = 10;
    int x;

    public MetodosConcurrencia() {
    }

    public MetodosConcurrencia(int val) {
        this.val = val;
    }

    private AtomicInteger value = new AtomicInteger(val);

    public static void main(String[] args) {
        MetodosConcurrencia a1 = new MetodosConcurrencia();

        Thread t = new Thread(a1);
        t.setName("a1");
        t.start();

        System.out.print(Thread.currentThread().getName()+ " ");

        try {
            t.join();
        }catch (Exception e){}
            System.out.print(Thread.currentThread().getName());
        }

//        System.out.println("===========  Parallel  ===========");
//        List<Integer> list = new ArrayList<>();
//        list.add(5);
//        list.add(10);
//        list.add(15);
//
//        list.stream().peek(System.out::print).parallel().forEach(System.out::print);
//        System.out.println();
//
//        System.out.println("===========  AtomicInteger  ===========");
//
//        MetodosConcurrencia met = new MetodosConcurrencia(5);
//        System.out.println(met.value.decrementAndGet());


    @Override
    public void run() {
        System.out.print(Thread.currentThread().getName()+" ");
    }
}
