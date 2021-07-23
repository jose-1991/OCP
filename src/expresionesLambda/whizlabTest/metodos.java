package expresionesLambda.whizlabTest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class metodos {
    public static void main(String[] args) {
        System.out.println("===========  Stream => ToIntFuntion  ===========");

        Stream<Double> dbls = Stream.of(10.0,20.1,30.2);
        ToIntFunction<Double> lif = d -> d.intValue();
        Stream<Integer> ints = dbls.mapToInt(lif).boxed();

        ints.forEach(System.out::print);

        System.out.println("===========  and (predicate)  ===========");
        List<Integer> ins = new ArrayList<>();
        ins.add(3);
        ins.add(10);
        ins.add(11);
        ins.add(5);

        Predicate<Integer> p = i->i>5;
        Predicate<Integer> p2 = p.and(i-> i<10);

        System.out.println(ins.removeIf(p2));

        System.out.println("===========  Range - Stream.sum  ===========");
        IntStream str = IntStream.range(1,5);
        IntConsumer cons = System.out::println;
        cons.accept(str.sum());

        System.out.println("===========  OperadorBinario  ===========");
        BinaryOperator<Integer> bp = Integer::rotateLeft;


        System.out.println(bp.apply(1,2));

    }
}