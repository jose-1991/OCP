package whizlabTest;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class DesignClass {
    static class Task1 implements Runnable{

        @Override
        public void run() {
            System.out.println("Task 1");
        }
    }
    static class Task2 implements Runnable{

        @Override
        public void run() {
            System.out.println("Task 2");

            try {
                Thread.sleep(4500);
            }catch (Exception e){
                System.out.println(e);
            }
        }

    }

    public static void main(String[] args) throws Exception {
        final ExecutorService pool = Executors.newFixedThreadPool(2);

        Future f1 = pool.submit(new Task1());
        Future f2 = pool.submit(new Task2());
        pool.awaitTermination(4, TimeUnit.SECONDS);

        pool.shutdown();
    }

}
