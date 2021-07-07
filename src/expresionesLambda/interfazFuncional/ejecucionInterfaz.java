package expresionesLambda.interfazFuncional;

public class ejecucionInterfaz {
    public static void main(String[] args) {
        Aritmetica suma = Double::sum; //(a , b) -> a+b;
        Aritmetica resta = (a, b) -> a-b;

        Calculadora cal = new Calculadora();

        double resultado1 = cal.computar(10,5,suma);
        double resultado2 = cal.computar(10,5,resta);

        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(cal.computar(10,5, (a, b) -> a*b));

        System.out.println(cal.computarBifuncion(10,5,Double::sum));  // (a,b) -> a+b;
    }
}
