package estructuraDeDatos;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetAdd {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>((a, b) -> b.compareTo(a)); // en orden descendente

        words.add("uno");
        words.add("dos");
        words.add("tres");
        words.add("cuatro");
        words.add("cinco");

        System.out.println("ts = " + words);

        Set<Integer> numbers = new TreeSet<>(Comparator.reverseOrder()); // en orden descendente

        numbers.add(1);
        numbers.add(4);
        numbers.add(7);
        numbers.add(5);
        numbers.add(2);
        numbers.add(10);

        System.out.println("numbers = " + numbers);
    }
}
