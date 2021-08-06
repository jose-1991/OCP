package examtopicTest;

import java.util.concurrent.*;

class Callers implements Callable<String> {
    String str;
    public Callers (String s) {this.str=s;}
    public String call()throws Exception { return str.concat ("Caller");}
}
class Runners implements Runnable {
    String str;
    public Runners (String s) {this.str=s;}
    public void run () { System.out.println (str.concat ("Runner"));}
}
public class Question186 {
    public static void main (String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future f1 = es.submit (new Callers ("Call"));
        Future f2 = es.submit (new Runners ("Run"));
        String str1 = (String) f1.get();
        String str2 = (String) f2.get(); //line n1
        System.out.println(str1+ ":" + str2);
        es.shutdown();
    }
}
