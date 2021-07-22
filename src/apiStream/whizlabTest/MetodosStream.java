package apiStream.whizlabTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MetodosStream {
    public static void main(String[] args) {
        System.out.println("============= MapToInt =============");
        Stream<Double> stream1 = Stream.of(2.2,2.3,2.5);
        IntStream integerStream = stream1.mapToInt(Double::intValue);
       // System.out.println(integerStream.distinct().count());
        integerStream.forEach(System.out::println);
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

    }
}
