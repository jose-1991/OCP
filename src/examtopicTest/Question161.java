package examtopicTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ThreadRunner implements Runnable {
    public void run() {
        System.out.print("Runnable");
    }
}

class ThreadCaller implements Callable {
    public String call() throws Exception {
        return "Callable";
    }


}

public class Question161 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        Runnable r1 = new ThreadRunner();
        Callable c1 = new ThreadCaller();
        es.submit(r1);
        Future<String> f1 = es.submit(c1);
        es.shutdown();
    }
}

