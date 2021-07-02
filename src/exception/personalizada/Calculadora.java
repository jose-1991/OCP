package exception.personalizada;

public class Calculadora {

    public double dividir(int numerador, int divisor) throws DivisionPorCeroException {

        if (divisor == 0){
            throw new DivisionPorCeroException("no se puede dividir entre cero!");
        }
        return numerador/(double)divisor;
    }
}
