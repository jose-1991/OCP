package threadsConcurrencia.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceThread {
    public static void main(String[] args) {
        java.util.concurrent.ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        System.out.println("Alguna tarea en el main");

        executor.schedule(() ->{
            try {
                TimeUnit.MILLISECONDS.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" aqui se realiza la Tarea");
        },1000,TimeUnit.MILLISECONDS);

        System.out.println("alguna otra tarea en el main..");
        executor.shutdown();
    }
}
