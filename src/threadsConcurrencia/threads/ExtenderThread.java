package threadsConcurrencia.threads;

public class ExtenderThread extends Thread{
    public ExtenderThread(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("se inicia el metodo run del thread");

        for (int i= 0; i<3;i++){
            try {
                Thread.sleep(10);
                System.out.println(this.getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("finaliza el thread");
    }
}
