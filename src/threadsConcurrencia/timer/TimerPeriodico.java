package threadsConcurrencia.timer;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class TimerPeriodico {
    public static void main(String[] args) {

        System.out.println(new Date());

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        AtomicInteger contadorAtomic = new AtomicInteger(3);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                int i = contadorAtomic.getAndDecrement();
                if (i>0) {
                    toolkit.beep();
                    System.out.println("Tarea periodica "+i+" en: " + new Date() + " nombre del hilo: " + Thread.currentThread().getName());
                }else {
                    System.out.println("finaliza el tiempo");
                    timer.cancel();
                }
            }
        }, 0,5000);


        System.out.println("Agendamos una tarea para cada 5 segundos..");
    }
}
