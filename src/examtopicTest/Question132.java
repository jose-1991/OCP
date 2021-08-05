package examtopicTest;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;
class Vehi{
   static int bno;
   static class Counter{
       int locator;
       Counter(){locator = bno;}
   }
}

class Produc{
    private Card sCard = new SoundCard();
    private abstract class Card{}
    private class SoundCard extends Card{}
}

public class Question132 {
    public static void main(String[] args) {


         List<String> list = new CopyOnWriteArrayList<>();
         AtomicInteger ai = new AtomicInteger(0);
         CyclicBarrier barrier = new CyclicBarrier(2, new Runnable() {
            @Override
            public void run() {
                System.out.println(list);
            }
        });
        Runnable r = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000 * ai.incrementAndGet());
                    list.add("X");
                    barrier.await();
                } catch (Exception e) {
                }
            }
        };
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();

    }
}
