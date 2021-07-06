package threadsConcurrencia.sincronizados;

import threadsConcurrencia.sincronizados.modelosRunnable.Consumidor;
import threadsConcurrencia.sincronizados.modelosRunnable.Panaderia;
import threadsConcurrencia.sincronizados.modelosRunnable.Panadero;

import java.util.concurrent.ThreadLocalRandom;

public class ProductorConsumidorConLambda {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();

        new Thread(() ->{for (int i =0; i <10; i++){   // reemplaza la clase Panadero
            p.hornear("Pan #"+ (i+1));

            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(500,2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }}).start();
        new Thread(() -> {  for (int i = 0; i < 10; i++) {  // reemplaza la clase Consumidor
            p.consumir();
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(500,2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }}).start();
    }
}
