package exception.personalizada;

public class Calculadora {

    public double dividir(int numerador, int divisor) throws DivisionPorCeroException {

        if (divisor == 0){
            throw new DivisionPorCeroException("no se puede dividir entre cero!");
        }
        return numerador/(double)divisor;
    }

    public double dividir(String numerador, String divisor)
            throws DivisionPorCeroException, FormatoNumeroException{
        try{
            int num = Integer.parseInt(numerador);
            int div = Integer.parseInt(divisor);
            return  this.dividir(num, div);
        }catch (NumberFormatException e){
            throw new FormatoNumeroException("debe ingresar un numero en el numerador y en el divisor");
        }
    }
}
