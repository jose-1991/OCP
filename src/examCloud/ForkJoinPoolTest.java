package examCloud;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.TimeUnit;

class PrintTask extends RecursiveAction{

    private static final int MAX = 20;

    private int start;
    private int end;

    public PrintTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if ((end-start)<MAX){
            for (int i = start; i<end;i++){
                System.out.println(Thread.currentThread().getName()+ "i value: "+ i);
            }
        }else{
            int middle = (start + end)/2;
            PrintTask left = new PrintTask(start,middle);
            PrintTask right = new PrintTask(middle,end);

            left.fork();
            right.fork();

        }

    }
}

public class ForkJoinPoolTest {
    public static void main(String[] args) throws InterruptedException {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.submit(new PrintTask(0,100));
        forkJoinPool.awaitTermination(2, TimeUnit.SECONDS);
        forkJoinPool.shutdown();
    }
}
