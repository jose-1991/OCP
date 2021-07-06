package threadsConcurrencia.runnable.modelos;

public class ImplementarRunnable implements Runnable {
    private String name;

    public ImplementarRunnable(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public void run() {
        System.out.println("se inicia el metodo del thread "+ getName());

        for (int i = 0; i <5 ; i++){
            try {
                Thread.sleep((long) (Math.random()* 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName());
        }
        System.out.println("el viaje sera a: " + getName());

    }
}
