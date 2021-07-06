package threadsConcurrencia.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class EjecutarTimer {
    public static void main(String[] args) {
        System.out.println(new Date());
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Tarea realizada en: " + new Date() + " nombre del hilo: " + Thread.currentThread().getName());
                System.out.println("finaliza el tiempo");
                timer.cancel();
            }
        }, 5000);


        System.out.println("Agendamos una tarea para 5 segundos mas..");
    }
}
