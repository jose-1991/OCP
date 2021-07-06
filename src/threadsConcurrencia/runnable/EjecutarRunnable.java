package threadsConcurrencia.runnable;

public class EjecutarRunnable {
    public static void main(String[] args) {
        new Thread(new ImplementarRunnable("Copacabana")).start();
        new Thread(new ImplementarRunnable("Salar de Uyuni")).start();
        new Thread(new ImplementarRunnable("Villa Tunari")).start();
        new Thread(new ImplementarRunnable("Incachaca")).start();
    }

}
