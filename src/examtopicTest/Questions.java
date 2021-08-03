package examtopicTest;

import java.util.*;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

class Vehicle{
    int distance;
    Vehicle(int x){
        this.distance = x;
    }
    public void increSpeed(int time){
        int timeTravel = time;

        class Car{
            int value = 0;
            public void speed(){
                value = distance/timeTravel;
                System.out.println("nueva Velocidad: "+value+"Kmph");
            }
        }
        new Car().speed();
    }
}

public class Questions {
    public static void main(String[] args) {
        System.out.println("=========== Question #1 ==========");
        Vehicle v = new Vehicle(100);
        v.increSpeed(60);

        System.out.println("=========== Question #2 ==========");
        IntStream stream = IntStream.of(1,2,3);
        IntFunction<IntUnaryOperator> inFun= x-> y->x*y;
        IntStream newStream = stream.map(inFun.apply(10));
        newStream.forEach(System.out::print);

        System.out.println("\n=========== Question #3 ==========");
        List<Integer> values = Arrays.asList(1,2,3);
        values.stream().map(n->n*2).peek(System.out::print).count();

        System.out.println("\n=========== Question #4 ==========");
        Map<Integer, String> unsortMap = new HashMap<>();
        unsortMap.put(10,"z");
        unsortMap.put(5,"b");
        unsortMap.put(1,"d");
        unsortMap.put(7,"e");
        unsortMap.put(50,"j");


        Map<Integer,String> treeMap = new TreeMap<>((o1, o2) -> o2.compareTo(o1));
        treeMap.putAll(unsortMap);
        for (Map.Entry<Integer,String> entry: treeMap.entrySet()){
            System.out.print(entry.getValue());
        }
    }

}
