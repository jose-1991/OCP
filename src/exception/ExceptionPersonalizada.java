package exception;

import exception.personalizada.Calculadora;
import exception.personalizada.DivisionPorCeroException;
import exception.personalizada.FormatoNumeroException;
import generics.modelos.Camion;

import javax.swing.*;

public class ExceptionPersonalizada {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        String numerador = JOptionPane.showInputDialog("ingrese entero numerador");
        String denominador = JOptionPane.showInputDialog("ingrese un entero denominador");

        try{
           double division = cal.dividir(numerador, denominador);
            System.out.println("division = " + division);
        }catch (FormatoNumeroException e){
            System.out.println("ingrese un valor numerico: "+e.getMessage());

        }catch (DivisionPorCeroException de){
            System.out.println("se capturo una exception: "+de.getMessage());

        }
    }

}
