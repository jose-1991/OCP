import java.util.*;
import java.util.stream.Stream;

public class TreeSetExample {
    public static void main(String[] args) {
        Set set = new TreeSet<>();
        set.add("A");
        set.add("B");
        set.remove("A");
        System.out.println(set);

        System.out.println("================ TreeMap ================");

        TreeMap<String,String> tmap= new TreeMap<>();
        tmap.put("1","A");
        tmap.put("2","Vamos");
        tmap.put("3","C");
        tmap.put("4","D");

        System.out.println(tmap.ceilingKey("3-01"));

        System.out.println("================ Comparator ================");
        Comparator comp = Comparator.nullsFirst(Integer::compare);
        System.out.println(comp.compare(null,10));

        System.out.println("================ Optional ================");
        String[] in = new String[3];
        Optional<String> op1 = Optional.ofNullable(in[2]);
        System.out.println(op1);

        System.out.println("================ Stream ================");
        Stream ints = Stream.of(1,2,3);
        long i = ints.skip(1).limit(1).count();
        System.out.println(i);

    }
}
