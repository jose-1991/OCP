package patronesDiseno.observer.ejecuciones;

import patronesDiseno.observer.Corporacion;

public class ejecucionObserverAccionistas {
    public static void main(String[] args) {
        Corporacion google = new Corporacion("Google", 1000);

        google.addObserver((observable, obj) -> {
            System.out.println("Jhon: " +observable);
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Jose: " +observable);
        });
        google.addObserver((observable, obj) -> {
            System.out.println("Soledad: " +observable);
        });

        google.modificarPrecio(3000);
    }
}
