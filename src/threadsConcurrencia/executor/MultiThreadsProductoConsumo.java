package threadsConcurrencia.executor;

import threadsConcurrencia.sincronizados.modelosRunnable.Consumidor;
import threadsConcurrencia.sincronizados.modelosRunnable.Panaderia;
import threadsConcurrencia.sincronizados.modelosRunnable.Panadero;

import java.util.concurrent.*;

public class MultiThreadsProductoConsumo {
    public static void main(String[] args) throws InterruptedException, TimeoutException, ExecutionException {


        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        System.out.println("Longitud del poll: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + executor.getPoolSize());

        Panaderia p = new Panaderia();
        Runnable productor = new Panadero(p);
        Runnable consumidor = new Consumidor(p);


        Future <?> resultado = executor.submit(productor);
        Future <?> resultado1 = executor.submit(consumidor);

        System.out.println("Longitud del poll: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());
        executor.shutdown();

        System.out.println("continuando la ejecucion del metodo main");




    }

}
