package threadsConcurrencia.executor;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecutorServicePeriodo {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        System.out.println("Alguna tarea en el main");

        AtomicInteger contador = new AtomicInteger(5);
       // CountDownLatch lock = new CountDownLatch(5);
        Future<?> future = executor.scheduleAtFixedRate(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(2000);
//                lock.countDown();
                contador.getAndDecrement();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" aqui se realiza la Tarea");
        }, 1000, 2000, TimeUnit.MILLISECONDS);
        //lock.await();
        //future.cancel(true);
//        TimeUnit.SECONDS.sleep(10);

        while (contador.get()>= 0){
            if (contador.get() == 0){
                future.cancel(true);
                contador.getAndDecrement();
            }
        }

        System.out.println("alguna otra tarea en el main..");
        executor.shutdown();
    }
}
