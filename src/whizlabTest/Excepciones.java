package whizlabTest;

public class Excepciones {
    public static void main(String[] args) {
        try {
            new Excepciones().meth();
        }catch (ArithmeticException e){
            System.out.println("Arithmetic");
        }catch (Exception e){
            System.out.println("Exception");
        } finally{
            System.out.println("final");
        }
    }
    public void meth()throws ArithmeticException{
        for (int x = 0;x<5;x++) {
            int y = (int)5/x;
            System.out.println(x);
        }
    }
}
