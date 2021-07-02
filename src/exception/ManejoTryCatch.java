package exception;

import javax.swing.*;

public class ManejoTryCatch {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("ingrese un numero");
        int divisor;

        try{
            divisor = Integer.parseInt(valor);
            int division = 10/divisor;
            System.out.println(division);
        }catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"ERROR!!  ingrese un valor numerico");
            main(args);
        }catch (ArithmeticException ae){
            System.out.println("ERROR!!  no se puede dividir entre 0");
            main(args);
        }finally {
            System.out.println("es opcional y siempre se ejecuta");
        }

        System.out.println("continuar con el flujo");
    }
}
