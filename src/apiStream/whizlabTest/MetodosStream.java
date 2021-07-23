package apiStream.whizlabTest;

import com.sun.xml.internal.stream.StaxErrorReporter;

import java.net.Inet4Address;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MetodosStream {
    public static void main(String[] args) {

        System.out.println("============= Collectors =============");
        Stream list3 = Stream.of("BB","CCC","AB","CCC","BB");
        System.out.println(list3.collect(Collectors.toSet())); //collector.toSet =. elimina duplicados

        System.out.println("============= anyMatch =============");
        Stream list5 = Stream.of("ABC","aBB","abCC","ab","acC");
        Map<Boolean,List<String>> map = (Map<Boolean, List<String>>) list5.collect(Collectors.partitioningBy((String s) -> s.startsWith("ab")));
        System.out.println(map);

        System.out.println("============= max =============");
        Stream<String> st3 = Stream.of("abc","ab");
        System.out.println(st3.max((s1,s2)-> Integer.compare(s2.length(),s1.length())));


        System.out.println("============= AnyMatch =============");
        Stream <Integer> st = Stream.of(4,10,8,3);
        System.out.println(st.peek(System.out::print).anyMatch(x-> x>+10));

        System.out.println("============= put => set =============");
        Map<Integer,Double> map2 = new HashMap<>();
        map2.put(1,1.1);
        map2.put(1,3.3);
        System.out.println(map);

        System.out.println("============= anyMatch =============");
        Stream <String> nom = Stream.of("10","20","30");
       nom.forEach(s-> System.out.println(s.length()));

        System.out.println("============= Min optional =============");
        Stream<Integer> st1 = Stream.of(12,40,11,22);
        Optional<Integer> min = st1.filter(p->p%2==0).min(Integer::compareTo);
        System.out.println(min);




        System.out.println("============= Average =============");
        IntStream ints = IntStream.of(3,2,1,5,3,4,5);
        double ints2 = ints.filter(e->e>3).distinct().average().getAsDouble(); //average devuelve un optional double
        System.out.println(ints2);

        System.out.println("============= MapToInt =============");
        Stream<Double> stream1 = Stream.of(2.2,2.3,2.5,1.2,1.4);
        IntStream integerStream = stream1.mapToInt(Double::intValue);
        System.out.println(integerStream.distinct().count());
        //integerStream.forEach(System.out::println);
        integerStream.close();

        System.out.println("============= flatMap =============");
        List<String> list = Arrays.asList("1Z0-809","1Z0-810","1Z1-811","1Z0-803");
        List<String> list2 = list.stream().flatMap(e -> Stream.of(e.split("-")))
                .distinct().sorted().collect(Collectors.toList());
        System.out.println(list2);

        System.out.println("=============  Boxed =============");
        IntStream ds = IntStream.of(1,2,2,4);
        Stream<String> ste = ds.boxed().map(integer -> integer.toString());  //boxed envuelve los elemntos en INTEGER
        System.out.println(ste.distinct().findFirst());


        System.out.println("=============  FindAny =============");
        Stream<String> stream = Stream.of("A", "AB", "ABC", "ABCD", "AB");
        String out = stream.filter(s -> s.length()>2)
                .filter(s -> s.indexOf("C")> -1)
                .findAny().orElse("NONE");

        System.out.println(out);


        System.out.println("=============  peek - findAny =============");

        stream = Stream.of("A","B","C","D");
        System.out.println(stream.peek(System.out::print).findAny().orElse("NA"));

        System.out.println("============= skip - count =============");
        Stream ints1 = Stream.of("A","B","C","D");
        ints1.peek(System.out::print).skip(2).count();

    }
}
