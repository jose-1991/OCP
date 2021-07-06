package threadsConcurrencia.threads;

import threadsConcurrencia.threads.ExtenderThread;

public class EjecutarThread {
    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new ExtenderThread("Jose");
        hilo.start();

        System.out.println(hilo.getState());

        Thread hilo2 = new ExtenderThread("Miguel");
        hilo2.start();
        System.out.println(hilo2.getState());

        Thread hilo3 = new ExtenderThread("Carola");
        hilo3.start();
        System.out.println(hilo3.getState());

    }
}
