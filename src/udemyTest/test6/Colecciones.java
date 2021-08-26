package udemyTest.test6;

import java.util.*;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;



class Printer<T extends String>{}
public class Colecciones {

    public static void main(String[] args) {

        System.out.println("======== LongStream ========");
        LongStream stream = LongStream.empty();
        System.out.println(stream.average());

        System.out.println("======== Printer ========");
        Printer<String> printer = new Printer<>();
        System.out.println(printer);

        System.out.println("======== peek ========");
        Stream.of(true, false, true).map(b -> b.toString()
                .toUpperCase()).peek(System.out::println);

        System.out.println("======== HashSet ========");
        Set<String> set = new HashSet<>(Arrays.asList(null,null,null));
        long count = set.stream().count();
        System.out.println(count);

        System.out.println("======== Arrays.stream ========");
        String [] names = {"Peter", "bonita", "John"};
        Arrays.stream(names).sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
                .forEach(System.out::println);

        System.out.println("======== Arrays Deque ========");
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(100);
        deque.add(200);
        deque.addFirst(300);
        deque.addLast(400);
        deque.remove(200);

        System.out.println(deque.getFirst());


        List<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("abc"));
        list.add(new StringBuilder("xyz"));
        list.stream().map(x -> x.reverse());
        System.out.println(list);

        IntConsumer consumer = i -> System.out.println(i * i * i);
        int result = IntStream.range(1, 5).sum();
        System.out.println(result);

        LongStream.iterate(0, i -> i + 2).limit(4).forEach(System.out::print);

    }
}
