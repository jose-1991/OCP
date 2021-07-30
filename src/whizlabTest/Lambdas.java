package whizlabTest;

import java.util.function.IntBinaryOperator;
import java.util.function.IntSupplier;

public class Lambdas {
    public static void main(String[] args) {
        IntBinaryOperator inp = (i1,i2)-> i1/i2;
        System.out.println(inp.applyAsInt(3,5));

        System.out.println("===========  IntSupplier  ===========");

        IntSupplier ins = Lambdas::getRand10;
        System.out.println(ins.getAsInt());
    }
    public static int getRand10(){
        return (int)(Math.random()*10)+1;
    }
}
