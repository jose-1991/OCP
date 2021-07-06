package threadsConcurrencia.runnable;

public class RunnableLambda {
    public static void main(String[] args) throws InterruptedException {
        Thread main = Thread.currentThread();

        Runnable viaje = () ->{   // expresion lambda para la instancia de Runnable
            System.out.println("se inicia el metodo del thread "+ Thread.currentThread().getName());

            for (int i = 0; i <5 ; i++){
                try {
                    Thread.sleep((long) (Math.random()* 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }
            System.out.println("el viaje sera a: " + Thread.currentThread().getName());
            System.out.println(main.getState());
        };


        Thread v1 = new Thread(viaje, "Copacabana");
        Thread v2 = new Thread(viaje, "Salar de Uyuni");
        Thread v3 = new Thread(viaje, "Villa Tunari");
        Thread v4 = new Thread(viaje, "Incachaca");

        v1.start();
        v2.start();
        v3.start();
        v4.start();

        v1.join();
        v2.join();
        v3.join();
        v4.join();
        System.out.println("continuando con la ejecucion del metodo main: "+ main.getName());
    }

}
