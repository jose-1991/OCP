package udemyTest.test2;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;


class Outer {
    public void print(int y) {
        final int[] x = {10};
        x[0] = 20;
        class Inner {
            public void getX() {
                System.out.println(++x[0]);
            }
        }
        Inner inner = new Inner();
        inner.getX();
    }
}
public class InnerClass {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("T", "S", "R", "I", "F");
        ListIterator<String> iter = list.listIterator();
        while(iter.hasNext()) {
            System.out.print(iter.next());
        }
        System.out.println(new Object() {
            public String toString() {
                return "Anonymous";
            }
        });
        new Outer().print(100);
        int res = 1;
        IntStream stream = IntStream.rangeClosed(1, 4);

        System.out.println(stream.reduce(1, (i, j) -> i * j));
        System.out.println(IntStream.range(10,1).count());
    }
}
