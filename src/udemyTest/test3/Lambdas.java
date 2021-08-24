package udemyTest.test3;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;


public class Lambdas {
    public static void main(String[] args) {
        BiPredicate<String, String> predicate = (a,b)-> a.contains(b) ;
        BiFunction<String, String, Boolean> func = (str1, str2) -> {
            return predicate.test(str1, str2) ? true : false;
        };

        System.out.println(func.apply("Tomato", "at"));
        System.out.printf("%2$d + %1$d", 10, 20);


        Supplier<StringBuilder> supplier = () -> new StringBuilder(" olleH")
                .reverse().append("!dlroW").reverse();
        System.out.println(supplier.get());

        List<String> list = new ArrayList<>(Arrays.asList("A", "E", "I", "O")); //Line 8
        list.add("U"); //Line 9
        list.forEach(System.out::print);


        Path path = Paths.get("F:", "user", "..", "udayan..");
        System.out.println(path.normalize());

        System.out.format("A%nB%nC");


        int res = IntStream.rangeClosed(1, 1000).parallel()
                .filter( i -> i > 50).findFirst().getAsInt();
        System.out.println(res);

        List<Integer> list2 = Arrays.asList(10, 100, 1000);
        list2.replaceAll(i -> -i++);

        System.out.println(list2);
    }
}
