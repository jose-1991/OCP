package expresionesLambda.whizlabTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.DoublePredicate;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.ToDoubleBiFunction;
import java.util.stream.DoubleStream;

public class PrefixArrays {
    public static void main(String[] args) {
        long ls[] = {4,8,12};
        Arrays.parallelPrefix(ls, Long::sum);
        System.out.println(Arrays.toString(ls));


        System.out.println("==========  toDoubleBiFunction  ==========");
        Map<Integer,Double> maps = new HashMap<>();
        maps.put(1,12.7);
        maps.put(2,13.5);
        maps.put(1,13.8);
        ToDoubleBiFunction <Integer,Double> tdf = (a,b) -> a+b;
        maps.forEach((k,v) -> System.out.println(tdf.applyAsDouble(k,v)));

        System.out.println("==========  toDoubleBiFunction  ==========");

        ToDoubleBiFunction <Integer, Integer> ob = Integer::sum;
        System.out.println(ob.applyAsDouble(10,5));


        System.out.println("==========  negate  ==========");
        DoubleStream ds = DoubleStream.of(12.1,12.2,12.7,12.5,12.8);
        DoublePredicate dp = d -> d==12.5;
        DoublePredicate dps = dp.negate().and(d->d>12.5);
        ds.filter(dps).forEach(d -> System.out.println((int)d));


        System.out.println("==========  IntBinaryOperator  ==========");
        IntBinaryOperator ibo = Integer::compare;
        int x = ibo.applyAsInt(8,9);
        System.out.println(x);

        System.out.println("==========  compose  ==========");

        Function<Double,Integer> mul = d->d.intValue();
        Function<Integer,String> f = in ->in.toString();

        Function<Double,String> func = f.compose(mul);

        System.out.println(func.apply(12.6).length());
    }
}
