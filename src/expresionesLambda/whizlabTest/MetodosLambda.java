package expresionesLambda.whizlabTest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MetodosLambda {
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

        System.out.println("============= andThen =============");

        Function<String,Double> f = Double::parseDouble;
        System.out.println(f.andThen(s-> s*2).apply("1"));

        System.out.println("============= DoubleSupplier =============");
        DoubleSupplier sups = () -> Math.random()*10;
        System.out.println(sups.getAsDouble());

        System.out.println("=============  Compose =============");
        Function<String,Double> fun = Double::parseDouble;
        Double d = fun.compose((String s) -> s+".01").andThen(s->s*2).apply("1");
        System.out.println(d);

        System.out.println("=============  Compose =============");
        Function<Integer, String> funny = s->s.toString();
        Function<String, String> fun2 = funny.andThen((String s) -> s+"2").compose((String s) -> Integer.parseInt(s));

        System.out.println(fun2.apply("10"));

        System.out.println("=============  Negate =============");
        String in = "whizlab";
        Predicate<String> pe = s->s.indexOf("i")>0;
        System.out.println(pe.and(s->s.length()>4).negate().test(in));
        System.out.println(pe.negate().or(s->s.length()>4).test(in));



    }
}
