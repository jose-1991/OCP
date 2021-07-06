package threadsConcurrencia.sincronizados;

import threadsConcurrencia.sincronizados.modelosRunnable.Consumidor;
import threadsConcurrencia.sincronizados.modelosRunnable.Panaderia;
import threadsConcurrencia.sincronizados.modelosRunnable.Panadero;

public class ProductorConsumidor {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();

        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();
    }
}
