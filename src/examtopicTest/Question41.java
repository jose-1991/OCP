package examtopicTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
interface Rideable {Car getCar (String name); }
class Car {
    private String name;
    public Car (String name) {
        this.name = name;
    }
}
public class Question41 {
    public static void main(String[] args) {
        List<String> str = Arrays.asList ("my", "pen", "is", "your", "pen");
                Predicate<String> test = s -> {
                    int i = 0;
                    boolean result = s.contains ("pen");
                    System.out.print((i++) + ":");
                    return result;
                };
        str.stream()
                .filter(test)
                .findFirst()
                .ifPresent(System.out ::println);

        System.out.println("================= #46 ==============");

        List<Integer> nums = Arrays.asList (10, 20, 8);
        System.out.println (nums.stream().max(Comparator.comparing(a->a)).get());
    }
}
