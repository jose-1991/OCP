package udemyTest.test1;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.IntStream;

class Point {
    int x;
    int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

    boolean filter() {
        return this.x == this.y;
    }

}
public class Flujos {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-80, 100, -40, 25, 200);
        Predicate<Integer> predicate = num -> {
            int ctr = 1;
            boolean result = num > 0;
            System.out.print(ctr++ + ".");
            return result;
        };

        list.stream().filter(predicate).forEach(System.out::println);

        System.out.println("=============  Iterator  =============");

        List<String> list1 = Arrays.asList("T", "S", "R", "I", "F");
        ListIterator<String> iter = list1.listIterator(2);
        while(iter.hasNext()) {
            System.out.print(iter.next());
        }

        System.out.println("\n=============  super generic  =============");
        List<? super String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        for(Integer str : list) {
            System.out.print(str);
        }

        System.out.println("\n=============  point filter  =============");
        List<Point> list3 = new ArrayList<>();
        list3.add(new Point(0, 0));
        list3.add(new Point(1, 2));
        list3.add(new Point(-1, -1));

        list3.stream().filter(Point::filter).forEach(System.out::println); //Line n1

        System.out.println("\n=============  parallel  =============");
        IntStream.rangeClosed(1, 10).parallel()
                .forEachOrdered(System.out::println);


        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "ONE");
        map.put(2, "TWO");
        map.put(3, "THREE");

        System.out.println(map);
    }

}
