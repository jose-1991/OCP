package apiStream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjecucionStreamRange {
    public static void main(String[] args) {


        IntStream num = IntStream.range(5,20); //end exclusivo   rangeClosed => end inclusivo


//      int resultado = num.reduce(0, Integer::sum);
//      int resultado = num.sum();    solo disponible en IntStream
        IntSummaryStatistics stats = num.summaryStatistics();
        System.out.println("max: "+ stats.getMax());
        System.out.println("min: "+ stats.getMin());
        System.out.println("suma: "+ stats.getSum());
        System.out.println("promedio: "+ stats.getAverage());
        System.out.println("total elementos: "+ stats.getCount());




    }
}
