package threadsConcurrencia.executor;

import java.util.concurrent.*;

public class ExecutorFutureCallable {
    public static void main(String[] args) throws InterruptedException, TimeoutException, ExecutionException {


        ExecutorService executor = Executors.newSingleThreadExecutor();

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
        System.out.println("Continuamos con la ejecucion del metodo main");

        Future <String> resultado = executor.submit(tarea);
        executor.shutdown();


        while (!resultado.isDone()){
            System.out.println("Ejecutando tarea...");
            TimeUnit.MILLISECONDS.sleep(1500);
        }

        System.out.println("Obtenemos el resultado de la tarea: " + resultado.get());
        System.out.println("Finaliza la tarea: " + resultado.isDone());

    }

}
