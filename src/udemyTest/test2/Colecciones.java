package udemyTest.test2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Colecciones {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Melon");
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Mango");
        List<String> list2 = new CopyOnWriteArrayList<>(list1);
        for(String s : list2) {
            if(s.startsWith("M")){
                list2.remove(s);
            }
        }
        System.out.println(list1);
        System.out.println(list2);

        System.out.println("============ Map ==========");
        Map<Integer, Integer> map = new LinkedHashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        BiConsumer<Integer, Integer> consumer = (k, v) -> {
            System.out.println(k + ":" + v);
        };

        BiFunction<Integer, Integer, Integer> function = (k, v) -> {
            System.out.println(k + ":" + v);
            return null;
        };

        map.forEach(consumer);
    }
}
