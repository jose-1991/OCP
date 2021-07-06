package threadsConcurrencia.sincronizados.modelosRunnable;

public class Panaderia {
    private String pan;
    private boolean disponilbe;

    public synchronized void hornear(String masa){
        while(disponilbe){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.pan = masa;

        System.out.println("panadero hornea: " + this.pan);
        this.disponilbe = true;
        notify();
    }

    public synchronized String consumir(){
        while (!disponilbe){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Cliente consume: "+ this.pan);
        this.disponilbe = false;
        notify();
        return pan;
    }
}
