package designClass;

import java.util.Arrays;

public class metodos {
    static int y = 0;
    public static void main(String[] args) {

        System.out.println("===========  abstract class  ===========");
        abstract class A{
            public abstract int calc(int x);
        }
        A a = new A() {
            @Override
            public int calc(int x) {
                return x*y;
            }
            //es ilegal llamar a este metodo fuera de la clase anonima
            public void print(int x){
                System.out.println(calc(x));
            }
        };
        System.out.println(a.calc(2));

        System.out.println("===========  Duration  ===========");
        Value[] values = {Value.LOW,Value.HIGH,Value.MEDIUM};
        Arrays.sort(values);
        System.out.println("=" + values[0] + values[1]);

    }
}

enum Value{
    HIGH(1), MEDIUM(6), LOW(3);

    private final int level;

    private Value(int levelCode){
        level = levelCode;
    }
}
