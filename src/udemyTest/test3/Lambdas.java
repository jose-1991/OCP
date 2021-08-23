package udemyTest.test3;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Lambdas {
    public static void main(String[] args) {
        BiPredicate<String, String> predicate = (a,b)-> a.contains(b) ;
        BiFunction<String, String, Boolean> func = (str1, str2) -> {
            return predicate.test(str1, str2) ? true : false;
        };

        System.out.println(func.apply("Tomato", "at"));
    }
}
