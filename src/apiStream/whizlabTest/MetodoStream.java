package apiStream.whizlabTest;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MetodoStream implements Closeable {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("OCAJP","OCM","OCA","OCEA");
        Optional<String> ops = stream.findAny();
        ops.ofNullable(null).ifPresent(System.out::println);
        System.out.println(ops);

        System.out.println("==========  Collectors.joining  ==========");

        List ints = new ArrayList<>();
        ints.add("x");
        ints.add("y");
        ints.add("z");

        System.out.println(ints.stream().collect(Collectors.joining()));

        System.out.println("==========  Collectors.toSet  ==========");
        Stream<String> stream1 = Stream.of("Cat","Dog","Rat");
        Stream<Integer> list = stream1.flatMap(s->Stream.of(s.length()));
        System.out.println(list.collect(Collectors.toSet())); //elimina elementos duplicados
    }

    @Override
    public void close(){

    }
}
