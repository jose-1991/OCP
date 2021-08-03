package examtopicTest;

import java.util.concurrent.*;
//============================= 40 ============
class Canvas implements Drawable {
    public void draw () { }
}
 abstract class Board extends Canvas { }
class Paper extends Canvas {
    protected void draw (int color) { }
}
 class Frame extends Canvas implements Drawable {
    public void resize () { }
}
interface Drawable {
    public abstract void draw ();
}
//======================================================================
class Caller implements Callable<String> {
    String str;
    public Caller (String s) {this.str=s;}
    public String call()throws Exception { return str.concat ("Caller");}
}
class Runner implements Runnable {
    String str;
    public Runner (String s) {this.str=s;}

    public void run () { System.out.println (str.concat ("Runner"));}
}

public class Question39 {
    public static void main (String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future f1 = es.submit (new Caller ("Call"));
        Future f2 = es.submit (new Runner ("Run"));
        String str1 = (String) f1.get();
        String str2 = (String) f2.get(); //line n1
        System.out.println(str1+ ":" + str2);
        es.shutdown();
    }
}
