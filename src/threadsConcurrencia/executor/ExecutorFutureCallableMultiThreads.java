package threadsConcurrencia.executor;

import java.util.concurrent.*;

public class ExecutorFutureCallableMultiThreads {
    public static void main(String[] args) throws InterruptedException, TimeoutException, ExecutionException {


        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        System.out.println("Longitud del poll: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + executor.getPoolSize());

        Callable<String> tarea = () -> {
            System.out.println("inicio de la tarea " );
            try {
                System.out.println("Nombre del thread "+ Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finaliza Tarea.. ");
            return "Resultado importante de la tarea";
        };

        Callable<Integer> tarea2 = () -> {
            System.out.println("Inicio de la tarea 2");
            return 10;
        };


        Future <String> resultado = executor.submit(tarea);
        Future <String> resultado3 = executor.submit(tarea);
        Future <Integer> resultado2 = executor.submit(tarea2);


        System.out.println("Longitud del poll: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + executor.getPoolSize());
        executor.shutdown();

        System.out.println("Continuamos con la ejecucion del metodo main");

        while (!(resultado.isDone() && resultado2.isDone() && resultado3.isDone())){
            System.out.printf("resultado1: %s - resultado2: %s - resultado3: %s%n",
                    resultado.isDone()? "finalizo" : "en proceso",
                    resultado.isDone()? "finalizo" : "en proceso",
                    resultado.isDone()? "finalizo" : "en proceso" );
           TimeUnit.MILLISECONDS.sleep(1000);
        }

        System.out.println("Obtenemos el resultado de la tarea: " + resultado.get());
        System.out.println("Finaliza la tarea: " + resultado.isDone());

        System.out.println("Obtenemos el resultado de la tarea2: " + resultado2.get());
        System.out.println("Finaliza la tarea: " + resultado.isDone());

        System.out.println("Obtenemos el resultado de la tarea3: " + resultado3.get());
        System.out.println("Finaliza la tarea: " + resultado.isDone());

    }

}
