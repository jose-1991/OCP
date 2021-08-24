package udemyTest.test4;

import java.util.Map;

public class Excepciones {
    public static void main(String[] args) {
        try {
            check();
        } catch(RuntimeException e) {
            System.out.println(e.getClass().getName());
        }
    }
    private static void check() {
        try {
            RuntimeException re = new RuntimeException();
            throw re;
        } catch(RuntimeException e) {
            System.out.println(1);
            ArithmeticException ex = (ArithmeticException)e;
            System.out.println(2);
            throw ex;
        }
    }
}
