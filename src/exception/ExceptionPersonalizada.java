package exception;

import exception.personalizada.Calculadora;
import exception.personalizada.DivisionPorCeroException;
import generics.modelos.Camion;

import javax.swing.*;

public class ExceptionPersonalizada {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        String valor = JOptionPane.showInputDialog("ingrese un numero entero");
        int divisor;
        double division;

        try{
            divisor = Integer.parseInt(valor);
            division = cal.dividir(10,divisor);
            System.out.println(division);
        }catch (NumberFormatException e){
            System.out.println("ingrese un valor numerico: "+e.getMessage());
            main(args);
        }catch (DivisionPorCeroException de){
            System.out.println("se capturo una exception: "+de.getMessage());
            main(args);
        }
    }

}
