package apiStream.whizlabTest;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MetodosStream {
    public static void main(String[] args) {

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
